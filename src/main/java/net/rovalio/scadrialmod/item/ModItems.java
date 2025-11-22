package net.rovalio.scadrialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rovalio.scadrialmod.ScadrialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ScadrialMod.MOD_ID);

    public static final RegistryObject<Item> SCADRIAL_GLYPH = ITEMS.register("scadrial_glyph",
            () -> new Item(new Item.Properties()));

//Scadrial

    //Metal disolution
    public static final RegistryObject<Item> ALCOHOL = ITEMS.register("alcohol",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHISKY = ITEMS.register("whisky",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COD_LIVER = ITEMS.register("cod_liver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COD_LIVER_OIL = ITEMS.register("cod_liver_oil",
            () -> new Item(new Item.Properties()));




//Invested Metals and alloys

// Iron and Steel

        //Iron
    public static final RegistryObject<Item> IRON_SHAVINGS = ITEMS.register("iron_shavings",
            () -> new Item(new Item.Properties()));


    //Steel alloy - Iron + Coal Dust

        //Steel
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHAVINGS = ITEMS.register("steel_shavings",
            () -> new Item(new Item.Properties()));


        //Coal Dust
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties()));



//Tin and Pewter

        //Tin
    public static final RegistryObject<Item> CASSITERITE = ITEMS.register("cassiterite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_SHAVINGS = ITEMS.register("tin_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));


    //Pewter Alloy - Tin 15% + Copper 1% + Lead 80% + Antimony 4%

        //Pewter
    public static final RegistryObject<Item> PEWTER_INGOT = ITEMS.register("pewter_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEWTER_NUGGET = ITEMS.register("pewter_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEWTER_SHAVINGS = ITEMS.register("pewter_shavings",
            () -> new Item(new Item.Properties()));


        //Lead
    public static final RegistryObject<Item> GALENA = ITEMS.register("galena",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_SHAVINGS = ITEMS.register("lead_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));

        //Antimony
    public static final RegistryObject<Item> STIBNITE = ITEMS.register("stibnite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANTIMONY_INGOT = ITEMS.register("antimony_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANTIMONY_NUGGET = ITEMS.register("antimony_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANTIMONY_SHAVINGS = ITEMS.register("antimony_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ANTIMONY = ITEMS.register("raw_antimony",
            () -> new Item(new Item.Properties()));



//Zinc and Brass

        //Zinc
    public static final RegistryObject<Item> SPHALERITE = ITEMS.register("sphalerite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_SHAVINGS = ITEMS.register("zinc_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties()));


    //Brass Alloy - Zinc + Copper

        //Brass
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_SHAVINGS = ITEMS.register("brass_shavings",
            () -> new Item(new Item.Properties()));



//Copper and Bronze

        //Copper
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHAVINGS = ITEMS.register("copper_shavings",
            () -> new Item(new Item.Properties()));


    //Bronze Alloy - Copper + Tin

        //Bronze
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHAVINGS = ITEMS.register("bronze_shavings",
            () -> new Item(new Item.Properties()));



//Chromium and Nicrosil


        //Chromium
    public static final RegistryObject<Item> CHROMITE = ITEMS.register("chromite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_NUGGET = ITEMS.register("chromium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_SHAVINGS = ITEMS.register("chromium_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHROMIUM = ITEMS.register("raw_chromium",
            () -> new Item(new Item.Properties()));


    //Nicrosil Alloy - Nickel 65% + Chromium 25% + Silicon 10%

        //Nicrosil
    public static final RegistryObject<Item> NICROSIL_INGOT = ITEMS.register("nicrosil_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICROSIL_NUGGET = ITEMS.register("nicrosil_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICROSIL_SHAVINGS = ITEMS.register("nicrosil_shavings",
            () -> new Item(new Item.Properties()));


        //Nickel
    public static final RegistryObject<Item> PENTLANDITE = ITEMS.register("pentlandite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_SHAVINGS = ITEMS.register("nickel_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties()));

        //Silicon
    //The original mineral of silicon is quartz
    public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON_NUGGET = ITEMS.register("silicon_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON_SHAVINGS = ITEMS.register("silicon_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon",
            () -> new Item(new Item.Properties()));



//Aluminium and Duralumin

        //Aluminium
    public static final RegistryObject<Item> BAUXITE = ITEMS.register("bauxite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_SHAVINGS = ITEMS.register("aluminium_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties()));


    //Duralumin Alloy - Aluminium 93% + Copper 4% + Magnesium 2% + Manganese 1%

        //Duraluminium
    public static final RegistryObject<Item> DURALUMIN_INGOT = ITEMS.register("duralumin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DURALUMIN_NUGGET = ITEMS.register("duralumin_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DURALUMIN_SHAVINGS = ITEMS.register("duralumin_shavings",
            () -> new Item(new Item.Properties()));


        //Magnesio
    public static final RegistryObject<Item> DOLOMITE = ITEMS.register("dolomite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGNESIUM_SHAVINGS = ITEMS.register("magnesium_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium",
            () -> new Item(new Item.Properties()));

        //Manganeso
    public static final RegistryObject<Item> PYROLUSITE = ITEMS.register("pyrolusite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGANESE_NUGGET = ITEMS.register("manganese_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGANESE_SHAVINGS = ITEMS.register("manganese_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MANGANESE = ITEMS.register("raw_manganese",
            () -> new Item(new Item.Properties()));



//Cadmium and Bendalloy

        //Cadmio
    public static final RegistryObject<Item> GREENOCKITE = ITEMS.register("greenockite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CADMIUM_INGOT = ITEMS.register("cadmium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CADMIUM_NUGGET = ITEMS.register("cadmium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CADMIUM_SHAVINGS = ITEMS.register("cadmium_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CADMIUM = ITEMS.register("raw_cadmium",
            () -> new Item(new Item.Properties()));


    //Bendalloy Alloy - Cadmium 70% + Bismuth30%

        //Bendalloy
    public static final RegistryObject<Item> BENDALOY_INGOT = ITEMS.register("bendaloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BENDALOY_NUGGET = ITEMS.register("bendaloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BENDALOY_SHAVINGS = ITEMS.register("bendaloy_shavings",
            () -> new Item(new Item.Properties()));


        //Bismuth
    public static final RegistryObject<Item> BISMUTHINITE = ITEMS.register("bismuthinite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_NUGGET = ITEMS.register("bismuth_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_SHAVINGS = ITEMS.register("bismuth_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));



//Gold and Electrum

        //Gold
    public static final RegistryObject<Item> GOLD_SHAVINGS = ITEMS.register("gold_shavings",
            () -> new Item(new Item.Properties()));


    //Electrum Alloy - Gold 60% + Silver 40%

        //Electrum
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_SHAVINGS = ITEMS.register("electrum_shavings",
            () -> new Item(new Item.Properties()));


        //Silver
    public static final RegistryObject<Item> ARGENTITE = ITEMS.register("argentite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHAVINGS = ITEMS.register("silver_shavings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));


//Metales divinos
    public static final RegistryObject<Item> ATIUM = ITEMS.register("atium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LERASIUM = ITEMS.register("lerasium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARMONIUM = ITEMS.register("armonium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARMONIUM_INGOT = ITEMS.register("armonium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARMONIUM_NUGGET = ITEMS.register("armonium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARMONIUM_SHAVINGS = ITEMS.register("armonium_shavings",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TRELLIUM = ITEMS.register("trellium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRELLIUM_INGOT = ITEMS.register("trellium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRELLIUM_NUGGET = ITEMS.register("trellium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRELLIUM_SHAVINGS = ITEMS.register("trellium_shavings",
            () -> new Item(new Item.Properties()));


//Allomancy

    //Miscellaneous
    public static final RegistryObject<Item> MISTCLOAK = ITEMS.register("mistcloak",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLASS_KNIFE = ITEMS.register("glass_knife",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COIN_BAG = ITEMS.register("coin_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUELLING_CANE = ITEMS.register("duelling_cane",
            () -> new Item(new Item.Properties()));



    //Metal containers
    public static final RegistryObject<Item> STOPPER = ITEMS.register("stopper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_GLASS = ITEMS.register("refined_glass",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMPTY_VIAL = ITEMS.register("empty_vial",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_VIAL = ITEMS.register("metal_vial",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHISKY_METAL_VIAL = ITEMS.register("whisky_metal_vial",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COD_LIVER_OIL_METAL_VIAL = ITEMS.register("cod_liver_oil_metal_vial",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMPTY_FLASK = ITEMS.register("empty_flask",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FILLED_FLASK = ITEMS.register("metal_flask",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHISKY_FLASK = ITEMS.register("whisky_flask",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COD_LIVER_OIL_FLASK = ITEMS.register("cod_liver_oil_flask",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMPTY_ALUMINIUM_FLASK = ITEMS.register("empty_aluminium_flask",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FILLED_ALUMIMIUM_FLASK = ITEMS.register("metal_aluminium_flask",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHISKY_ALUMINIUM_FLASK = ITEMS.register("whisky_aluminium_flask",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COD_LIVER_OIL_ALUMINIUM_FLASK = ITEMS.register("cod_liver_oil_aluminium_flask",
            () -> new Item(new Item.Properties()));





//Feruchemy

    //Iron
    public static final RegistryObject<Item> IRON_ARMBAND = ITEMS.register("iron_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_BRACELET = ITEMS.register("iron_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_EARRING = ITEMS.register("iron_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_RING = ITEMS.register("iron_ring",
            () -> new Item(new Item.Properties()));

    //Steel
    public static final RegistryObject<Item> STEEL_ARMBAND = ITEMS.register("steel_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BRACELET = ITEMS.register("steel_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_EARRING = ITEMS.register("steel_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_RING = ITEMS.register("steel_ring",
            () -> new Item(new Item.Properties()));



    //Tin
    public static final RegistryObject<Item> TIN_ARMBAND = ITEMS.register("tin_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_BRACELET = ITEMS.register("tin_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_EARRING = ITEMS.register("tin_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_RING = ITEMS.register("tin_ring",
            () -> new Item(new Item.Properties()));

    //Pewter
    public static final RegistryObject<Item> PEWTER_ARMBAND = ITEMS.register("pewter_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEWTER_BRACELET = ITEMS.register("pewter_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEWTER_EARRING = ITEMS.register("pewter_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEWTER_RING = ITEMS.register("pewter_ring",
            () -> new Item(new Item.Properties()));



    //Zinc
    public static final RegistryObject<Item> ZINC_ARMBAND = ITEMS.register("zinc_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_BRACELET = ITEMS.register("zinc_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_EARRING = ITEMS.register("zinc_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_RING = ITEMS.register("zinc_ring",
            () -> new Item(new Item.Properties()));

    //Brass
    public static final RegistryObject<Item> BRASS_ARMBAND = ITEMS.register("brass_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_BRACELET = ITEMS.register("brass_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_EARRING = ITEMS.register("brass_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_RING = ITEMS.register("brass_ring",
            () -> new Item(new Item.Properties()));



    //Copper
    public static final RegistryObject<Item> COPPER_ARMBAND = ITEMS.register("copper_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BRACELET = ITEMS.register("copper_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_EARRING = ITEMS.register("copper_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_RING = ITEMS.register("copper_ring",
            () -> new Item(new Item.Properties()));

    //Bronze
    public static final RegistryObject<Item> BRONZE_ARMBAND = ITEMS.register("bronze_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BRACELET = ITEMS.register("bronze_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_EARRING = ITEMS.register("bronze_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_RING = ITEMS.register("bronze_ring",
            () -> new Item(new Item.Properties()));



    //Chromium
    public static final RegistryObject<Item> CHROMIUM_ARMBAND = ITEMS.register("chromium_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_BRACELET = ITEMS.register("chromium_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_EARRING = ITEMS.register("chromium_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_RING = ITEMS.register("chromium_ring",
            () -> new Item(new Item.Properties()));

    //Nicrosil
    public static final RegistryObject<Item> NICROSIL_ARMBAND = ITEMS.register("nicrosil_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICROSIL_BRACELET = ITEMS.register("nicrosil_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICROSIL_EARRING = ITEMS.register("nicrosil_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICROSIL_RING = ITEMS.register("nicrosil_ring",
            () -> new Item(new Item.Properties()));



    //Aluminium
    public static final RegistryObject<Item> ALUMINIUM_ARMBAND = ITEMS.register("aluminium_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_BRACELET = ITEMS.register("aluminium_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_EARRING = ITEMS.register("aluminium_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_RING = ITEMS.register("aluminium_ring",
            () -> new Item(new Item.Properties()));

    //Duralumin
    public static final RegistryObject<Item> DURALUMIN_ARMBAND = ITEMS.register("duralumin_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DURALUMIN_BRACELET = ITEMS.register("duralumin_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DURALUMIN_EARRING = ITEMS.register("duralumin_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DURALUMIN_RING = ITEMS.register("duralumin_ring",
            () -> new Item(new Item.Properties()));



    //Cadmio
    public static final RegistryObject<Item> CADMIUM_ARMBAND = ITEMS.register("cadmium_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CADMIUM_BRACELET = ITEMS.register("cadmium_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CADMIUM_EARRING = ITEMS.register("cadmium_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CADMIUM_RING = ITEMS.register("cadmium_ring",
            () -> new Item(new Item.Properties()));

    //Bendalloy
    public static final RegistryObject<Item> BENDALLOY_ARMBAND = ITEMS.register("bendalloy_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BENDALLOY_BRACELET = ITEMS.register("bendalloy_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BENDALLOY_EARRING = ITEMS.register("bendalloy_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BENDALLOY_RING = ITEMS.register("bendalloy_ring",
            () -> new Item(new Item.Properties()));



    //Gold
    public static final RegistryObject<Item> GOLD_ARMBAND = ITEMS.register("gold_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_BRACELET = ITEMS.register("gold_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_EARRING = ITEMS.register("gold_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_RING = ITEMS.register("gold_ring",
            () -> new Item(new Item.Properties()));

    //Electrum
    public static final RegistryObject<Item> ELECTRUM_ARMBAND = ITEMS.register("electrum_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_BRACELET = ITEMS.register("electrum_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_EARRING = ITEMS.register("electrum_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_RING = ITEMS.register("electrum_ring",
            () -> new Item(new Item.Properties()));



    //Atium
    public static final RegistryObject<Item> ATIUM_ARMBAND = ITEMS.register("atium_armband",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ATIUM_BRACELET = ITEMS.register("atium_bracelet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ATIUM_EARRING = ITEMS.register("atium_earring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ATIUM_RING = ITEMS.register("atium_ring",
            () -> new Item(new Item.Properties()));

    //Trellium
    public static final RegistryObject<Item> TRELLIUM_EARRING = ITEMS.register("trellium_earring",
            () -> new Item(new Item.Properties()));

//Hemalurgy

    //Hemalurgy Nails
    public static final RegistryObject<Item> IRON_SPIKE = ITEMS.register("iron_spike",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SPIKE = ITEMS.register("steel_spike",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> TIN_SPIKE = ITEMS.register("tin_spike",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEWTER_SPIKE = ITEMS.register("pewter_spike",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ZINC_SPIKE = ITEMS.register("zinc_spike",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_SPIKE = ITEMS.register("brass_spike",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_SPIKE = ITEMS.register("copper_spike",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SPIKE = ITEMS.register("bronze_spike",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> CHROMIUM_SPIKE = ITEMS.register("chromium_spike",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICROSIL_SPIKE = ITEMS.register("nicrosil_spike",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINIUM_SPIKE = ITEMS.register("aluminium_spike",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DURALUMIN_SPIKE = ITEMS.register("duralumin_spike",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> CADMIUM_SPIKE = ITEMS.register("cadmium_spike",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BENDALLOY_SPIKE = ITEMS.register("bendalloy_spike",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_SPIKE = ITEMS.register("gold_spike",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_SPIKE = ITEMS.register("electrum_spike",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ATIUM_SPIKE = ITEMS.register("atium_spike",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARMONIUM_SPIKE = ITEMS.register("armonium_spike",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRELLIUM_SPIKE = ITEMS.register("trellium_spike",
            () -> new Item(new Item.Properties()));



    //Inquisitor weapons
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
