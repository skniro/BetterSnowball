package com.skniro.better_snowball;


import com.skniro.better_snowball.item.BetterSnowballItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class BetterSnowballContent {
    public static void registerItem(){
        BetterSnowballItems.registerModItems();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(BetterSnowball.Better_Snowball_Group).register(content -> {
            content.accept(BetterSnowballItems.SNOWBALL_STONE);
            content.accept(BetterSnowballItems.SNOWBALL_Diamond);
            content.accept(BetterSnowballItems.SNOWBALL_Gold);
            content.accept(BetterSnowballItems.SNOWBALL_ICE);
            content.accept(BetterSnowballItems.SNOWBALL_IRON);
            content.accept(BetterSnowballItems.SNOWBALL_Compression);
            content.accept(BetterSnowballItems.SNOWBALL_Teleporting);
            content.accept(BetterSnowballItems.SNOWBALL_Confusion);
            content.accept(BetterSnowballItems.SNOWBALL_Instant_Health);
            content.accept(BetterSnowballItems.SNOWBALL_Poison);
        });




    }
}

