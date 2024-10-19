package com.udontabetai.hyperroost;

import com.udontabetai.hyperroost.item.ItemTest;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = "hyper_roost", version = "1.0.0", name = "HyperRoostMod")

public class HyperRoostMod {
    public static final Item TEST = new ItemTest();
    @EventHandler
    public void construct(FMLConstructionEvent event){
    MinecraftForge.EVENT_BUS.register(this);}

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register event) {
        event.getRegistry().register(HyperRoostMod.TEST);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(TEST, 0, new ModelResourceLocation(new ResourceLocation("hyper_roost", "test"), "inventory"));
    }
}

