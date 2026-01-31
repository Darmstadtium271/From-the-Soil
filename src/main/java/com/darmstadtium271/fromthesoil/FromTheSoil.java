package com.darmstadtium271.fromthesoil;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod(FromTheSoil.MODID)
public class FromTheSoil {
    public static final String MODID = "fromthesoil";
    public static final Logger LOGGER = LogUtils.getLogger();
    public FromTheSoil(IEventBus modEventBus, ModContainer modContainer) {

    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }
}
