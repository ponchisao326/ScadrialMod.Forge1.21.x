package net.rovalio.scadrialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rovalio.scadrialmod.ScadrialMod;
import net.rovalio.scadrialmod.block.ModBlocks;

public class ModCreativeModsTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScadrialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCADRIAL_TAB = CREATIVE_MOD_TABS.register("scadrial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCADRIAL_GLYPH.get()))
                    .title(Component.translatable("creativetab.scadrialmod.scadrial"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.COAL_DUST.get());
                        output.accept(ModItems.ALCOHOL.get());
                        output.accept(ModItems.WHISKY.get());
                        output.accept(ModItems.COD_LIVER.get());
                        output.accept(ModItems.COD_LIVER_OIL.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> METALURGY_TAB = CREATIVE_MOD_TABS.register("metalurgy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCADRIAL_GLYPH.get()))
                    .title(Component.translatable("creativetab.scadrialmod.metalurgy"))
                    .displayItems((itemDisplayParameters, output) -> {

                    //Ores
                        output.accept(Items.IRON_ORE);
                        output.accept(Items.DEEPSLATE_IRON_ORE);
                        output.accept(ModBlocks.CASSITERITE_ORE.get()); //Tin
                        output.accept(ModBlocks.DEEPSLATE_CASSITERITE_ORE.get());
                        output.accept(ModBlocks.SPHALERITE_ORE.get()); //Zinc
                        output.accept(ModBlocks.DEEPSLATE_SPHALERITE_ORE.get());
                        output.accept(Items.COPPER_ORE);
                        output.accept(Items.DEEPSLATE_COPPER_ORE);
                        output.accept(ModBlocks.CHROMITE_ORE.get()); //Chromite
                        output.accept(ModBlocks.DEEPSLATE_CHROMITE_ORE.get());
                        output.accept(ModBlocks.BAUXITE_ORE.get()); //Aluminium
                        output.accept(ModBlocks.DEEPSLATE_BAUXITE_ORE.get());
                        output.accept(ModBlocks.GREENOCKITE_ORE.get()); //Cadmium
                        output.accept(ModBlocks.DEEPSLATE_GREENOCKITE_ORE.get());
                        output.accept(Items.GOLD_ORE);
                        output.accept(Items.DEEPSLATE_GOLD_ORE);

                        output.accept(ModBlocks.GALENA_ORE.get()); //Lead
                        output.accept(ModBlocks.DEEPSLATE_GALENA_ORE.get());
                        output.accept(ModBlocks.STIBNITE_ORE.get()); //Antimony
                        output.accept(ModBlocks.DEEPSLATE_STIBNITE_ORE.get());
                        output.accept(ModBlocks.PENTLANDITE_ORE.get()); //Nickel
                        output.accept(ModBlocks.DEEPSLATE_PENTLANDITE_ORE.get());
                        output.accept(ModBlocks.QUARTZ_ORE.get()); //Silicon
                        output.accept(ModBlocks.DEEPSLATE_QUARTZ_ORE.get());
                        output.accept(ModBlocks.DOLOMITE_ORE.get()); //Magnesium
                        output.accept(ModBlocks.DEEPSLATE_DOLOMITE_ORE.get());
                        output.accept(ModBlocks.PYROLUSITE_ORE.get()); //Manganese
                        output.accept(ModBlocks.DEEPSLATE_PYROLUSITE_ORE.get());
                        output.accept(ModBlocks.BISMUTHINITE_ORE.get()); //Bismuth
                        output.accept(ModBlocks.DEEPSLATE_BISMUTHINITE_ORE.get());
                        output.accept(ModBlocks.ARGENTITE_ORE.get()); //Silver
                        output.accept(ModBlocks.DEEPSLATE_ARGENTITE_ORE.get());

                    //Raw Metal Blocks
                        output.accept(Items.RAW_IRON_BLOCK);
                        output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        output.accept(ModBlocks.RAW_ZINC_BLOCK.get());
                        output.accept(Items.RAW_COPPER_BLOCK);
                        output.accept(ModBlocks.RAW_CHROMIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_CADMIUM_BLOCK.get());
                        output.accept(Items.RAW_GOLD_BLOCK);

                        output.accept(ModBlocks.RAW_LEAD_BLOCK.get());
                        output.accept(ModBlocks.RAW_ANTIMONY_BLOCK.get());
                        output.accept(ModBlocks.RAW_NICKEL_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILICON_BLOCK.get());
                        output.accept(ModBlocks.RAW_MAGNESIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_MANGANESE_BLOCK.get());
                        output.accept(ModBlocks.RAW_BISMUTH_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());

                    //Raw Metals
                        output.accept(Items.RAW_IRON);
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.RAW_ZINC.get());
                        output.accept(Items.RAW_COPPER);
                        output.accept(ModItems.RAW_CHROMIUM.get());
                        output.accept(ModItems.RAW_ALUMINIUM.get());
                        output.accept(ModItems.RAW_CADMIUM.get());
                        output.accept(Items.RAW_GOLD);

                        output.accept(ModItems.RAW_LEAD.get());
                        output.accept(ModItems.RAW_ANTIMONY.get());
                        output.accept(ModItems.RAW_NICKEL.get());
                        output.accept(ModItems.RAW_SILICON.get());
                        output.accept(ModItems.RAW_MAGNESIUM.get());
                        output.accept(ModItems.RAW_MANGANESE.get());
                        output.accept(ModItems.RAW_BISMUTH.get());
                        output.accept(ModItems.RAW_SILVER.get());

                    //Mineral
                        output.accept(ModItems.CASSITERITE.get());
                        output.accept(ModItems.SPHALERITE.get());
                        output.accept(ModItems.CHROMITE.get());
                        output.accept(ModItems.BAUXITE.get());
                        output.accept(ModItems.GREENOCKITE.get());

                        output.accept(ModItems.GALENA.get());
                        output.accept(ModItems.STIBNITE.get());
                        output.accept(ModItems.PENTLANDITE.get());
                        output.accept(Items.QUARTZ);
                        output.accept(ModItems.DOLOMITE.get());
                        output.accept(ModItems.PYROLUSITE.get());
                        output.accept(ModItems.BISMUTHINITE.get());
                        output.accept(ModItems.ARGENTITE.get());

                    //Metal Blocks
                        output.accept(Items.IRON_BLOCK);
                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());
                        output.accept(ModBlocks.PEWTER_BLOCK.get());
                        output.accept(ModBlocks.ZINC_BLOCK.get());
                        output.accept(ModBlocks.BRASS_BLOCK.get());
                        output.accept(Items.COPPER_BLOCK);
                        output.accept(ModBlocks.BRONZE_BLOCK.get());
                        output.accept(ModBlocks.CHROMIUM_BLOCK.get());
                        output.accept(ModBlocks.NICROSIL_BLOCK.get());
                        output.accept(ModBlocks.ALUMUNIUM_BLOCK.get());
                        output.accept(ModBlocks.DURALUMIN_BLOCK.get());
                        output.accept(ModBlocks.CADMIUM_BLOCK.get());
                        output.accept(ModBlocks.BENDALLOY_BLOCK.get());
                        output.accept(Items.GOLD_BLOCK);
                        output.accept(ModBlocks.ELECTRUM_BLOCK.get());

                        output.accept(ModBlocks.LEAD_BLOCK.get());
                        output.accept(ModBlocks.ANTIMONY_BLOCK.get());
                        output.accept(ModBlocks.NICKEL_BLOCK.get());
                        output.accept(ModBlocks.SILICON_BLOCK.get());
                        output.accept(ModBlocks.MAGNESIUM_BLOCK.get());
                        output.accept(ModBlocks.MANGANESE_BLOCK.get());
                        output.accept(ModBlocks.BISMUTH_BLOCK.get());
                        output.accept(ModBlocks.SILVER_BLOCK.get());

                    //Metal Ingots
                        output.accept(Items.IRON_BLOCK);
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.PEWTER_INGOT.get());
                        output.accept(ModItems.ZINC_INGOT.get());
                        output.accept(ModItems.BRASS_INGOT.get());
                        output.accept(Items.COPPER_BLOCK);
                        output.accept(ModItems.BRONZE_INGOT.get());
                        output.accept(ModItems.CHROMIUM_INGOT.get());
                        output.accept(ModItems.NICROSIL_INGOT.get());
                        output.accept(ModItems.ALUMINIUM_INGOT.get());
                        output.accept(ModItems.DURALUMIN_INGOT.get());
                        output.accept(ModItems.CADMIUM_INGOT.get());
                        output.accept(ModItems.BENDALOY_INGOT.get());
                        output.accept(Items.GOLD_BLOCK);
                        output.accept(ModItems.ELECTRUM_INGOT.get());

                        output.accept(ModItems.LEAD_INGOT.get());
                        output.accept(ModItems.ANTIMONY_INGOT.get());
                        output.accept(ModItems.NICKEL_INGOT.get());
                        output.accept(ModItems.SILICON_INGOT.get());
                        output.accept(ModItems.MAGNESIUM_INGOT.get());
                        output.accept(ModItems.MANGANESE_INGOT.get());
                        output.accept(ModItems.BISMUTH_INGOT.get());
                        output.accept(ModItems.SILVER_INGOT.get());

                    //Metal nuggets
                        output.accept(Items.IRON_NUGGET);
                        output.accept(ModItems.STEEL_NUGGET.get());
                        output.accept(ModItems.TIN_NUGGET.get());
                        output.accept(ModItems.PEWTER_NUGGET.get());
                        output.accept(ModItems.ZINC_NUGGET.get());
                        output.accept(ModItems.BRASS_NUGGET.get());
                        output.accept(ModItems.COPPER_NUGGET.get());
                        output.accept(ModItems.BRONZE_NUGGET.get());
                        output.accept(ModItems.CHROMIUM_NUGGET.get());
                        output.accept(ModItems.NICROSIL_NUGGET.get());
                        output.accept(ModItems.ALUMINIUM_NUGGET.get());
                        output.accept(ModItems.DURALUMIN_NUGGET.get());
                        output.accept(ModItems.CADMIUM_NUGGET.get());
                        output.accept(ModItems.BENDALOY_NUGGET.get());
                        output.accept(Items.GOLD_NUGGET);
                        output.accept(ModItems.ELECTRUM_NUGGET.get());

                        output.accept(ModItems.LEAD_NUGGET.get());
                        output.accept(ModItems.ANTIMONY_NUGGET.get());
                        output.accept(ModItems.NICKEL_NUGGET.get());
                        output.accept(ModItems.SILICON_NUGGET.get());
                        output.accept(ModItems.MAGNESIUM_NUGGET.get());
                        output.accept(ModItems.MANGANESE_NUGGET.get());
                        output.accept(ModItems.BISMUTH_NUGGET.get());
                        output.accept(ModItems.SILVER_NUGGET.get());

                    //Metal Shavings
                        output.accept(ModItems.IRON_SHAVINGS.get());
                        output.accept(ModItems.STEEL_SHAVINGS.get());
                        output.accept(ModItems.TIN_SHAVINGS.get());
                        output.accept(ModItems.PEWTER_SHAVINGS.get());
                        output.accept(ModItems.ZINC_SHAVINGS.get());
                        output.accept(ModItems.BRASS_SHAVINGS.get());
                        output.accept(ModItems.COPPER_SHAVINGS.get());
                        output.accept(ModItems.BRONZE_SHAVINGS.get());
                        output.accept(ModItems.CHROMIUM_SHAVINGS.get());
                        output.accept(ModItems.NICROSIL_SHAVINGS.get());
                        output.accept(ModItems.ALUMINIUM_SHAVINGS.get());
                        output.accept(ModItems.DURALUMIN_SHAVINGS.get());
                        output.accept(ModItems.CADMIUM_SHAVINGS.get());
                        output.accept(ModItems.BENDALOY_SHAVINGS.get());
                        output.accept(ModItems.GOLD_SHAVINGS.get());
                        output.accept(ModItems.ELECTRUM_SHAVINGS.get());

                        output.accept(ModItems.LEAD_SHAVINGS.get());
                        output.accept(ModItems.ANTIMONY_SHAVINGS.get());
                        output.accept(ModItems.NICKEL_SHAVINGS.get());
                        output.accept(ModItems.SILICON_SHAVINGS.get());
                        output.accept(ModItems.MAGNESIUM_SHAVINGS.get());
                        output.accept(ModItems.MANGANESE_SHAVINGS.get());
                        output.accept(ModItems.BISMUTH_SHAVINGS.get());
                        output.accept(ModItems.SILVER_SHAVINGS.get());

                    //Divine Metals
                        output.accept(ModItems.ATIUM.get());
                        output.accept(ModItems.LERASIUM.get());

                        output.accept(ModItems.ARMONIUM.get());
                        output.accept(ModBlocks.ARMONIUM_BLOCK.get());
                        output.accept(ModItems.ARMONIUM_INGOT.get());
                        output.accept(ModItems.ARMONIUM_NUGGET.get());
                        output.accept(ModItems.ARMONIUM_SHAVINGS.get());

                        output.accept(ModItems.TRELLIUM.get());
                        output.accept(ModBlocks.TRELLIUM_BLOCK.get());
                        output.accept(ModItems.TRELLIUM_INGOT.get());
                        output.accept(ModItems.TRELLIUM_NUGGET.get());
                        output.accept(ModItems.TRELLIUM_SHAVINGS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ALLOMANCY_TAB = CREATIVE_MOD_TABS.register("allomancy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCADRIAL_GLYPH.get()))
                    .title(Component.translatable("creativetab.scadrialmod.allomancy"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.COIN.get());
                        output.accept(ModItems.COIN_BAG.get());
                        output.accept(ModItems.GLASS_KNIFE.get());
                        output.accept(ModItems.MISTCLOAK.get());
                        output.accept(ModItems.DUELLING_CANE.get());

                        output.accept(ModItems.STOPPER.get());
                        output.accept(ModItems.REFINED_GLASS.get());

                        output.accept(ModItems.EMPTY_VIAL.get());
                        output.accept(ModItems.METAL_VIAL.get());
                        output.accept(ModItems.WHISKY_METAL_VIAL.get());
                        output.accept(ModItems.COD_LIVER_OIL_METAL_VIAL.get());

                        output.accept(ModItems.EMPTY_FLASK.get());
                        output.accept(ModItems.FILLED_FLASK.get());
                        output.accept(ModItems.WHISKY_FLASK.get());
                        output.accept(ModItems.COD_LIVER_OIL_FLASK.get());

                        output.accept(ModItems.EMPTY_ALUMINIUM_FLASK.get());
                        output.accept(ModItems.FILLED_ALUMIMIUM_FLASK.get());
                        output.accept(ModItems.WHISKY_ALUMINIUM_FLASK.get());
                        output.accept(ModItems.COD_LIVER_OIL_ALUMINIUM_FLASK.get());

                    })

                    .build());

    public static final RegistryObject<CreativeModeTab> FERUCHEMY_TAB = CREATIVE_MOD_TABS.register("feruchemy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCADRIAL_GLYPH.get()))
                    .title(Component.translatable("creativetab.scadrialmod.feruchemy"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.IRON_ARMBAND.get());
                        output.accept(ModItems.IRON_BRACELET.get());
                        output.accept(ModItems.IRON_EARRING.get());
                        output.accept(ModItems.IRON_RING.get());

                        output.accept(ModItems.STEEL_ARMBAND.get());
                        output.accept(ModItems.STEEL_BRACELET.get());
                        output.accept(ModItems.STEEL_EARRING.get());
                        output.accept(ModItems.STEEL_RING.get());

                        output.accept(ModItems.TIN_ARMBAND.get());
                        output.accept(ModItems.TIN_BRACELET.get());
                        output.accept(ModItems.TIN_EARRING.get());
                        output.accept(ModItems.TIN_RING.get());

                        output.accept(ModItems.PEWTER_ARMBAND.get());
                        output.accept(ModItems.PEWTER_BRACELET.get());
                        output.accept(ModItems.PEWTER_EARRING.get());
                        output.accept(ModItems.PEWTER_RING.get());

                        output.accept(ModItems.ZINC_ARMBAND.get());
                        output.accept(ModItems.ZINC_BRACELET.get());
                        output.accept(ModItems.ZINC_EARRING.get());
                        output.accept(ModItems.ZINC_RING.get());

                        output.accept(ModItems.BRASS_ARMBAND.get());
                        output.accept(ModItems.BRASS_BRACELET.get());
                        output.accept(ModItems.BRASS_EARRING.get());
                        output.accept(ModItems.BRASS_RING.get());

                        output.accept(ModItems.COPPER_ARMBAND.get());
                        output.accept(ModItems.COPPER_BRACELET.get());
                        output.accept(ModItems.COPPER_EARRING.get());
                        output.accept(ModItems.COPPER_RING.get());

                        output.accept(ModItems.BRONZE_ARMBAND.get());
                        output.accept(ModItems.BRONZE_BRACELET.get());
                        output.accept(ModItems.BRONZE_EARRING.get());
                        output.accept(ModItems.BRONZE_RING.get());

                        output.accept(ModItems.CHROMIUM_ARMBAND.get());
                        output.accept(ModItems.CHROMIUM_BRACELET.get());
                        output.accept(ModItems.CHROMIUM_EARRING.get());
                        output.accept(ModItems.CHROMIUM_RING.get());

                        output.accept(ModItems.ALUMINIUM_ARMBAND.get());
                        output.accept(ModItems.ALUMINIUM_BRACELET.get());
                        output.accept(ModItems.ALUMINIUM_EARRING.get());
                        output.accept(ModItems.ALUMINIUM_RING.get());

                        output.accept(ModItems.DURALUMIN_ARMBAND.get());
                        output.accept(ModItems.DURALUMIN_BRACELET.get());
                        output.accept(ModItems.DURALUMIN_EARRING.get());
                        output.accept(ModItems.DURALUMIN_RING.get());

                        output.accept(ModItems.PEWTER_ARMBAND.get());
                        output.accept(ModItems.PEWTER_BRACELET.get());
                        output.accept(ModItems.PEWTER_EARRING.get());
                        output.accept(ModItems.PEWTER_RING.get());

                        output.accept(ModItems.CADMIUM_ARMBAND.get());
                        output.accept(ModItems.CADMIUM_BRACELET.get());
                        output.accept(ModItems.CADMIUM_EARRING.get());
                        output.accept(ModItems.CADMIUM_RING.get());

                        output.accept(ModItems.BENDALLOY_ARMBAND.get());
                        output.accept(ModItems.BENDALLOY_BRACELET.get());
                        output.accept(ModItems.BENDALLOY_EARRING.get());
                        output.accept(ModItems.BENDALLOY_RING.get());

                        output.accept(ModItems.GOLD_ARMBAND.get());
                        output.accept(ModItems.GOLD_BRACELET.get());
                        output.accept(ModItems.GOLD_EARRING.get());
                        output.accept(ModItems.GOLD_RING.get());

                        output.accept(ModItems.ELECTRUM_ARMBAND.get());
                        output.accept(ModItems.ELECTRUM_BRACELET.get());
                        output.accept(ModItems.ELECTRUM_EARRING.get());
                        output.accept(ModItems.ELECTRUM_RING.get());

                        output.accept(ModItems.ATIUM_ARMBAND.get());
                        output.accept(ModItems.ATIUM_BRACELET.get());
                        output.accept(ModItems.ATIUM_EARRING.get());
                        output.accept(ModItems.ATIUM_RING.get());

                        output.accept(ModItems.TRELLIUM_EARRING.get());
                    })

                    .build());

    public static final RegistryObject<CreativeModeTab> HEMALURGY_TAB = CREATIVE_MOD_TABS.register("hemalurgys_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCADRIAL_GLYPH.get()))
                    .title(Component.translatable("creativetab.scadrialmod.hemalurgy"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.IRON_SPIKE.get());
                        output.accept(ModItems.STEEL_SPIKE.get());
                        output.accept(ModItems.TIN_SPIKE.get());
                        output.accept(ModItems.PEWTER_SPIKE.get());

                        output.accept(ModItems.ZINC_SPIKE.get());
                        output.accept(ModItems.BRASS_SPIKE.get());
                        output.accept(ModItems.COPPER_SPIKE.get());
                        output.accept(ModItems.BRONZE_SPIKE.get());

                        output.accept(ModItems.CHROMIUM_SPIKE.get());
                        output.accept(ModItems.NICROSIL_SPIKE.get());
                        output.accept(ModItems.ALUMINIUM_SPIKE.get());
                        output.accept(ModItems.DURALUMIN_SPIKE.get());

                        output.accept(ModItems.CADMIUM_SPIKE.get());
                        output.accept(ModItems.BENDALLOY_SPIKE.get());
                        output.accept(ModItems.GOLD_SPIKE.get());
                        output.accept(ModItems.ELECTRUM_SPIKE.get());

                        output.accept(ModItems.ATIUM_SPIKE.get());
                        output.accept(ModItems.ARMONIUM_SPIKE.get());
                        output.accept(ModItems.TRELLIUM_SPIKE.get());

                        //tools
                        output.accept(ModItems.OBSIDIAN_AXE.get());

                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}