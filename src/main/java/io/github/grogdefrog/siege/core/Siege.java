package io.github.grogdefrog.siege.core;

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
        // Sets up the logger to accept input from our lovely mod
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Siege has been successfully initialized!");
    }
}
