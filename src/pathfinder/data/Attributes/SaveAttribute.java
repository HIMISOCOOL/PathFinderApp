package pathfinder.data.Attributes;

/**
 * 
 * @author Real Standard Studios - Matthew Meehan
 * 
 * The SaveAttribute class handles Fortitude,
 * Reflex and Will saving throw information
 *
 */
public class SaveAttribute {
	private int baseValue;
	private int total;
	private int magicMod;
	private int miscMod;
        private Ability abilityScore;

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
        
        /**
         * Collects information from getModifier, magicMod & miscMod
         * and totals them in total
         */
	public void setTotal() {
		this.total = this.abilityScore.getModifier()
                    + this.magicMod + this.miscMod;
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
	
        /**
         * Empty constructor for Kryo
         */
	public SaveAttribute() {}	

	/**
         * @param pAbility
	 * @param baseValue
	 * @param magicMod
	 * @param miscMod
         * 
         * Constructor for SaveAttribute
	 */
	public SaveAttribute(Ability pAbility, int baseValue, int magicMod, int miscMod) {
		this.baseValue = baseValue;
		this.magicMod = magicMod;
		this.miscMod = miscMod;
                this.abilityScore = pAbility;
		this.setTotal();
	}
	
	
}
