package net.rovalio.scadrialmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rovalio.scadrialmod.ScadrialMod;
import net.rovalio.scadrialmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ScadrialMod.MOD_ID);



//Allomantic and Alloy metals

    //Steel
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

//Tin and Pewter

    //Tin
    public static final RegistryObject<Block> CASSITERITE_ORE = registerBlock("cassiterite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_CASSITERITE_ORE = registerBlock("deepslate_cassiterite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));


    //Pewter and pewter alloy metals

    //Pewter - Tin + Lead + Antimony + Copper
    public static final RegistryObject<Block> PEWTER_BLOCK = registerBlock("pewter_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));


    //Lead
    public static final RegistryObject<Block> GALENA_ORE = registerBlock("galena_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_GALENA_ORE = registerBlock("deepslate_galena_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));


    //Antimony
    public static final RegistryObject<Block> STIBNITE_ORE = registerBlock("stibninte_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_STIBNITE_ORE = registerBlock("deepslate_stibnite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_ANTIMONY_BLOCK = registerBlock("raw_antimony_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> ANTIMONY_BLOCK = registerBlock("antimony_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



//Zinc and Brass

    //Zinc
    public static final RegistryObject<Block> SPHALERITE_ORE = registerBlock("sphalerite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    public static final RegistryObject<Block> DEEPSLATE_SPHALERITE_ORE = registerBlock("deepslate_sphalerite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_ZINC_BLOCK = registerBlock("raw_zinc_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



    //Brass and Brass alloy metals

    //Brass - Copper + Zinc
    public static final RegistryObject<Block> BRASS_BLOCK = registerBlock("brass_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



//Copper and Bronze

    //Bronze - Copper + Tin
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



//Chromium and Nicrosil

    //Chromium
    public static final RegistryObject<Block> CHROMITE_ORE = registerBlock("chromite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_CHROMITE_ORE = registerBlock("deepslate_chromite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_CHROMIUM_BLOCK = registerBlock("raw_chromium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
			    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> CHROMIUM_BLOCK = registerBlock("chromium_block",
		    () -> new Block(BlockBehaviour.Properties.of()
			    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



    //Nicrosil and Nicrosil Alloy metals


    //Nicrosil - Nickel + Chromium + Silicon
    public static final RegistryObject<Block> NICROSIL_BLOCK = registerBlock("nicrosil_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));


    //Nickel
    public static final RegistryObject<Block> PENTLANDITE_ORE = registerBlock("pentlandite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_PENTLANDITE_ORE = registerBlock("deepslate_pentlandite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));


    //Silicon
    public static final RegistryObject<Block> QUARTZ_ORE = registerBlock("quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_SILICON_BLOCK = registerBlock("raw_silicon_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> SILICON_BLOCK = registerBlock("silicon_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



//Aluminium and Duralumium

    //Aluminium
    public static final RegistryObject<Block> BAUXITE_ORE = registerBlock("bauxite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_BAUXITE_ORE = registerBlock("deepslate_bauxite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> ALUMUNIUM_BLOCK = registerBlock("aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



    //Duralumin and Duralumin alloy metals


    //Duralumin - Aluminium + Copper + Magnesium + Manganese
    public static final RegistryObject<Block> DURALUMIN_BLOCK = registerBlock("duralumin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));


    //Magnesium
    public static final RegistryObject<Block> DOLOMITE_ORE = registerBlock("dolomite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_DOLOMITE_ORE = registerBlock("deepslate_dolomite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_MAGNESIUM_BLOCK = registerBlock("raw_magnesium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> MAGNESIUM_BLOCK = registerBlock("magnesium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    //Manganese
    public static final RegistryObject<Block> PYROLUSITE_ORE = registerBlock("pyrolusite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_PYROLUSITE_ORE = registerBlock("deepslate_pyrolusite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_MANGANESE_BLOCK = registerBlock("raw_manganese_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> MANGANESE_BLOCK = registerBlock("manganese_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



//Cadmium and Bendalloy

    //Cadmium
    public static final RegistryObject<Block> GREENOCKITE_ORE = registerBlock("greenockite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_GREENOCKITE_ORE = registerBlock("deepslate_greenockite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_CADMIUM_BLOCK = registerBlock("raw_cadmium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> CADMIUM_BLOCK = registerBlock("cadmium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



    //Bendalloy and Bendalloy alloy metals


    //Bendalloy - Cadmium + Bismuth
    public static final RegistryObject<Block> BENDALLOY_BLOCK = registerBlock("bendalloy_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));


    //Bismuth
    public static final RegistryObject<Block> BISMUTHINITE_ORE = registerBlock("bismuthinite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_BISMUTHINITE_ORE = registerBlock("deepslate_bismuthinite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_BISMUTH_BLOCK = registerBlock("raw_bismuth_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



//Gold and Electrum


    //Electrum and Electrum alloy metals


    //Electrum - Gold + Silver
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));


    //Silver
    public static final RegistryObject<Block> ARGENTITE_ORE = registerBlock("argentite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_ARGENTITE_ORE = registerBlock("deepslate_argentite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));



//Divine metals

    public static final RegistryObject<Block> ARMONIUM_BLOCK = registerBlock("armonium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> TRELLIUM_BLOCK = registerBlock("trellium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registryBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}