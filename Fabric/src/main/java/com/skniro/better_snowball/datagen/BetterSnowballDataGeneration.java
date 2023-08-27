package com.skniro.better_snowball.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BetterSnowballDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(BetterSnowballModelProvider::new);
        pack.addProvider(BetterSnowballSimplifiedChineseLanguageProvider::new);
        pack.addProvider(BetterSnowballEnglishLanguageProvider::new);
        pack.addProvider(BetterSnowballRecipeGeneration::new);
    }
}
