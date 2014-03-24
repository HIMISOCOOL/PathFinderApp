package com.pathfinder.data.Spells;

import com.pathfinder.data.Attributes.SaveAttribute;

public class Spell {
	private String school;
	private int castingTime;
	private int range;
	private int rangePerLevel;
	private String effect;
	private int duration;
	private SaveAttribute savingThrow;
	private boolean spellResistance;
	private String description;
	private String name;
	
	
	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}
	/**
	 * @return the castingTime
	 */
	public int getCastingTime() {
		return castingTime;
	}
	/**
	 * @return the range
	 * @param the level of the caster
	 */
	public int getRange(int level) {
		return this.range+(this.rangePerLevel*level);
	}
	/**
	 * @return the rangePerLevel
	 */
	public int getRangePerLevel() {
		return rangePerLevel;
	}
	/**
	 * @return the effect
	 */
	public String getEffect() {
		return effect;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @return the savingThrow
	 */
	public SaveAttribute getSavingThrow() {
		return savingThrow;
	}
	/**
	 * @return the spellResistance
	 */
	public boolean isSpellResistance() {
		return spellResistance;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public Spell() {}
	
	/**
	 * @param school
	 * @param castingTime
	 * @param range
	 * @param rangePerLevel
	 * @param effect
	 * @param duration
	 * @param savingThrow
	 * @param spellResistance
	 * @param description
	 * @param name
	 */
	public Spell(String school, int castingTime, int range, int rangePerLevel,
			String effect, int duration, SaveAttribute savingThrow,
			boolean spellResistance, String description, String name) {
		this.school = school;
		this.castingTime = castingTime;
		this.range = range;
		this.rangePerLevel = rangePerLevel;
		this.effect = effect;
		this.duration = duration;
		this.savingThrow = savingThrow;
		this.spellResistance = spellResistance;
		this.description = description;
		this.name = name;
	}
	
	
}