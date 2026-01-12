package net.rovalio.scadrialmod.allomancy;

import net.minecraft.world.phys.Vec3;

public class MetalSource {

    public final Vec3 position;
    public final Vec3 direction;
    public final double distance;

    public MetalSource(Vec3 origin, Vec3 target) {
        this.position = target;
        this.direction = target.subtract(origin).normalize();
        this.distance = target.distanceTo(origin);
    }
}
