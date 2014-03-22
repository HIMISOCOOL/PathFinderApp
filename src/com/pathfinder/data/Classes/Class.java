package com.pathfinder.data.Classes;

import com.pathfinder.data.DiceType;
import com.pathfinder.data.Character.Alignment;
import com.pathfinder.data.Classes.Objects.Feature;
import com.pathfinder.data.Items.ArmorType;
import com.pathfinder.data.Items.WeaponType;
import com.pathfinder.data.Skills.Skill;

/**
 * 
 * @author Matthew Meehan
 * A generic class for classes
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
	 * The skill ranks gained per level, Need to make sure get/set acounts for the fact that this is an int+INTMOD
	 */
	private int skillRanksPerLevel;
	
	/**
	 * The list of skills a class is trained in
	 */
	private Skill[] classSkills;
	
	/**
	 * A list of the Features the class has, Features is a generic type, I might remove this later
	 */
	private Feature[] Features;
	
	private WeaponType[] weaponProficiencies;
	
	private ArmorType[] armorProficiencies;
}