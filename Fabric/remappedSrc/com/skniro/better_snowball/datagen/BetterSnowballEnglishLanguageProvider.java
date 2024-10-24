package com.skniro.better_snowball.datagen;

import com.skniro.better_snowball.BetterSnowball;
import com.skniro.better_snowball.item.BetterSnowballItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import java.util.concurrent.CompletableFuture;

public class BetterSnowballEnglishLanguageProvider extends FabricLanguageProvider {
    public BetterSnowballEnglishLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup){
        super(dataGenerator,"en_us", registryLookup);
        }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(BetterSnowballItems.SNOWBALL_STONE, "Snowball(Stone)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Diamond, "Snowball(Diamond)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Gold, "Snowball(Gold)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_ICE, "Snowball(Ice)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_IRON, "Snowball(Iron)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Compression, "Snowball(Compression)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Teleporting, "Snowball(Teleporting)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Confusion, "Snowball(Confusion)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Instant_Health, "Snowball(InstantHealth)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Poison, "Snowball(Poison)");
        translationBuilder.add(BetterSnowball.Better_Snowball_Group, "Better Snowball");
    }


    public CompletableFuture<?> run(CachedOutput writer) {
        return null;
    }

    public String getName() {
        return "";
    }
}
