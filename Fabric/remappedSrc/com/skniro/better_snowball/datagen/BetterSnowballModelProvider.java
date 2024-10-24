package com.skniro.better_snowball.datagen;

import com.skniro.better_snowball.item.BetterSnowballItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.Items;

public class BetterSnowballModelProvider extends FabricModelProvider {
    public BetterSnowballModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator){
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_STONE, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_Diamond, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_Gold, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_ICE, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_IRON, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_Compression, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_Teleporting, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_Confusion, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_Instant_Health, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BetterSnowballItems.SNOWBALL_Poison, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
    }
}
