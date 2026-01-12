package net.rovalio.scadrialmod.player;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.RandomSource;
import net.minecraftforge.common.capabilities.AutoRegisterCapability;
import net.rovalio.scadrialmod.registry.MetalType;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

@AutoRegisterCapability
public class PlayerCosmereData {

    private final EnumSet<MetalType> allomanticMetals = EnumSet.noneOf(MetalType.class);
    private final EnumSet<MetalType> feruchemicalMetals = EnumSet.noneOf(MetalType.class);

    private boolean fullAllomancer;
    private boolean fullFeruchemist;
    private double investitureUEA;
    private boolean noPowers; // Si es true, es un Drab o alguien sin nada

    private int spiritWebSize;
    private int spiritWebIntegrity;
    private boolean spiritWebAwakened;
    private boolean initialized;

    // --- GETTERS ---

    public boolean hasNoPowers() {
        return noPowers;
    }

    public boolean hasAllomancy() {
        return !noPowers && (fullAllomancer || !allomanticMetals.isEmpty());
    }

    public boolean hasFeruchemy() {
        return !noPowers && (fullFeruchemist || !feruchemicalMetals.isEmpty());
    }

    public boolean isFullAllomancer() { return fullAllomancer; }
    public boolean isFullFeruchemist() { return fullFeruchemist; }

    public EnumSet<MetalType> getAllomanticMetals() { return allomanticMetals; }
    public EnumSet<MetalType> getFeruchemicalMetals() { return feruchemicalMetals; }

    public double getInvestitureUEA() { return investitureUEA; }
    public int getSpiritWebSize() { return spiritWebSize; }
    public int getSpiritWebIntegrity() { return spiritWebIntegrity; }
    public boolean isSpiritWebAwakened() { return spiritWebAwakened; }
    public boolean isInitialized() { return initialized; }

    // --- LOGIC ---

    public void initializeIfNeeded(RandomSource random) {
        if (!initialized) {
            CosmerePowerAssigner.assignInitialData(this, random);
            this.initialized = true;
        }
    }

    // --- SETTERS ---

    public void setNoPowers(boolean value) {
        this.noPowers = value;
        if (value) {
            this.fullAllomancer = false;
            this.fullFeruchemist = false;
            this.allomanticMetals.clear();
            this.feruchemicalMetals.clear();
        }
    }

    public void setFullAllomancer(boolean value) {
        if (noPowers) return; // No puede serlo si no tiene poderes
        this.fullAllomancer = value;
        if (value) allomanticMetals.clear();
    }

    public void setFullFeruchemist(boolean value) {
        if (noPowers) return;
        this.fullFeruchemist = value;
        if (value) feruchemicalMetals.clear();
    }

    public void addAllomanticMetal(MetalType metal) {
        if (!fullAllomancer && !noPowers) {
            allomanticMetals.add(metal);
        }
    }

    public void addFeruchemicalMetal(MetalType metal) {
        if (!fullFeruchemist && !noPowers) {
            feruchemicalMetals.add(metal);
        }
    }

    public void setInvestitureUEA(double value) { this.investitureUEA = value; }
    public void setSpiritWebSize(int value) { this.spiritWebSize = value; }
    public void setSpiritWebIntegrity(int value) { this.spiritWebIntegrity = Math.max(0, Math.min(100, value)); }
    public void awakenSpiritWeb() { this.spiritWebAwakened = true; }
    public void markInitialized() { this.initialized = true; }

    private final Map<MetalType, Integer> metalReserves = new HashMap<>();

    public void clearReserves() {
        metalReserves.clear();
    }

    // --- NBT (GUARDADO) ---

    public void saveNBT(CompoundTag tag) {
        tag.putBoolean("FullAllomancer", fullAllomancer);
        tag.putBoolean("FullFeruchemist", fullFeruchemist);
        tag.putBoolean("NoPowers", noPowers);
        tag.putDouble("InvestitureUEA", investitureUEA);
        tag.putInt("SpiritWebSize", spiritWebSize);
        tag.putInt("SpiritWebIntegrity", spiritWebIntegrity);
        tag.putBoolean("SpiritWebAwakened", spiritWebAwakened);
        tag.putBoolean("Initialized", initialized);

        CompoundTag reservesTag = new CompoundTag();
        metalReserves.forEach((metal, amount) -> {
            reservesTag.putInt(metal.name(), amount);
        });
        tag.put("MetalReserves", reservesTag);

        tag.putIntArray("AllomanticMetals", allomanticMetals.stream().mapToInt(Enum::ordinal).toArray());
        tag.putIntArray("FeruchemicalMetals", feruchemicalMetals.stream().mapToInt(Enum::ordinal).toArray());
    }

    public void loadNBT(CompoundTag tag) {
        fullAllomancer = tag.getBoolean("FullAllomancer");
        fullFeruchemist = tag.getBoolean("FullFeruchemist");
        noPowers = tag.getBoolean("NoPowers");
        investitureUEA = tag.getDouble("InvestitureUEA");
        spiritWebSize = tag.getInt("SpiritWebSize");
        spiritWebIntegrity = tag.getInt("SpiritWebIntegrity");
        spiritWebAwakened = tag.getBoolean("SpiritWebAwakened");
        initialized = tag.getBoolean("Initialized");

        metalReserves.clear();
        if (tag.contains("MetalReserves")) {
            CompoundTag reservesTag = tag.getCompound("MetalReserves");
            for (String key : reservesTag.getAllKeys()) {
                try {
                    MetalType type = MetalType.valueOf(key);
                    metalReserves.put(type, reservesTag.getInt(key));
                } catch (IllegalArgumentException e) {
                    // Ignorar metales que ya no existan
                }
            }
        }

        allomanticMetals.clear();
        feruchemicalMetals.clear();

        for (int i : tag.getIntArray("AllomanticMetals")) {
            if (i >= 0 && i < MetalType.values().length) allomanticMetals.add(MetalType.values()[i]);
        }
        for (int i : tag.getIntArray("FeruchemicalMetals")) {
            if (i >= 0 && i < MetalType.values().length) feruchemicalMetals.add(MetalType.values()[i]);
        }
    }
}