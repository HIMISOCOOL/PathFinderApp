package pathfinder.data.Attributes;

/**
 * 
 * @author Matthew Meehan
 *
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
	 * @param value
	 */
	public Ability(AbilityName abilityName,int value) {
		this.abilityName = abilityName;
		this.value = value;
	}
}