package net.rovalio.scadrialmod.player;

import net.minecraft.util.RandomSource;
import net.rovalio.scadrialmod.Config;
import net.rovalio.scadrialmod.registry.MetalType;

import java.util.NavigableMap;
import java.util.TreeMap;

public class CosmerePowerAssigner {

    private static final MetalType[] METAL_VALUES = MetalType.values();

    // Tabla de probabilidad. Clave = Peso acumulado, Valor = ID del switch
    private static final NavigableMap<Double, Integer> ARCHETYPE_WEIGHTS = new TreeMap<>();
    private static final double TOTAL_WEIGHT;

    static {
        // ID 0: Drab (Sin poderes) - 50%
        addArchetype(0, 50.0);
        // ID 1: Misting (1 Metal Alomántico) - 20%
        addArchetype(1, 20.0);
        // ID 2: Ferring (1 Metal Feruquímico) - 20%
        addArchetype(2, 20.0);
        // ID 3: Twinborn (1 de cada) - 5%
        addArchetype(3, 5.0);
        // ID 4: Mistborn (Full Alomancia) - 2%
        addArchetype(4, 2.0);
        // ID 5: Full Feruchemist - 2%
        addArchetype(5, 2.0);
        // ID 6: Mistborn + 1 Metal Feruquímico (Muy raro) - 0.5%
        addArchetype(6, 0.5);
        // ID 7: Full Feruchemist + 1 Metal Alomántico (Muy raro) - 0.5%
        addArchetype(7, 0.5);
        // ID 8: Fullborn (Dios) - 0.05%
        addArchetype(8, 0.05);

        TOTAL_WEIGHT = ARCHETYPE_WEIGHTS.lastKey();
    }

    // Helper para configurar los pesos limpiamente
    private static void addArchetype(int id, double weight) {
        double currentTotal = ARCHETYPE_WEIGHTS.isEmpty() ? 0 : ARCHETYPE_WEIGHTS.lastKey();
        ARCHETYPE_WEIGHTS.put(currentTotal + weight, id);
    }

    /**
     * Constructor privado para evitar instanciación
     */
    private CosmerePowerAssigner() {
        throw new IllegalStateException("Utility class");
    }

    public static void assignInitialData(PlayerCosmereData data, RandomSource random) {

        data.setNoPowers(false);
        data.setFullAllomancer(false);
        data.setFullFeruchemist(false);
        data.getAllomanticMetals().clear();
        data.getFeruchemicalMetals().clear();

        // nextInt(9) genera de 0 a 8
        int roll = rollArchetype(random);

        switch (roll) {
            case 0 -> data.setNoPowers(true);
            case 1 -> data.addAllomanticMetal(randomMetal(random));
            case 2 -> data.addFeruchemicalMetal(randomMetal(random));
            case 3 -> {
                data.addAllomanticMetal(randomMetal(random));
                data.addFeruchemicalMetal(randomMetal(random));
            }
            case 4 -> data.setFullAllomancer(true);
            case 5 -> data.setFullFeruchemist(true);
            case 6 -> {
                data.setFullAllomancer(true);
                data.addFeruchemicalMetal(randomMetal(random));
            }
            case 7 -> {
                data.setFullFeruchemist(true);
                data.addAllomanticMetal(randomMetal(random));
            }
            case 8 -> {
                data.setFullAllomancer(true);
                data.setFullFeruchemist(true);
            }
        }

        // Calculamos atributos secundarios
        double investiture = calculateInvestiture(data, random);
        data.setInvestitureUEA(investiture);

        int baseSpirit = calculateSpiritWebBase(data);
        data.setSpiritWebSize(baseSpirit + random.nextInt(3) - 1); // Variación de -1 a +1
        data.setSpiritWebIntegrity(100);

        data.markInitialized();
    }

    private static MetalType randomMetal(RandomSource random) {
        return METAL_VALUES[random.nextInt(METAL_VALUES.length)];
    }

    private static double calculateInvestiture(PlayerCosmereData data, RandomSource random) {
        if (data.hasNoPowers()) {
            return 1.0;
        }

        // Fullborn
        if (data.isFullAllomancer() && data.isFullFeruchemist()) {
            return Config.INVESTITURE_FULLBORN_BASE.get() + random.nextDouble() * 5.0;
        }
        // Mistborn o Full Feruchemist
        if (data.isFullAllomancer() || data.isFullFeruchemist()) {
            return Config.INVESTITURE_MISTBORN_BASE.get() + random.nextDouble() * 4.0;
        }
        // Twinborn
        if (data.hasAllomancy() && data.hasFeruchemy()) {
            return Config.INVESTITURE_TWINBORN_BASE.get() + random.nextDouble() * 2.0;
        }
        // Misting o Ferring
        if (data.hasAllomancy() || data.hasFeruchemy()) {
            return Config.INVESTITURE_MISTING_BASE.get() + random.nextDouble() * 4.0;
        }

        return Config.INVESTITURE_MISTING_BASE.get();
    }

    private static int calculateSpiritWebBase(PlayerCosmereData data) {
        // Obtenemos los valores desde la Configuración
        int valFullborn = Config.SPIRIT_FULLBORN.get();
        int valMistborn = Config.SPIRIT_MISTBORN.get();
        int valTwinborn = Config.SPIRIT_TWINBORN.get();
        int valMisting = Config.SPIRIT_MISTING.get();
        int valHuman = Config.SPIRIT_HUMAN.get();

        if (data.isFullAllomancer() && data.isFullFeruchemist()) return valFullborn;

        // Mistborn puro o Feruquímico puro
        if ((data.isFullAllomancer() && !data.hasFeruchemy()) ||
                (!data.hasAllomancy() && data.isFullFeruchemist())) return valMistborn;

        // Caso híbrido fuerte (Mistborn con un clavo, etc.) - Usamos un valor intermedio o el de Mistborn - 1
        if (data.isFullAllomancer() || data.isFullFeruchemist()) return valMistborn - 1;

        if (data.hasAllomancy() && data.hasFeruchemy()) return valTwinborn;
        if (data.hasAllomancy() || data.hasFeruchemy()) return valMisting;

        return valHuman;
    }

    private static int rollArchetype(RandomSource random) {
        // Genera un número entre 0 y el peso total
        double value = random.nextDouble() * TOTAL_WEIGHT;
        // Busca el escalón correspondiente
        return ARCHETYPE_WEIGHTS.ceilingEntry(value).getValue();
    }
}