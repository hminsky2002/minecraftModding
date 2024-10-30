package com.harryminsky.harryssnusmod.init;

import com.harryminsky.harryssnusmod.HarrysSnusMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HarrysSnusMod.MODID);

    public static final RegistryObject<Item> POUCH_ITEM = ITEMS.register("pouch",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(0)
                            .saturationMod(20f)
                                                        .build())

            ));

    public static final RegistryObject<Item> SNUS_PUCK_ITEM = ITEMS.register("snus_puck",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
            ));

}