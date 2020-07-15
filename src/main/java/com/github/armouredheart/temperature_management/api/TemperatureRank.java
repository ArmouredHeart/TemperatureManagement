// package
package com.github.armouredheart.temperature_management.api;

// Minecraft imports

// Forge imports

// Temperature Managment imports

// misc imports

public enum TemperatureRank implements Comparable<TemperatureRank> {
    // Hot ranks
    SCALDING(5),
    SWELTERING(4),
    HOT(3),
    TOASTY(2),

    // Middle ranks
    WARM(1),
    COMFORTABLE(0),
    CHILLY(-1),

    // Cold 
    NIPPY(-2),
    COLD(-3),
    FRIGID(-4),
    FREEZING(-5);

    // *** Attributes ***
    private int level;

    // *** Constructors ***
    
    /** 
     * @param level integer value of rank
    */
    private TemperatureRank(int level) {
        this.level = level;
    }

    // *** Methods ***

    /** */
    public int getLevel() {return this.level;}

    /** */
    @Override
    public int compareTo(TemperatureRank otherRank) {
        if(this.getLevel() == otherRank.getLevel()) {
            return 0;
        } else if(this.getLevel() > otherRank.getLevel()) {
            return 1;
        } else {
            return -1;
        }
    }
}