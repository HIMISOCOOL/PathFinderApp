package pathfinder.data.Items;

public class Armor {
	private ArmorType armorType;
	private String name;
	private int cost;
	private int armorBonus;
	private int maxDexBonus;
	private int armorCheckPenalty;
	private int arcaneSpellFailiure;
	private int speed30feet;
	private int speed20feet;
	private int weight;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the armorType
	 */
	public ArmorType getArmorType() {
		return armorType;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @return the armorBonus
	 */
	public int getArmorBonus() {
		return armorBonus;
	}
	/**
	 * @return the maxDexBonus
	 */
	public int getMaxDexBonus() {
		return maxDexBonus;
	}
	/**
	 * @return the armorCheckPenalty
	 */
	public int getArmorCheckPenalty() {
		return armorCheckPenalty;
	}
	/**
	 * @return the arcaneSpellFailiure
	 */
	public int getArcaneSpellFailiure() {
		return arcaneSpellFailiure;
	}
	/**
	 * @return the speed30feet
	 */
	public int getSpeed30feet() {
		return speed30feet;
	}
	/**
	 * @return the speed20feet
	 */
	public int getSpeed20feet() {
		return speed20feet;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	
	public Armor() {}
	/**
	 * @param armorType
	 * @param cost
	 * @param armorBonus
	 * @param maxDexBonus
	 * @param armorCheckPenalty
	 * @param arcaneSpellFailiure
	 * @param speed30feet
	 * @param speed20feet
	 * @param weight
	 */
	public Armor(String name, ArmorType armorType, int cost, int armorBonus,
			int maxDexBonus, int armorCheckPenalty, int arcaneSpellFailiure,
			int speed30feet, int speed20feet, int weight) {
		this.armorType = armorType;
		this.cost = cost;
		this.armorBonus = armorBonus;
		this.maxDexBonus = maxDexBonus;
		this.armorCheckPenalty = armorCheckPenalty;
		this.arcaneSpellFailiure = arcaneSpellFailiure;
		this.speed30feet = speed30feet;
		this.speed20feet = speed20feet;
		this.weight = weight;
		this.name = name;
	}
}