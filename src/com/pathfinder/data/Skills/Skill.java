package com.pathfinder.data.Skills;

import java.util.HashMap;

import com.pathfinder.data.Attributes.AttributeName;

public class Skill {
	private int rank;
	private AttributeName attrToUse;
	private String name;
	private boolean trained = false;
	/**
	 * this table is for when you get a bonus vs a certain event
	 * e.g- +2 perseption bonus for idenifing evil hats
	 * the string key identify's what the bonus applies against.
	 * as you display the result of your skill check, it also prints out the result
	 * against certan citera. it's up to the player if that critera applies.
	 */
	private HashMap<String, Integer> situationalMod = new HashMap<String, Integer>();
	
}