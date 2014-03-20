package com.pathfinder.data.Races;

import com.pathfinder.data.Attributes.Attribute;
import com.pathfinder.data.Items.Weapon;

public abstract class Race {
	private String name;
	private Size size;
	private int speed;
	private Language[] languages;
	private Weapon[] weapons;
	private Attribute[] attributeBonus;
	/**
	 * indicates whether the race's speed is effected by armor or encumberance
	 */
	private boolean speedLoss;
	private VisionType[] visionTypes;
	private String creatureSubtipe;
}