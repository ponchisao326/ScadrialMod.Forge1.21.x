package net.rovalio.scadrialmod.allomancy;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.rovalio.scadrialmod.registry.AllomancyTags;

import java.util.ArrayList;
import java.util.List;

public class AllomancyDetector {

    public static List<MetalSource> detect(Player player, double radius) {
        Level level = player.level();
        // Usamos eyePosition para que las líneas salgan de los ojos, no de los pies
        Vec3 origin = player.getEyePosition();

        // Optimización: Reducir el AABB a enteros para el bucle
        int minX = Mth.floor(origin.x - radius);
        int maxX = Mth.ceil(origin.x + radius);
        int minY = Mth.floor(origin.y - radius);
        int maxY = Mth.ceil(origin.y + radius);
        int minZ = Mth.floor(origin.z - radius);
        int maxZ = Mth.ceil(origin.z + radius);

        // Pre-cálculo del radio cuadrado para evitar Math.sqrt() en el bucle pues es muy costoso
        double radiusSqr = radius * radius;

        List<MetalSource> sources = new ArrayList<>();

        // --- ITEMS ---
        AABB box = new AABB(minX, minY, minZ, maxX, maxY, maxZ);
        List<Entity> entities = level.getEntities(player, box, e -> e instanceof ItemEntity);

        for (Entity entity : entities) {
            if (((ItemEntity) entity).getItem().is(AllomancyTags.ALLOMANCY_TANGIBLE_ITEMS)) {
                // Comprobación de distancia cuadrada (rápida)
                if (entity.distanceToSqr(origin) <= radiusSqr) {
                    sources.add(new MetalSource(origin, entity.position()));
                }
            }
        }

        // --- BLOCKS ---
        // OPTIMIZACIÓN: MutableBlockPos evita crear 35,000 objetos BlockPos nuevos
        BlockPos.MutableBlockPos mutablePos = new BlockPos.MutableBlockPos();

        for (int x = minX; x < maxX; x++) {
            for (int y = minY; y < maxY; y++) {
                for (int z = minZ; z < maxZ; z++) {

                    // Configuramos el mutable
                    mutablePos.set(x, y, z);

                    // Check de distancia PRIMERO
                    // Usamos distSqrCenter para no crear objetos Vec3
                    if (mutablePos.distToCenterSqr(origin.x, origin.y, origin.z) > radiusSqr) {
                        continue;
                    }

                    // Leer estado del bloque
                    BlockState state = level.getBlockState(mutablePos);

                    // Check de Tag
                    if (!state.isAir() && state.is(AllomancyTags.ALLOMANCY_TANGIBLE_BLOCKS)) {
                        // Solo creamos el Vec3 final si realmente encontramos metal
                        sources.add(new MetalSource(origin, Vec3.atCenterOf(mutablePos)));
                    }
                }
            }
        }

        return sources;
    }
}