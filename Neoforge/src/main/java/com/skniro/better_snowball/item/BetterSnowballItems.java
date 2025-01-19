package com.skniro.better_snowball.item;

import com.skniro.better_snowball.BetterSnowball;
import com.skniro.better_snowball.item.init.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BetterSnowballItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, BetterSnowball.MODID);

    //Snowball
    public static final Supplier<Item> SNOWBALL_STONE = registerItem("snowball_stone",
            () -> new StoneSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_ICE = registerItem("snowball_ice",
            () -> new IceSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_IRON = registerItem("snowball_iron",
            () -> new IronSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Gold = registerItem("snowball_gold",
            () -> new GoldSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Diamond = registerItem("snowball_diamond",
            () -> new DiamondSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Compression = registerItem("snowball_compression",
            () -> new StoneSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Teleporting = registerItem("snowball_teleporting",
            () -> new TeleportingSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Confusion = registerItem("snowball_confusion",
            () -> new ConfusionSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Poison = registerItem("snowball_poison",
            () -> new PoisonSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Instant_Health = registerItem("snowball_instant_health",
            () -> new InstantHealthSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Hostility = registerItem("snowball_hostility",
            () -> new HostilitySnowballItem(new Item.Properties().stacksTo(64)));



    private static <T extends Item> DeferredHolder<Item,T> registerItem(String name, Supplier<T> item) {
        DeferredHolder<Item,T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}