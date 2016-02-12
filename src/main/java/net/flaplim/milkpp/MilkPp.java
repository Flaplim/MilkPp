package net.flaplim.milkpp;

import net.flaplim.milkpp.item.MilkPpItems;
import net.flaplim.milkpp.item.crafting.MilkPpRecipes;
import net.flaplim.milkpp.proxy.MilkPpProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Hye-Seo on 2016-02-06.
 */

@Mod(modid = MilkPp.MODID, name = MilkPp.NAME, version = MilkPp.VERSION)
public class MilkPp {
    public static final String MODID = "milkpp";
    public static final String NAME = "Milk++";
    public static final String VERSION = "1.0";

    @SidedProxy(modId = MilkPp.MODID, clientSide = "net.flaplim.milkpp.proxy.ClientProxy", serverSide = "net.flaplim.milkpp.proxy.ServerProxy")
    public static MilkPpProxy proxy;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        MilkPpItems.register();

    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        proxy.registerRenders();
        MilkPpRecipes.addRecipes();
    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {

    }
}
