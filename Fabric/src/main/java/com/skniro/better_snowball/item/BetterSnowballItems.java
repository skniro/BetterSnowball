package com.skniro.better_snowball.item;

import com.skniro.better_snowball.BetterSnowball;
import com.skniro.better_snowball.item.init.*;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class BetterSnowballItems {
    //Snowball
    public static final Item SNOWBALL_STONE = registerItem("snowball_stone", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_ICE = registerItem("snowball_ice", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_IRON = registerItem("snowball_iron", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Gold = registerItem("snowball_gold", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Diamond = registerItem("snowball_diamond",  BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Compression = registerItem("snowball_compression", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Teleporting = registerItem("snowball_teleporting", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Confusion = registerItem("snowball_confusion", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Poison = registerItem("snowball_poison", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Instant_Health = registerItem("snowball_instant_health", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Hostility = registerItem("snowball_hostility", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));

    private static Item registerItem(String name,Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = (Item)factory.apply(settings.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BetterSnowball.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BetterSnowball.MOD_ID, name)), item);
    }

    public static void registerModItems() {
        BetterSnowball.LOGGER.info("Registering Mod Items for " + BetterSnowball.MOD_ID);
    }
}