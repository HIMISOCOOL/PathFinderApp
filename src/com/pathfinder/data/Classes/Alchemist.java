package com.pathfinder.data.Classes;

import com.pathfinder.data.DiceType;
import com.pathfinder.data.Character.Alignment;
import com.pathfinder.data.Classes.Objects.Feature;
import com.pathfinder.data.Items.ArmorType;
import com.pathfinder.data.Items.WeaponType;
import com.pathfinder.data.Skills.Skill;

public class Alchemist extends Class {

	/**
	 * @param name
	 * @param description
	 * @param role
	 * @param level
	 * @param requireAlignments
	 * @param hitDice
	 * @param startingWealthD6
	 * @param skillRanksPerLevel
	 * @param classSkills
	 * @param features
	 * @param weaponProficiencies
	 * @param armorProficiencies
	 */
	public Alchemist(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, Skill[] classSkills,
			Feature[] features, WeaponType[] weaponProficiencies,
			ArmorType[] armorProficiencies) {
		super(name, description, role, level, requireAlignments, hitDice,
				startingWealthD6, skillRanksPerLevel, classSkills, features,
				weaponProficiencies, armorProficiencies);
		// TODO Auto-generated constructor stub
	}
}