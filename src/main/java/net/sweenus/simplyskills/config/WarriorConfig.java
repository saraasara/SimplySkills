package net.sweenus.simplyskills.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "warrior")
public class WarriorConfig implements ConfigData {

    public int passiveWarriorArmorMasteryArmorThreshold = 10;
    @ConfigEntry.BoundedDiscrete(max = 100)
    public int passiveWarriorArmorMasteryChance = 25;
    public int passiveWarriorHeavyArmorMasteryDuration = 100;
    public int passiveWarriorHeavyArmorMasteryAmplifier = 0;
    public int passiveWarriorMediumArmorMasteryDuration = 100;
    public int passiveWarriorMediumArmorMasteryAmplifier = 0;
    public int passiveWarriorShieldMasteryFrequency = 10;
    public int passiveWarriorShieldMasteryWeaknessAmplifier = 0;
    public int passiveWarriorShieldMasteryResistanceAmplifier = 0;
    public int passiveWarriorShieldMasteryResistanceAmplifierPerTier = 1;
    @ConfigEntry.BoundedDiscrete(max = 100)
    public int passiveWarriorRebukeChance = 25;
    public int passiveWarriorRebukeWeaknessDuration = 80;
    public int passiveWarriorRebukeWeaknessAmplifier = 0;

}