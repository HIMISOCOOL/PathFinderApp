package pathfinder.data.Skills;

import java.util.HashMap;

import pathfinder.data.Attributes.AbilityName;

/**
 * 
 * @Author Real Standard Studios - Matthew Meehan
 * @description The skill class
 */
public class Skill {
	private int rank;
	private AbilityName attrToUse;
	private String name;
	private boolean trained = false;
	/**
	 * this table is for when you get a bonus vs a certain event e.g- +2
	 * perception bonus for identifying evil hats, the string key 
         * identifies what the bonus applies against. as you display the result 
         * of your skill check, it also prints out the result against 
         * certain criteria. it's up to the player if that criteria applies.
	 */
	private HashMap<String, Integer> situationalMod 
                = new HashMap<String, Integer>();

	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @return the attrToUse
	 */
	public AbilityName getAttrToUse() {
		return attrToUse;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the trained
	 */
	public boolean isTrained() {
		return trained;
	}

	/**
	 * @return the situationalMod
	 */
	public HashMap<String, Integer> getSituationalMod() {
		return situationalMod;
	}

        /**
         * Empty constructor for Kryo
         */
	public Skill() {
	}

	/**
	 * @param rank
	 * @param attrToUse
	 * @param name
	 * @param trained
	 * @param situationalMod
         * 
         * Constructor for Skill
	 */
	public Skill(int rank, AbilityName attrToUse, String name,
                     boolean trained, HashMap<String, Integer> situationalMod) {
		this.rank = rank;
		this.attrToUse = attrToUse;
		this.name = name;
		this.trained = trained;
		this.situationalMod = situationalMod;
	}

}