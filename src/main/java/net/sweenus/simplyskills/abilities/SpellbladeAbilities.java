package net.sweenus.simplyskills.abilities;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.sweenus.simplyskills.SimplySkills;
import net.sweenus.simplyskills.registry.EffectRegistry;
import net.sweenus.simplyskills.util.HelperMethods;
import net.sweenus.simplyskills.util.SkillReferencePosition;

public class SpellbladeAbilities {

    public static void effectSpellbladeWeaponExpert(PlayerEntity player) {
        if (HelperMethods.isUnlocked("simplyskills:spellblade",
                SkillReferencePosition.spellbladeWeaponExpert, player)) {
            HelperMethods.incrementStatusEffect(player, EffectRegistry.MIGHT, 80, 0, 4);
        }
    }

    //------- SIGNATURE ABILITIES --------


    // Elemental Surge
    public static boolean signatureSpellbladeElementalSurge(String spellbladeSkillTree, PlayerEntity player) {
        int elementalSurgeDuration = SimplySkills.spellbladeConfig.signatureSpellbladeElementalSurgeDuration;
        player.addStatusEffect(new StatusEffectInstance(EffectRegistry.ELEMENTALSURGE,
                elementalSurgeDuration, 0));
        return true;
    }
    // Elemental Impact
    public static boolean signatureSpellbladeElementalImpact(String spellbladeSkillTree, PlayerEntity player) {
        int elementalImpactDuration = SimplySkills.spellbladeConfig.signatureSpellbladeElementalImpactDuration;
        int elementalImpactResistanceAmplifier = SimplySkills.spellbladeConfig.signatureSpellbladeElementalImpactResistanceAmplifier;

        player.addStatusEffect(new StatusEffectInstance(EffectRegistry.ELEMENTALIMPACT,
                elementalImpactDuration, 0));

        if (HelperMethods.isUnlocked(spellbladeSkillTree,
                SkillReferencePosition.spellbladeSpecialisationElementalImpactResistance, player))
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,
                    elementalImpactDuration + 15, elementalImpactResistanceAmplifier));

        return true;
    }
    // Spellweaver
    public static boolean signatureSpellbladeSpellweaver(String spellbladeSkillTree, PlayerEntity player) {
        int spellweaverDuration = SimplySkills.spellbladeConfig.signatureSpellbladeSpellweaverDuration;
        int spellweaverStacks = SimplySkills.spellbladeConfig.signatureSpellbladeSpellweaverStacks;

        player.addStatusEffect(new StatusEffectInstance(EffectRegistry.SPELLWEAVER,
                spellweaverDuration, spellweaverStacks - 1));

        return true;
    }

}
