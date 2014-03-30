package com.pathfinder.data.Skills;

import java.util.HashMap;

import com.pathfinder.data.Attributes.AbilityName;

/**
 * @description The skill class
 */
public class Skill {
	private int rank;
	private AbilityName attrToUse;
	private String name;
	private boolean trained = false;
	/**
	 * this table is for when you get a bonus vs a certain event e.g- +2
	 * perseption bonus for idenifing evil hats the string key identify's what
	 * the bonus applies against. as you display the result of your skill check,
	 * it also prints out the result against certan citera. it's up to the
	 * player if that critera applies.
	 */
	private HashMap<String, Integer> situationalMod = new HashMap<String, Integer>();

	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @return the attrToUse
	 */
	public AbilityName getAttrToUse() {
		return attrToUse;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the trained
	 */
	public boolean isTrained() {
		return trained;
	}

	/**
	 * @return the situationalMod
	 */
	public HashMap<String, Integer> getSituationalMod() {
		return situationalMod;
	}

	public Skill() {
	}

	/**
	 * @param rank
	 * @param attrToUse
	 * @param name
	 * @param trained
	 * @param situationalMod
	 */
	public Skill(int rank, AbilityName attrToUse, String name,
			boolean trained, HashMap<String, Integer> situationalMod) {
		this.rank = rank;
		this.attrToUse = attrToUse;
		this.name = name;
		this.trained = trained;
		this.situationalMod = situationalMod;
	}

}