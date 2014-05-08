package pathfinder.data.Character;

/**
 * 
 * @author Real Standard Studios - Joshua Boyd
 * 
 * A data class that stores information about energy resistances
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

        /**
         * Empty constructor for Kryo
         */
	public Resistance() {
	}

	/**
	 * @param resistanceType
	 * @param resistanceAmmount
         * 
         * Constructor for ResistanceS
	 */
	public Resistance(String resistanceType, int resistanceAmmount) {
		super();
		this.resistanceType = resistanceType;
		this.resistanceAmmount = resistanceAmmount;
	}

}
