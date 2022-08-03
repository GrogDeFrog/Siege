package io.github.grogdefrog.siege.core;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.internal.EntitySpawnHandler;
import org.apache.logging.log4j.Logger;

@Mod(modid = Siege.MODID, name = Siege.NAME, version = Siege.VERSION)
public class Siege
{
    public static final String MODID = "siege";
    public static final String NAME = "Siege";
    public static final String VERSION = "ALPHA 0.0.1";

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



    /*
    * Messing around with handling events
    */
    public class siege_event_handler
    {
        @SubscribeEvent
        public void pickupItem(EntityItemPickupEvent event) {
            System.out.println("Item picked up!");
        }

        @SubscribeEvent
        public void mob_spawn(EntityJoinWorldEvent event)
        {

            Entity pp = event.getEntity();
            pp.posY = 100;
            Entity poopoo = event.getEntity();

        }
    }

    public class FML_siege_event_handler
    {
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        // IMPORTANT: Be sure to register your handler on the correct bus!!! (see below)

        // the majority of events use the MinecraftForge event bus:
        MinecraftForge.EVENT_BUS.register(new siege_event_handler());

        // but some are on the FML bus:
        FMLCommonHandler.instance().bus().register(new FML_siege_event_handler());
    }
}
