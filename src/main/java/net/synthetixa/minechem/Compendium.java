package net.synthetixa.minechem;

/**
 * Created by ben on 7/12/16.
 */
public class Compendium {

    //@Mod
    public static final String MODID = "minechem";
    public static final String NAME = "Minechem";
    public static final String VERSION = "7.0.0";
    public static final String DEPS = "required-after:Tesla";
    public static final String MCVERSION = "[1.10.2]";

    //@SidedProxy
    public static final String CLIENTPROXY = "net.synthetixa.minechem.client.ClientProxy";
    public static final String COMMONPROXY = "net.synthetixa.minechem.common.CommonProxy";
}
