package net.synthetixa.minechem.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.synthetixa.minechem.init.Blocks;
import net.synthetixa.minechem.init.Items;
import net.synthetixa.minechem.init.Tiles;

/**
 * Created by ben on 7/12/16.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        Blocks.init();
        Items.init();
        Tiles.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

}
