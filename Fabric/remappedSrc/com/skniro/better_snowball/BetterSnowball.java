package com.skniro.better_snowball;

import com.skniro.better_snowball.item.BetterSnowballItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BetterSnowball implements ModInitializer {
    public static final String MOD_ID = "better_snowball";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public static final ResourceKey<CreativeModeTab> Better_Snowball_Group = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "better_snowball_group"));

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Better_Snowball_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(BetterSnowballItems.SNOWBALL_STONE))
                .title(Component.translatable("itemGroup.better_snowball.better_snowball_group"))
                .build()); // build() no longer registers by itself
        BetterSnowballContent.registerItem();
        BetterSnowballContent.CreativeTab();
    }
}
