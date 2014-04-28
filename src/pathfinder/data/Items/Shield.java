/**
 * 
 */
package pathfinder.data.Items;

/**
 * @author Matthew Meehan
 *
 */
public class Shield extends Armor {

	/**
	 * The empty constructor for Kryo
	 */
	public Shield() {
	}

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
	public Shield(String name, ArmorType armorType, int cost, int armorBonus,
			int maxDexBonus, int armorCheckPenalty, int arcaneSpellFailiure,
			int speed30feet, int speed20feet, int weight) {
		super(name, armorType, cost, armorBonus, maxDexBonus, armorCheckPenalty,
				arcaneSpellFailiure, speed30feet, speed20feet, weight);
	}

}
