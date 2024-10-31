package com.harryminsky.harryssnusmod.init;

import com.harryminsky.harryssnusmod.HarrysSnusMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
@Mod.EventBusSubscriber(modid = HarrysSnusMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HarrysSnusMod.MODID);
    public static final RegistryObject<CreativeModeTab> SNUS_TAB = TABS.register("snus_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.snus_tab"))
                    .icon(ItemInit.SNUS_PUCK_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->{
                            output.accept(ItemInit.SNUS_PUCK_ITEM.get());
                            output.accept(ItemInit.POUCH_ITEM.get());
                            })
                    .withSearchBar()
                    .build()
    );

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ItemInit.POUCH_ITEM);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ItemInit.SNUS_PUCK_ITEM);
        }

    }
}