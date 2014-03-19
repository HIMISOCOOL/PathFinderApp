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

	public int getRange(int level) {
		return this.range+(this.rangePerLevel*level);
	}

	public void setRange(int range) {
		this.range = range;
	}
}