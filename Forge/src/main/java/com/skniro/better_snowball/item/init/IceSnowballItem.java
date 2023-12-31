package com.skniro.better_snowball.item.init;

import com.skniro.better_snowball.entity.projectile.thrown.MapleStoneSnowballEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class IceSnowballItem extends BetterSnowballSnowballItem {
    public IceSnowballItem(Properties settings) {
        super(settings);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player user, InteractionHand hand) {
        ItemStack itemStack = user.getItemInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
        if (!world.isClientSide) {
            Snowball snowballEntity = new MapleStoneSnowballEntity(world, user);
            snowballEntity.setItem(itemStack);
            snowballEntity.shootFromRotation(user, user.getXRot(), user.getYRot(), 0.0f, 1.5f, 1.0f);
            world.addFreshEntity(snowballEntity);
        }
        user.awardStat(Stats.ITEM_USED.get(this));
        if (!user.getAbilities().instabuild) {
            itemStack.shrink(1);
        }
        return InteractionResultHolder.sidedSuccess(itemStack, world.isClientSide());
    }
}
