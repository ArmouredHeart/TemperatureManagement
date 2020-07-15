/** 
 * Project: TemperatureManagement
 * Started: 15/07/2020
 * @author: ArmouredHeart
 * Discord: ArmouredHeart#1208
 * GitHub: https://github.com/ArmouredHeart/TemperatureManagement
 * CurseForge: 
 * Licence: GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
 * Notice: Please refer to original source if you create any derived works.
 * I want to see what you can create!
 * Please enjoy this mod!
*/

// package
package com.github.armouredheart.temperature_management.api;

// Forge imports
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

// Temperature Managment imports

// misc imports
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Declare entry point */
@Mod(value = TemperatureManagment.MOD_ID)
public class TemperatureManagment {

    // *** Attributes ***
    public static final String MOD_ID = "termperature_management";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    // *** Constructors ***

    /** */
    public EonsCore() {
        LOGGER.debug("Creating instance of TemperatureManagement...");

        //
        final ModLoadingContext TMLoadingContext = ModLoadingContext.get();
        final IEventBus TMEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Configs
        //TMLoadingContext.registerConfig();
        
        // Register DeferredRegisters
    
    }

    // *** Methods ***
}