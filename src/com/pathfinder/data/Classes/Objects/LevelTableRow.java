package com.pathfinder.data.Classes.Objects;

import com.pathfinder.data.Attributes.Fortitude;
import com.pathfinder.data.Attributes.Reflex;
import com.pathfinder.data.Attributes.Will;

/**
 * 
 * @author Matthew Meehan
 * A row of the table of benefits gained each level from a specific class
 */
public class LevelTableRow {
	private int[] baseAttackBonus;
	private Fortitude fortitudeSave;
	private Reflex reflexSave;
	private Will willSave;
	private Feature[] specialFeatures;
	
	/**
	 * @return the baseAttackBonus
	 */
	public int[] getBAB() {
		return baseAttackBonus;
	}

	/**
	 * @return the fortitudeSave
	 */
	public Fortitude getFortSave() {
		return fortitudeSave;
	}

	/**
	 * @return the reflexSave
	 */
	public Reflex getRefSave() {
		return reflexSave;
	}

	/**
	 * @return the willSave
	 */
	public Will getWillSave() {
		return willSave;
	}

	/**
	 * @return the specialFeatures
	 */
	public Feature[] getSpecialFeatures() {
		return specialFeatures;
	}
		
	/**
	 * the empty Constructor for Kryo
	 */
	public LevelTableRow() { }
	
	/**
	 * @param baseAttackBonus
	 * @param fortitudeSave
	 * @param reflexSave
	 * @param willSave
	 * @param specialFeatures
	 */
	public LevelTableRow(int[] baseAttackBonus, Fortitude fortitudeSave,
			Reflex reflexSave, Will willSave, Feature[] specialFeatures) {
		super();
		this.baseAttackBonus = baseAttackBonus;
		this.fortitudeSave = fortitudeSave;
		this.reflexSave = reflexSave;
		this.willSave = willSave;
		this.specialFeatures = specialFeatures;
	}
	
	
}