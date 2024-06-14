package com.skniro.better_snowball.datagen;

import com.skniro.better_snowball.item.BetterSnowballItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Items;

public class BetterSnowballModelProvider extends FabricModelProvider {
    public BetterSnowballModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_STONE, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_Diamond, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_Gold, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_ICE, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_IRON, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_Compression, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_Teleporting, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_Confusion, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_Instant_Health, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(BetterSnowballItems.SNOWBALL_Poison, Items.SNOWBALL, Models.GENERATED);
    }
}
