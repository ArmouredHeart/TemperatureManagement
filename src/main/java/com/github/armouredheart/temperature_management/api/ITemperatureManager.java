// package
package com.github.armouredheart.temperature_management.api;

// Minecraft imports
import net.minecraft.entity.LivingEntity;

// Forge imports

// Temperature Managment imports

// misc imports

public interface ITemperatureManager<T extends LivingEntity> {
    // *** Attributes ***
    //public static final double MAX_TEMPERATURE_LEVEL = 10.0D;
    //public static final double MIN_TEMPERATURE_LEVEL = -10.0D;

    // *** Methods ***

    /** */
    public static void computeTemperatureRank() {
        double blockTemp;
        boolean isOnFire;
        int heating;
        int cooling;
        int insulation;
        int level = blockTemp
    }

    /** */
    public static void applyTemperatureEffects() {

    }

    /** */
    public static void temperatureTick() {

    }

    /** */
    public void setTemperatureRank(TemperatureRank rank);

    /** */
    public TemperatureRank getTemperatureRank();

    /** */
    default public double getPositionTemperature(T entity) {
        return 0.0;
    }
}