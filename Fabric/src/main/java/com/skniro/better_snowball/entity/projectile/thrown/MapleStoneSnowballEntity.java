package com.skniro.better_snowball.entity.projectile.thrown;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class MapleStoneSnowballEntity extends MapleSnowballEntity {
    public MapleStoneSnowballEntity(World world, LivingEntity owner) {
        super(world, owner);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof BlazeEntity ? 4 : 1;
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), i);
    }
}
