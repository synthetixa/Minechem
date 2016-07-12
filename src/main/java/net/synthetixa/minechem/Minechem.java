package net.synthetixa.minechem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.synthetixa.minechem.common.CommonProxy;

/**
 * Created by ben on 7/12/16.
 */

@Mod(modid = Compendium.MODID, name = Compendium.NAME, version = Compendium.VERSION, dependencies = Compendium.DEPS, acceptedMinecraftVersions = Compendium.MCVERSION)
public class Minechem {

    @SidedProxy(clientSide = Compendium.CLIENTPROXY, serverSide = Compendium.COMMONPROXY, modId = Compendium.MODID)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }


}
