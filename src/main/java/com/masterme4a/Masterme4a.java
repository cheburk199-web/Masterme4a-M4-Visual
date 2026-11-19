package com.masterme4a;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("masterme4a")
public class Masterme4a {
    public Masterme4a() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }
    private void clientSetup(FMLClientSetupEvent event) {
        ClientKeys.register();
    }
}
