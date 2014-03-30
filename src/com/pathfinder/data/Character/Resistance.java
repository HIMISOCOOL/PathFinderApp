package com.pathfinder.data.Character;

/**
 * 
 * @author Joshua Boyd
 * 
 */
public class Resistance {
	private String resistanceType;
	private int resistanceAmmount;

	/**
	 * @return the resistanceType
	 */
	public String getResistanceType() {
		return resistanceType;
	}

	/**
	 * @return the resistanceAmmount
	 */
	public int getResistanceAmmount() {
		return resistanceAmmount;
	}

	/**
	 * @param resistanceAmmount
	 *            the resistanceAmmount to set
	 */
	public void setResistanceAmmount(int resistanceAmmount) {
		this.resistanceAmmount = resistanceAmmount;
	}

	public Resistance() {
	}

	/**
	 * @param resistanceType
	 * @param resistanceAmmount
	 */
	public Resistance(String resistanceType, int resistanceAmmount) {
		super();
		this.resistanceType = resistanceType;
		this.resistanceAmmount = resistanceAmmount;
	}

}
