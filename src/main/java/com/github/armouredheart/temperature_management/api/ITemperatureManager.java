// package
package com.github.armouredheart.temperature_management.api;

// Minecraft imports
import net.minecraft.entity.LivingEntity;

// Forge imports

// Temperature Managment imports

// misc imports

public interface ITemperatureManager<T extends LivingEntity> {
    // *** Attributes ***

    // *** Methods ***

    /** */
    public static void computeTemperatureRank() {
        double blockTemp;
        boolean isOnFire;
        boolean isInWater;
        int heating;
        int cooling;
        int totalInsulation = heating - cooling;
        int level = (int)blockTemp*5; // refine this later
        int bonus = 0;

        // apply +10 if on fire
        if(isOnFire) {bonus = bonus + 10;}

        // 
        if(isInWater) {bonus = bonus - 1;}

        // apply insulation values
        if(level > 0 && totalInsulation > 0) {
            // edge case of having heating while in hot environment
            bonus = bonus + 1;
        } else if(level < 0 && totalInsulation < 0) {
            // edge case of having cooling while in cold environment
            bonus = bonus - 1;
        } else {
            // standard condition
            bonus = bonus + totalInsulation;
        } 
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