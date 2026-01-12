package net.rovalio.scadrialmod.player;

import net.minecraft.util.RandomSource;
import net.rovalio.scadrialmod.registry.MetalType;

public class CosmerePowerAssigner {

    public static void assignInitialData(PlayerCosmereData data, RandomSource random) {

        data.setNoPowers(false);
        data.setFullAllomancer(false);
        data.setFullFeruchemist(false);
        data.getAllomanticMetals().clear();
        data.getFeruchemicalMetals().clear();

        // nextInt(9) genera de 0 a 8
        int roll = random.nextInt(9);

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
        MetalType[] values = MetalType.values();
        return values[random.nextInt(values.length)];
    }

    private static double calculateInvestiture(PlayerCosmereData data, RandomSource random) {
        // Ordenamos de MÁS específico (Fullborn) a MENOS específico para evitar errores lógicos

        if (data.hasNoPowers()) {
            return 1.0; // Drab o similar
        }

        // Fullborn (Nacido completo)
        if (data.isFullAllomancer() && data.isFullFeruchemist()) {
            return 15 + random.nextDouble() * 5;
        }
        // Full Allomancer (Nacido de la bruma) o Full Feruchemist
        if (data.isFullAllomancer() || data.isFullFeruchemist()) {
            return 10 + random.nextDouble() * 4;
        }
        // Twinborn (Nacidoble: tiene ambos pero no full)
        if (data.hasAllomancy() && data.hasFeruchemy()) {
            return 8 + random.nextDouble() * 2;
        }
        // Misting o Ferring (Solo uno de los dos y no full)
        if (data.hasAllomancy() || data.hasFeruchemy()) {
            return 4 + random.nextDouble() * 4;
        }

        return 4.0; // Fallback
    }

    private static int calculateSpiritWebBase(PlayerCosmereData data) {
        if (data.isFullAllomancer() && data.isFullFeruchemist()) return 20;
        if (data.isFullAllomancer() && !data.hasFeruchemy()) return 19;
        if (!data.hasAllomancy() && data.isFullFeruchemist()) return 19;
        if (data.isFullAllomancer() || data.isFullFeruchemist()) return 18;

        if (data.hasAllomancy() && data.hasFeruchemy()) return 15; // Twinborn fuerte
        if (data.hasAllomancy() && !data.hasFeruchemy()) return 13;

        if (!data.hasAllomancy() && !data.hasFeruchemy()) return 11; // Normal human

        return 12; // Misting/Ferring promedio
    }
}