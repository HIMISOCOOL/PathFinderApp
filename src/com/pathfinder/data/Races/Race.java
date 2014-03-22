package com.pathfinder.data.Races;

import com.pathfinder.data.Attributes.Attribute;
import com.pathfinder.data.Items.Weapon;

public abstract class Race {
	private String name;
	/**
	 * The size of the race
	 */
	private Size size;
	/**
	 * The defalut speed of the race
	 */
	private int speed;
	/**
	 * An array of the languages the race can speak
	 */
	private Language[] languages;
	/**
	 * An array of the Weapons the race can use
	 */
	private Weapon[] weapons;
	/**
	 * An array of the attribute bonus' the race gets
	 */
	private Attribute[] attributeBonus;
	/**
	 * indicates whether the race's speed is effected by armor or encumberance
	 */
	private boolean speedLoss;
	/**
	 * An array of Vision types applicable to the race
	 */
	private VisionType[] visionTypes;
}