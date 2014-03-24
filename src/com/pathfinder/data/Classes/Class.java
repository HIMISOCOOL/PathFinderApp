package com.pathfinder.data.Classes;

import com.pathfinder.data.DiceType;
import com.pathfinder.data.Character.Alignment;
import com.pathfinder.data.Classes.Objects.Feature;
import com.pathfinder.data.Items.ArmorType;
import com.pathfinder.data.Items.WeaponType;
import com.pathfinder.data.Skills.Skill;

/**
 * 
 * @author Matthew Meehan A generic class for classes
 */
public abstract class Class {
	/**
	 * The name of the class
	 */
	private String name;

	/**
	 * Some flavor Text about the Class from the SRD
	 */
	private String description;

	/**
	 * The role of the Class as described by the SRD
	 */
	private String role;

	/**
	 * The level of the class
	 */
	private int level;

	/**
	 * Whether the class has any alignment requirements
	 */
	private Alignment requireAlignments[];

	/**
	 * The dice type rolled for new HP every level
	 */
	private DiceType hitDice;

	/**
	 * The number of d6*10 this class rolls to determine it's starting wealth
	 */
	private int startingWealthD6;

	/**
	 * The skill ranks gained per level, Need to make sure get/set acounts for
	 * the fact that this is an int+INTMOD
	 */
	private int skillRanksPerLevel;

	/**
	 * The list of skills a class is trained in
	 */
	private Skill[] classSkills;

	/**
	 * A list of the Features the class has, Features is a generic type, I might
	 * remove this later
	 */
	private Feature[] features;

	private WeaponType[] weaponProficiencies;

	private ArmorType[] armorProficiencies;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the requireAlignments
	 */
	public Alignment[] getRequireAlignments() {
		return requireAlignments;
	}

	/**
	 * @return the hitDice
	 */
	public DiceType getHitDice() {
		return hitDice;
	}

	/**
	 * @return the startingWealthD6
	 */
	public int getStartingWealthD6() {
		return startingWealthD6;
	}

	/**
	 * @return the skillRanksPerLevel
	 */
	public int getSkillRanksPerLevel() {
		return skillRanksPerLevel;
	}

	/**
	 * @return the classSkills
	 */
	public Skill[] getClassSkills() {
		return classSkills;
	}

	/**
	 * @return the features
	 */
	public Feature[] getFeatures() {
		return features;
	}

	/**
	 * @return the weaponProficiencies
	 */
	public WeaponType[] getWeaponProficiencies() {
		return weaponProficiencies;
	}

	/**
	 * @return the armorProficiencies
	 */
	public ArmorType[] getArmorProficiencies() {
		return armorProficiencies;
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
	 */
	public Class(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, Skill[] classSkills,
			Feature[] features, WeaponType[] weaponProficiencies,
			ArmorType[] armorProficiencies) {
		this.name = name;
		this.description = description;
		this.role = role;
		this.level = level;
		this.requireAlignments = requireAlignments;
		this.hitDice = hitDice;
		this.startingWealthD6 = startingWealthD6;
		this.skillRanksPerLevel = skillRanksPerLevel;
		this.classSkills = classSkills;
		this.features = features;
		this.weaponProficiencies = weaponProficiencies;
		this.armorProficiencies = armorProficiencies;
	}
	
	
}