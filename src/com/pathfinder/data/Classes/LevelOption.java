package com.pathfinder.data.Classes;

/**
 * 
 * @author Matthew
 * Indicates whether the level has a feat or ability score increase
 */
public class LevelOption {
	boolean feat;
	boolean abilityScore;
	int level;
	
	/**
	 * @return whether there is a new feat this level
	 */
	public boolean Feat() {
		return feat;
	}
	/**
	 * @return whether there is an ability score increase this level
	 */
	public boolean AbilityScore() {
		return abilityScore;
	}
	/**
	 * @return the level of this option
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param feat
	 * @param abilityScore
	 */
	public LevelOption(int level, boolean feat, boolean abilityScore) {
		this.level = level;
		this.feat = feat;
		this.abilityScore = abilityScore;
	}
	
}
