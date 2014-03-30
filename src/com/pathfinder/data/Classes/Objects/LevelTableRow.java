package com.pathfinder.data.Classes.Objects;

import com.pathfinder.data.Attributes.SaveAttribute;

/**
 * 
 * @author Matthew Meehan
 * A row of the table of benefits gained each level from a specific class
 */
public class LevelTableRow {
	private int[] baseAttackBonus;
	private SaveAttribute fortitudeSave;
	private SaveAttribute reflexSave;
	private SaveAttribute willSave;
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
	public SaveAttribute getFortSave() {
		return fortitudeSave;
	}

	/**
	 * @return the reflexSave
	 */
	public SaveAttribute getRefSave() {
		return reflexSave;
	}

	/**
	 * @return the willSave
	 */
	public SaveAttribute getWillSave() {
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
	public LevelTableRow(int[] baseAttackBonus, SaveAttribute fortitudeSave,
			SaveAttribute reflexSave, SaveAttribute willSave, Feature[] specialFeatures) {
		super();
		this.baseAttackBonus = baseAttackBonus;
		this.fortitudeSave = fortitudeSave;
		this.reflexSave = reflexSave;
		this.willSave = willSave;
		this.specialFeatures = specialFeatures;
	}
	
	
}