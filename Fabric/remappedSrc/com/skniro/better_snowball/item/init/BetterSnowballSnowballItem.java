package com.skniro.better_snowball.item.init;

import com.skniro.better_snowball.entity.projectile.thrown.*;
import com.skniro.better_snowball.item.BetterSnowballItems;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.level.Level;

public class BetterSnowballSnowballItem
        extends Item implements ProjectileItem {
    public BetterSnowballSnowballItem(Item.Properties settings) {
        super(settings);
    }

    public InteractionResult use(Level world, Player user, InteractionHand hand) {
        ItemStack itemStack = user.getItemInHand(hand);
        world.playSound((Player)null, user.getX(), user.getY(), user.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
        if (world instanceof ServerLevel serverWorld) {
            if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_STONE) {
                Projectile.spawnProjectileFromRotation(MapleStoneSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_ICE) {
                Projectile.spawnProjectileFromRotation(MapleStoneSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_IRON) {
                Projectile.spawnProjectileFromRotation(MapleIronSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_Gold) {
                Projectile.spawnProjectileFromRotation(MapleGoldSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_Diamond) {
                Projectile.spawnProjectileFromRotation(MapleDiamondSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_Compression) {
                Projectile.spawnProjectileFromRotation(MapleStoneSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_Teleporting) {
                Projectile.spawnProjectileFromRotation(MapletransSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_Confusion) {
                Projectile.spawnProjectileFromRotation(MapleConfusionSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_Poison) {
                Projectile.spawnProjectileFromRotation(MaplePoisonSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == BetterSnowballItems.SNOWBALL_Instant_Health) {
                Projectile.spawnProjectileFromRotation(MapleInstantHealthSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else {
                Projectile.spawnProjectileFromRotation(MapleSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            }
        }

        user.awardStat(Stats.ITEM_USED.get(this));
        itemStack.consume(1, user);
        return InteractionResult.SUCCESS;
    }

    public Projectile asProjectile(Level world, Position pos, ItemStack stack, Direction direction) {
        return new MapleSnowballEntity(world, pos.x(), pos.y(), pos.z(), stack);
    }
}