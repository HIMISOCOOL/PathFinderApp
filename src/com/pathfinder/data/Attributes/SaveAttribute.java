package com.pathfinder.data.Attributes;

/**
 * 
 * @author Matthew Meehan
 *
 */
public class SaveAttribute {
	private int baseValue;
	private int total;
	private int magicMod;
	private int miscMod;

	/**
	 * @return the baseValue
	 */
	public int getBaseValue() {
		return baseValue;
	}

	/**
	 * @param baseValue the baseValue to set
	 */
	public void setBaseValue(int baseValue) {
		this.baseValue = baseValue;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	public void setTotal(Ability pAbility) {
		this.total = pAbility.getModifier()+this.magicMod+this.miscMod;
	}

	/**
	 * @return the magicMod
	 */
	public int getMagicMod() {
		return magicMod;
	}

	/**
	 * @param magicMod the magicMod to set
	 */
	public void setMagicMod(int magicMod) {
		this.magicMod = magicMod;
	}

	/**
	 * @return the miscMod
	 */
	public int getMiscMod() {
		return miscMod;
	}

	/**
	 * @param miscMod the miscMod to set
	 */
	public void setMiscMod(int miscMod) {
		this.miscMod = miscMod;
	}
	
	public SaveAttribute() {}	

	/**
	 * @param baseValue
	 * @param magicMod
	 * @param miscMod
	 */
	public SaveAttribute(Ability pAbility, int baseValue, int magicMod, int miscMod) {
		super();
		this.baseValue = baseValue;
		this.magicMod = magicMod;
		this.miscMod = miscMod;
		this.setTotal(pAbility);
	}
	
	
}