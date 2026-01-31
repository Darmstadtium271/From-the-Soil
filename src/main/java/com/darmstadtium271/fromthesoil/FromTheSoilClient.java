package com.darmstadtium271.fromthesoil;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = FromTheSoil.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = FromTheSoil.MODID, value = Dist.CLIENT)
public class FromTheSoilClient {
    public FromTheSoilClient(ModContainer container) {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
    }
}
