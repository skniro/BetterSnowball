package com.skniro.better_snowball.item;

import com.skniro.better_snowball.BetterSnowball;
import com.skniro.better_snowball.item.init.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class BetterSnowballItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterSnowball.MODID);

    //Snowball
    public static final RegistryObject<Item> SNOWBALL_STONE = registerItem("snowball_stone",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_ICE = registerItem("snowball_ice",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_IRON = registerItem("snowball_iron",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Gold = registerItem("snowball_gold",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Diamond = registerItem("snowball_diamond",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Compression = registerItem("snowball_compression",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Teleporting = registerItem("snowball_teleporting",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Confusion = registerItem("snowball_confusion",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Poison = registerItem("snowball_poison",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Instant_Health = registerItem("snowball_instant_health",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Hostility = registerItem("snowball_hostility",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));


    public static <B extends Item> RegistryObject<Item> register(String name, Function<Item.Properties, ? extends B> func, Item.Properties props) {
        return ITEMS.register(name, () -> {
            return (Item)func.apply(props.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(BetterSnowball.MODID, name))));
        });
    }

    private static <T extends Item> RegistryObject<Item> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        RegistryObject<Item> toReturn = register(name, item, properties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(BetterSnowball.MODID, name))));
        return toReturn;
    }

    public static void registerModItems(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }
}