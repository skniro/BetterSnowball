package com.skniro.better_snowball.item;

import com.skniro.better_snowball.BetterSnowball;
import com.skniro.better_snowball.item.init.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class BetterSnowballItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterSnowball.MODID);

    //Snowball
    public static final Supplier<Item> SNOWBALL_STONE = registerItem("snowball_stone",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_ICE = registerItem("snowball_ice",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_IRON = registerItem("snowball_iron",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Gold = registerItem("snowball_gold",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Diamond = registerItem("snowball_diamond",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Compression = registerItem("snowball_compression",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Teleporting = registerItem("snowball_teleporting",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Confusion = registerItem("snowball_confusion",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Poison = registerItem("snowball_poison",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Instant_Health = registerItem("snowball_instant_health",
            BetterSnowballSnowballItem::new, (new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Hostility = registerItem("snowball_hostility",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));


    private static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        DeferredItem<T> toReturn = ITEMS.registerItem(name, item, properties.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BetterSnowball.MODID, name))));
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}