package com.skniro.better_snowball.datagen;

import com.skniro.better_snowball.BetterSnowball;
import com.skniro.better_snowball.item.BetterSnowballItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class BetterSnowballSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public BetterSnowballSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        translationBuilder.add(BetterSnowballItems.SNOWBALL_STONE, "雪球(石)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Diamond, "雪球(钻石)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Gold, "雪球(金)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_ICE, "雪球(冰)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_IRON, "雪球(铁)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Compression, "雪球(混合)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Teleporting, "雪球(瞬移)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Confusion, "雪球(混乱)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Instant_Health, "雪球(瞬间治疗)");
        translationBuilder.add(BetterSnowballItems.SNOWBALL_Poison, "雪球(毒)");
        translationBuilder.add(BetterSnowball.Better_Snowball_Group, "更好的雪球");
    }
}
