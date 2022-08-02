package io.github.grogdefrog.siege;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Siege.MODID, name = Siege.NAME, version = Siege.VERSION)
public class Siege
{
    public static final String MODID = "siege";
    public static final String NAME = "Siege";
    public static final String VERSION = "ALPHA 0.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("Siege mod is loading");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK");
    }
}
