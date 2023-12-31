package com.skniro.better_snowball.entity.projectile.thrown;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class MapleIronSnowballEntity extends Snowball {
    public MapleIronSnowballEntity(Level world, LivingEntity owner) {
        super(world, owner);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof Blaze ? 5 : 3;
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), i);
    }
}
