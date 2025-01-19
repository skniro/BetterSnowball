package com.skniro.better_snowball.entity.projectile.thrown;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

import java.util.List;

public class BetterSnowballHostilitySnowballEntity extends MapleSnowballEntity {
    private final World world;

    public BetterSnowballHostilitySnowballEntity(World world, LivingEntity owner) {
        super(world, owner);
        this.world = world;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof BlazeEntity ? 3 : 0;
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), i);
        if (entity instanceof LivingEntity livingEntity) {
            if (livingEntity instanceof MobEntity mobEntity) {
                List<Entity> nearbyEntities = world.getOtherEntities(
                    mobEntity,
                    mobEntity.getBoundingBox().expand(5.0),
                    e -> e instanceof LivingEntity
                );

                for (Entity nearbyEntity : nearbyEntities) {
                    if (nearbyEntity instanceof LivingEntity targetEntity && nearbyEntity != mobEntity) {
                        if (mobEntity.canTarget(targetEntity)) {
                            mobEntity.setTarget(targetEntity);
                        }
                    }
                }
            }
        }
    }
}