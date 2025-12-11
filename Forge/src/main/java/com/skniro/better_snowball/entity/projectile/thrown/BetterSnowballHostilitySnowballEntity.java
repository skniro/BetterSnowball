package com.skniro.better_snowball.entity.projectile.thrown;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.throwableitemprojectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

import java.util.List;

public class BetterSnowballHostilitySnowballEntity extends Snowball {
    private final Level world;

    public BetterSnowballHostilitySnowballEntity(Level world, LivingEntity owner, ItemStack itemStack) {
        super(world, owner, itemStack);
        this.world = world;
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof Blaze ? 3 : 0;
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), i);
        if (entity instanceof LivingEntity livingEntity) {
            if (livingEntity instanceof Mob mobEntity) {
                List<Entity> nearbyEntities = world.getEntities(
                    mobEntity,
                    mobEntity.getBoundingBox().inflate(5.0),
                    e -> e instanceof LivingEntity
                );

                for (Entity nearbyEntity : nearbyEntities) {
                    if (nearbyEntity instanceof LivingEntity targetEntity && nearbyEntity != mobEntity) {
                        if (mobEntity.canAttack(targetEntity)) {
                            mobEntity.setTarget(targetEntity);
                        }
                    }
                }
            }
        }
    }
}