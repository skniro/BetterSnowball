package com.skniro.better_snowball;


import com.skniro.better_snowball.item.BetterSnowballItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class BetterSnowballContent {
    public static void registerItem(){
        BetterSnowballItems.registerModItems();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(BetterSnowball.Better_Snowball_Group).register(content -> {
            content.add(BetterSnowballItems.SNOWBALL_STONE);
            content.add(BetterSnowballItems.SNOWBALL_Diamond);
            content.add(BetterSnowballItems.SNOWBALL_Gold);
            content.add(BetterSnowballItems.SNOWBALL_ICE);
            content.add(BetterSnowballItems.SNOWBALL_IRON);
            content.add(BetterSnowballItems.SNOWBALL_Compression);
            content.add(BetterSnowballItems.SNOWBALL_Teleporting);
            content.add(BetterSnowballItems.SNOWBALL_Confusion);
            content.add(BetterSnowballItems.SNOWBALL_Instant_Health);
            content.add(BetterSnowballItems.SNOWBALL_Poison);
        });




    }
}

