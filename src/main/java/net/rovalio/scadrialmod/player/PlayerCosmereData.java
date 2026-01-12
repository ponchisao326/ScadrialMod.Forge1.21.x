package net.rovalio.scadrialmod.player;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.RandomSource;
import net.minecraftforge.common.capabilities.AutoRegisterCapability;
import net.rovalio.scadrialmod.registry.MetalType;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

@AutoRegisterCapability
public class PlayerCosmereData {

    // Constantes NBT para evitar errores de escritura (Typos)
    private static final String TAG_FULL_ALLOMANCER = "FullAllomancer";
    private static final String TAG_FULL_FERUCHEMIST = "FullFeruchemist";
    private static final String TAG_NO_POWERS = "NoPowers";
    private static final String TAG_INVESTITURE = "InvestitureUEA";
    private static final String TAG_SPIRIT_SIZE = "SpiritWebSize";
    private static final String TAG_SPIRIT_INTEGRITY = "SpiritWebIntegrity";
    private static final String TAG_SPIRIT_AWAKENED = "SpiritWebAwakened";
    private static final String TAG_INITIALIZED = "Initialized";
    private static final String TAG_RESERVES = "MetalReserves";
    private static final String TAG_ALLOMANTIC_METALS = "AllomanticMetals";
    private static final String TAG_FERUCHEMICAL_METALS = "FeruchemicalMetals";

    // Variables de instancia
    private final EnumSet<MetalType> allomanticMetals = EnumSet.noneOf(MetalType.class);
    private final EnumSet<MetalType> feruchemicalMetals = EnumSet.noneOf(MetalType.class);

    // OPTIMIZACIÓN: EnumMap es mucho más eficiente que HashMap para claves Enum
    private final EnumMap<MetalType, Integer> metalReserves = new EnumMap<>(MetalType.class);

    private boolean fullAllomancer;
    private boolean fullFeruchemist;
    private double investitureUEA;
    private boolean noPowers;

    private int spiritWebSize;
    private int spiritWebIntegrity;
    private boolean spiritWebAwakened;
    private boolean initialized;

    // --- GETTERS ---
    public boolean hasNoPowers() { return this.noPowers; }

    public boolean hasAllomancy() {
        return !this.noPowers && (this.fullAllomancer || !this.allomanticMetals.isEmpty());
    }

    public boolean hasFeruchemy() {
        return !this.noPowers && (this.fullFeruchemist || !this.feruchemicalMetals.isEmpty());
    }

    public boolean isFullAllomancer() { return this.fullAllomancer; }
    public boolean isFullFeruchemist() { return this.fullFeruchemist; }

    public EnumSet<MetalType> getAllomanticMetals() { return this.allomanticMetals; }
    public EnumSet<MetalType> getFeruchemicalMetals() { return this.feruchemicalMetals; }
    public double getInvestitureUEA() { return this.investitureUEA; }
    public int getSpiritWebSize() { return this.spiritWebSize; }
    public int getSpiritWebIntegrity() { return this.spiritWebIntegrity; }
    public boolean isSpiritWebAwakened() { return this.spiritWebAwakened; }
    public boolean isInitialized() { return this.initialized; }

    // --- LOGIC ---
    public void initializeIfNeeded(RandomSource random) {
        if (!this.initialized) {
            CosmerePowerAssigner.assignInitialData(this, random);
            this.initialized = true;
        }
    }

    // --- SETTERS ---
    // Usamos 'this.' explícitamente para claridad y evitar confusiones
    public void setNoPowers(boolean noPowers) {
        this.noPowers = noPowers;
        if (noPowers) {
            this.fullAllomancer = false;
            this.fullFeruchemist = false;
            this.allomanticMetals.clear();
            this.feruchemicalMetals.clear();
        }
    }

    public void setFullAllomancer(boolean fullAllomancer) {
        if (this.noPowers) return;
        this.fullAllomancer = fullAllomancer;
        if (fullAllomancer) this.allomanticMetals.clear();
    }

    public void setFullFeruchemist(boolean fullFeruchemist) {
        if (this.noPowers) return;
        this.fullFeruchemist = fullFeruchemist;
        if (fullFeruchemist) this.feruchemicalMetals.clear();
    }

