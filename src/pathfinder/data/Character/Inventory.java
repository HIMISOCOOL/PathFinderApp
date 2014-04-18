package pathfinder.data.Character;

import java.util.List;

import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Consumables;
import pathfinder.data.Items.Weapon;

/**
 * @author Matthew Meehan
 * A data class that stores the information about the items the character has on them and equipped
 */
public class Inventory {

	private List<Armor> armor;
	private List<Weapon> weapons;
	private List<Consumables> consumables;

	private List<Armor> armorWorn;
	private List<Weapon> weaponEquipped;

	/**
	 * @return the armor
	 */
	public List<Armor> getArmor() {
		return armor;
	}

	/**
	 * @return the weapons
	 */
	public List<Weapon> getWeapons() {
		return weapons;
	}

	/**
	 * @return the consumables
	 */
	public List<Consumables> getConsumables() {
		return consumables;
	}

	/**
	 * @return the armorWorn
	 */
	public List<Armor> getArmorWorn() {
		return armorWorn;
	}

	/**
	 * @return the weaponEquipped
	 */
	public List<Weapon> getWeaponEquipped() {
		return weaponEquipped;
	}

	public Inventory() {
	}

	/**
	 * @param armor
	 * @param weapons
	 * @param consumables
	 * @param armorWorn
	 * @param weaponEquipped
	 */
	public Inventory(List<Armor> armor, List<Weapon> weapons,
			List<Consumables> consumables, List<Armor> armorWorn,
			List<Weapon> weaponEquipped) {
		super();
		this.armor = armor;
		this.weapons = weapons;
		this.consumables = consumables;
		this.armorWorn = armorWorn;
		this.weaponEquipped = weaponEquipped;
	}
}
