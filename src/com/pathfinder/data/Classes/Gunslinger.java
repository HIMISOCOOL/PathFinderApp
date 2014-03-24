package com.pathfinder.data.Classes;

import com.pathfinder.data.DiceType;
import com.pathfinder.data.Character.Alignment;
import com.pathfinder.data.Classes.Objects.Feature;
import com.pathfinder.data.Classes.Objects.LevelTableRow;
import com.pathfinder.data.Items.ArmorType;
import com.pathfinder.data.Items.WeaponType;
import com.pathfinder.data.Skills.Skill;


/**
 * 
 * @author Matthew
 * The Gunslinger Class http://paizo.com/pathfinderRPG/prd/ultimateCombat/classes/gunslinger.html
 */
public class Gunslinger extends Class {
	
	private LevelTableRow[] levelTable;

	/**
	 * @return the levelTable
	 */
	public LevelTableRow[] getLevelTable() {
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
	 * @param levelTable
	 */
	public Gunslinger(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, Skill[] classSkills,
			Feature[] features, WeaponType[] weaponProficiencies,
			ArmorType[] armorProficiencies, LevelTableRow[] levelTable) {
		super(name, description, role, level, requireAlignments, hitDice,
				startingWealthD6, skillRanksPerLevel, classSkills, features,
				weaponProficiencies, armorProficiencies);
		this.levelTable = levelTable;
	}
	
	
}