package com.pathfinder.data.Races;

import com.pathfinder.data.Attributes.Ability;
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
	private Ability[] attributeBonus;
	/**
	 * indicates whether the race's speed is effected by armor or encumberance
	 */
	private boolean speedLoss;
	/**
	 * An array of Vision types applicable to the race
	 */
	private VisionType[] visionTypes;

	public Size getSize() {
		return this.size;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @return the languages
	 */
	public Language[] getLanguages() {
		return languages;
	}

	/**
	 * @return the weapons
	 */
	public Weapon[] getWeapons() {
		return weapons;
	}

	/**
	 * @return the attributeBonus
	 */
	public Ability[] getAttributeBonus() {
		return attributeBonus;
	}

	/**
	 * @return the speedLoss
	 */
	public boolean isSpeedLoss() {
		return speedLoss;
	}

	/**
	 * @return the visionTypes
	 */
	public VisionType[] getVisionTypes() {
		return visionTypes;
	}

	public Race() {

	}

	/**
	 * @param name
	 * @param size
	 * @param speed
	 * @param languages
	 * @param weapons
	 * @param attributeBonus
	 * @param speedLoss
	 * @param visionTypes
	 */
	public Race(String name, Size size, int speed, Language[] languages,
			Weapon[] weapons, Ability[] attributeBonus, boolean speedLoss,
			VisionType[] visionTypes) {
		super();
		this.name = name;
		this.size = size;
		this.speed = speed;
		this.languages = languages;
		this.weapons = weapons;
		this.attributeBonus = attributeBonus;
		this.speedLoss = speedLoss;
		this.visionTypes = visionTypes;
	}

}