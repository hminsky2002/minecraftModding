package com.harryminsky.harryssnusmod;

import com.harryminsky.harryssnusmod.init.CreativeTabInit;
import com.harryminsky.harryssnusmod.init.ItemInit;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HarrysSnusMod.MODID)
public class HarrysSnusMod {
  public static final String MODID = "harryssnusmod";

  @SuppressWarnings("removal")
  public HarrysSnusMod () {
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

    ItemInit.ITEMS.register(bus);
    CreativeTabInit.TABS.register(bus);
  }
}