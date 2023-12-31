package com.skniro.better_snowball.entity.projectile.thrown;

import com.google.common.collect.Sets;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

import java.util.Set;

public class MapleConfusionSnowballEntity extends MapleSnowballEntity {
    private final Set<StatusEffectInstance> effects = Sets.newHashSet();
    public MapleConfusionSnowballEntity(World world, LivingEntity owner) {
        super(world, owner);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof BlazeEntity ? 4 : 0;
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), i);
        PlayerEntity playerEntity = (PlayerEntity) entityHitResult.getEntity();;
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,150,1));
    }
}
