package com.pathfinder.data.Classes;

import java.util.HashMap;

import com.pathfinder.data.DiceType;
import com.pathfinder.data.Character.Alignment;
import com.pathfinder.data.Classes.Objects.Feature;
import com.pathfinder.data.Classes.Objects.SpellLevelTableRow;
import com.pathfinder.data.Items.ArmorType;
import com.pathfinder.data.Items.WeaponType;
import com.pathfinder.data.Skills.Skill;
import com.pathfinder.data.Spells.Spell;

/**
 * 
 * @author Matthew Meehan
 * The AntiPaladin Class http://paizo.com/pathfinderRPG/prd/advanced/coreClasses/paladin.html#antipaladin-(alternate-class)
 */
public class Antipaladin extends Class {
	/**
	 * An array of a HashMaps containing spells, an index of the array equals a
	 * level
	 */
	private HashMap<String, Spell>[] spells;

	private SpellLevelTableRow[] levelTable;

	/**
	 * @return the spells
	 */
	public HashMap<String, Spell>[] getSpells() {
		return spells;
	}

	/**
	 * @return the levelTable
	 */
	public SpellLevelTableRow[] getLevelTable() {
		return levelTable;
	}

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
	 * @param spells
	 * @param levelTable
	 */
	public Antipaladin(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, Skill[] classSkills,
			Feature[] features, WeaponType[] weaponProficiencies,
			ArmorType[] armorProficiencies, HashMap<String, Spell>[] spells,
			SpellLevelTableRow[] levelTable) {
		super(name, description, role, level, requireAlignments, hitDice,
				startingWealthD6, skillRanksPerLevel, classSkills, features,
				weaponProficiencies, armorProficiencies);
		this.spells = spells;
		this.levelTable = levelTable;
	}
	
	
}