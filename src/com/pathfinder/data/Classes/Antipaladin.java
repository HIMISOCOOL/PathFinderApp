package com.pathfinder.data.Classes;

import java.util.HashMap;

import com.pathfinder.data.Classes.Objects.SpellLevelTable;
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

	private SpellLevelTable levelTable;
}