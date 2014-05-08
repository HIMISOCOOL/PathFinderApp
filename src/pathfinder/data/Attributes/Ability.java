package pathfinder.data.Attributes;

/**
 * 
 * @author Real Standard Studios - Matthew Meehan
 * 
 * Base class used for each of the 6 Ability Scores
 */
public class Ability {
	private int value;
	private AbilityName abilityName;

	/**
	 * @return the abilityName
	 */
	public AbilityName getAbilityName() {
		return abilityName;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getModifier() {
		return (this.value-10)/2;
	}
	
	public Ability() {}

	/**
         * @param abilityName
	 * @param value
         * 
         * Constructor for the Ability class
	 */
	public Ability(AbilityName abilityName,int value) {
		this.abilityName = abilityName;
		this.value = value;
	}
}