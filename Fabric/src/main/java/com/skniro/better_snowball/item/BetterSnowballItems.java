package com.skniro.better_snowball.item;

import com.skniro.better_snowball.BetterSnowball;
import com.skniro.better_snowball.item.init.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class BetterSnowballItems {
    //Snowball
    public static final Item SNOWBALL_STONE = registerItem("snowball_stone", new StoneSnowballItem(new Item.Settings().maxCount(64)));
    public static final Item SNOWBALL_ICE = registerItem("snowball_ice", new IceSnowballItem(new Item.Settings().maxCount(64)));
    public static final Item SNOWBALL_IRON = registerItem("snowball_iron", new IronSnowballItem(new Item.Settings().maxCount(64)));
    public static final Item SNOWBALL_Gold = registerItem("snowball_gold", new GoldSnowballItem(new Item.Settings().maxCount(64)));
    public static final Item SNOWBALL_Diamond = registerItem("snowball_diamond", new DiamondSnowballItem(new Item.Settings().maxCount(64)));
    public static final Item SNOWBALL_Compression = registerItem("snowball_compression", new StoneSnowballItem(new Item.Settings().maxCount(64)));
    public static final Item SNOWBALL_Teleporting = registerItem("snowball_teleporting", new TeleportingSnowballItem(new Item.Settings().maxCount(64)));
    public static final Item SNOWBALL_Confusion = registerItem("snowball_confusion", new ConfusionSnowballItem(new Item.Settings().maxCount(64)));
    public static final Item SNOWBALL_Poison = registerItem("snowball_poison", new PoisonSnowballItem(new Item.Settings().maxCount(64)));
    public static final Item SNOWBALL_Instant_Health = registerItem("snowball_instant_health", new InstantHealthSnowballItem(new Item.Settings().maxCount(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterSnowball.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterSnowball.LOGGER.info("Registering Mod Items for " + BetterSnowball.MOD_ID);
    }
}