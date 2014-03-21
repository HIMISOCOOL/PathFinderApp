package com.pathfinder.data.Classes;

import java.util.HashMap;

import com.pathfinder.data.Spells.Spell;

public class Antipaladin extends Class {
	/**
	 * An array of a HashMaps containing spells, an index of the array equals a level
	 */
	private HashMap<String,Spell>[] spells;
}