    public void addAllomanticMetal(MetalType metal) {
        if (!this.fullAllomancer && !this.noPowers) {
            this.allomanticMetals.add(metal);
        }
    }

    public void addFeruchemicalMetal(MetalType metal) {
        if (!this.fullFeruchemist && !this.noPowers) {
            this.feruchemicalMetals.add(metal);
        }
    }

    public void setInvestitureUEA(double investitureUEA) { this.investitureUEA = investitureUEA; }
    public void setSpiritWebSize(int spiritWebSize) { this.spiritWebSize = spiritWebSize; }

    public void setSpiritWebIntegrity(int spiritWebIntegrity) {
        this.spiritWebIntegrity = Math.max(0, Math.min(100, spiritWebIntegrity));
    }

    public void awakenSpiritWeb() { this.spiritWebAwakened = true; }
    public void markInitialized() { this.initialized = true; }

    // Gestión de Reservas
    public void clearReserves() { this.metalReserves.clear(); }

    public void setReserve(MetalType type, int amount) {
        this.metalReserves.put(type, amount);
    }

    public int getReserve(MetalType type) {
        return this.metalReserves.getOrDefault(type, 0);
    }

    // --- NBT (GUARDADO) ---
    public void saveNBT(CompoundTag tag) {
        tag.putBoolean(TAG_FULL_ALLOMANCER, this.fullAllomancer);
        tag.putBoolean(TAG_FULL_FERUCHEMIST, this.fullFeruchemist);
        tag.putBoolean(TAG_NO_POWERS, this.noPowers);
        tag.putDouble(TAG_INVESTITURE, this.investitureUEA);
        tag.putInt(TAG_SPIRIT_SIZE, this.spiritWebSize);
        tag.putInt(TAG_SPIRIT_INTEGRITY, this.spiritWebIntegrity);
        tag.putBoolean(TAG_SPIRIT_AWAKENED, this.spiritWebAwakened);
        tag.putBoolean(TAG_INITIALIZED, this.initialized);

        CompoundTag reservesTag = new CompoundTag();
        this.metalReserves.forEach((metal, amount) -> {
            reservesTag.putInt(metal.name(), amount);
        });
        tag.put(TAG_RESERVES, reservesTag);

        tag.putIntArray(TAG_ALLOMANTIC_METALS, this.allomanticMetals.stream().mapToInt(Enum::ordinal).toArray());
        tag.putIntArray(TAG_FERUCHEMICAL_METALS, this.feruchemicalMetals.stream().mapToInt(Enum::ordinal).toArray());
    }

    public void loadNBT(CompoundTag tag) {
        this.fullAllomancer = tag.getBoolean(TAG_FULL_ALLOMANCER);
        this.fullFeruchemist = tag.getBoolean(TAG_FULL_FERUCHEMIST);
        this.noPowers = tag.getBoolean(TAG_NO_POWERS);
        this.investitureUEA = tag.getDouble(TAG_INVESTITURE);
        this.spiritWebSize = tag.getInt(TAG_SPIRIT_SIZE);
        this.spiritWebIntegrity = tag.getInt(TAG_SPIRIT_INTEGRITY);
        this.spiritWebAwakened = tag.getBoolean(TAG_SPIRIT_AWAKENED);
        this.initialized = tag.getBoolean(TAG_INITIALIZED);

        this.metalReserves.clear();
        if (tag.contains(TAG_RESERVES)) {
            CompoundTag reservesTag = tag.getCompound(TAG_RESERVES);
            for (String key : reservesTag.getAllKeys()) {
                try {
                    MetalType type = MetalType.valueOf(key);
                    this.metalReserves.put(type, reservesTag.getInt(key));
                } catch (IllegalArgumentException e) {
                    // Ignorar metales que ya no existan (versioning safety)
                }
            }
        }

        this.allomanticMetals.clear();
        this.feruchemicalMetals.clear();

        for (int i : tag.getIntArray(TAG_ALLOMANTIC_METALS)) {
            if (i >= 0 && i < MetalType.values().length) {
                this.allomanticMetals.add(MetalType.values()[i]);
            }
        }
        for (int i : tag.getIntArray(TAG_FERUCHEMICAL_METALS)) {
            if (i >= 0 && i < MetalType.values().length) {
                this.feruchemicalMetals.add(MetalType.values()[i]);
            }
        }
    }
}