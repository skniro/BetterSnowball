package com.skniro.better_snowball.item;

import com.skniro.better_snowball.BetterSnowball;
import com.skniro.better_snowball.item.init.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BetterSnowballItems {
    //Snowball
    public static final Item SNOWBALL_STONE = registerItem("snowball_stone", BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));
    public static final Item SNOWBALL_ICE = registerItem("snowball_ice", BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));
    public static final Item SNOWBALL_IRON = registerItem("snowball_iron", BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));
    public static final Item SNOWBALL_Gold = registerItem("snowball_gold", BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));
    public static final Item SNOWBALL_Diamond = registerItem("snowball_diamond",  BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));
    public static final Item SNOWBALL_Compression = registerItem("snowball_compression", BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));
    public static final Item SNOWBALL_Teleporting = registerItem("snowball_teleporting", BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));
    public static final Item SNOWBALL_Confusion = registerItem("snowball_confusion", BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));
    public static final Item SNOWBALL_Poison = registerItem("snowball_poison", BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));
    public static final Item SNOWBALL_Instant_Health = registerItem("snowball_instant_health", BetterSnowballSnowballItem::new, new Item.Settings().maxCount(64));

    private static Item registerItem(String name,Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = (Item)factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterSnowball.MOD_ID, name))));
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterSnowball.MOD_ID, name)), item);
    }

    public static void registerModItems() {
        BetterSnowball.LOGGER.info("Registering Mod Items for " + BetterSnowball.MOD_ID);
    }
}