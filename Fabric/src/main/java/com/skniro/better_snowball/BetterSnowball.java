package com.skniro.better_snowball;

import com.skniro.better_snowball.item.BetterSnowballItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BetterSnowball implements ModInitializer {
    public static final String MOD_ID = "better_snowball";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public static final RegistryKey<ItemGroup> Better_Snowball_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "better_snowball_group"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, Better_Snowball_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(BetterSnowballItems.SNOWBALL_STONE))
                .displayName(Text.translatable("itemGroup.better_snowball.better_snowball_group"))
                .build()); // build() no longer registers by itself
        BetterSnowballContent.registerItem();
        BetterSnowballContent.CreativeTab();
    }
}
