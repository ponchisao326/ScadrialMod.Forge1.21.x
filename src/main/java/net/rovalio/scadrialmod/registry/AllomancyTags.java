package net.rovalio.scadrialmod.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.rovalio.scadrialmod.ScadrialMod;

public class AllomancyTags {

    public static final TagKey<Block> ALLOMANCY_TANGIBLE_BLOCKS =
            TagKey.create(
                    Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(
                            ScadrialMod.MOD_ID,
                            "allomancy_tangible"
                    )
            );

    public static final TagKey<Item> ALLOMANCY_TANGIBLE_ITEMS =
            TagKey.create(
                    Registries.ITEM,
                    ResourceLocation.fromNamespaceAndPath(
                            ScadrialMod.MOD_ID,
                            "allomancy_tangible"
                    )
            );
}
