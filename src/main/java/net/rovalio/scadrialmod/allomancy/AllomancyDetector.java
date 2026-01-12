package net.rovalio.scadrialmod.allomancy;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.rovalio.scadrialmod.registry.AllomancyTags;

import java.util.ArrayList;
import java.util.List;

public class AllomancyDetector {

    public static List<MetalSource> detect(Player player, double radius) {
        Level level = player.level();
        Vec3 origin = player.position().add(0, player.getBbHeight() * 1.6, 0);

        AABB box = new AABB(
                origin.x - radius, origin.y - radius, origin.z - radius,
                origin.x + radius, origin.y + radius, origin.z + radius
        );

        List<MetalSource> sources = new ArrayList<>();

        // ITEMS
        for (Entity entity : level.getEntities(player, box)) {
            if (entity instanceof ItemEntity item &&
                    item.getItem().is(AllomancyTags.ALLOMANCY_TANGIBLE_ITEMS)) {

                sources.add(new MetalSource(origin, entity.position()));
            }
        }

        // BLOCKS
        BlockPos.betweenClosedStream(box)
                .filter(pos -> pos.distToCenterSqr(origin.x, origin.y, origin.z) <= radius * radius)
                .forEach(pos -> {
                    if (level.getBlockState(pos).is(AllomancyTags.ALLOMANCY_TANGIBLE_BLOCKS)) {
                        sources.add(new MetalSource(origin, Vec3.atCenterOf(pos)));
                    }
                });

        return sources;
    }
}
