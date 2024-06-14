package com.skniro.better_snowball.item;

import com.skniro.better_snowball.BetterSnowball;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterSnowball.MODID);

    public static final RegistryObject<CreativeModeTab> Growable_Ores_Group = CREATIVE_MODE_TABS.register("better_snowball_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BetterSnowballItems.SNOWBALL_STONE.get()))
                    .title(Component.translatable("itemGroup.better_snowball.better_snowball_group"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(BetterSnowballItems.SNOWBALL_STONE.get());
                        pOutput.accept(BetterSnowballItems.SNOWBALL_Diamond.get());
                        pOutput.accept(BetterSnowballItems.SNOWBALL_Gold.get());
                        pOutput.accept(BetterSnowballItems.SNOWBALL_ICE.get());
                        pOutput.accept(BetterSnowballItems.SNOWBALL_IRON.get());
                        pOutput.accept(BetterSnowballItems.SNOWBALL_Compression.get());
                        pOutput.accept(BetterSnowballItems.SNOWBALL_Teleporting.get());
                        pOutput.accept(BetterSnowballItems.SNOWBALL_Confusion.get());
                        pOutput.accept(BetterSnowballItems.SNOWBALL_Instant_Health.get());
                        pOutput.accept(BetterSnowballItems.SNOWBALL_Poison.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
