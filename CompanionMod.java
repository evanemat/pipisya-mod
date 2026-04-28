package com.companionmod;

import com.companionmod.entity.ModEntities;
import com.companionmod.item.ModItems;
import com.companionmod.network.CompanionTaskPacket;
import net.fabricmc.api.ModInitializer;

public class CompanionMod implements ModInitializer {
    public static final String MOD_ID = "companionmod";

    @Override
    public void onInitialize() {
        ModEntities.register();
        ModItems.register();
        CompanionTaskPacket.register();
    }
}
