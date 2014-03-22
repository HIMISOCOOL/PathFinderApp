/**
 * 
 */
package com.pathfinder.data.Classes.Objects;

import com.pathfinder.data.Attributes.Fortitude;
import com.pathfinder.data.Attributes.Reflex;
import com.pathfinder.data.Attributes.Will;
import com.pathfinder.data.Spells.Spell;

/**
 * @author Matthew Meehan
 * The table of benefits gained each level from a specific spell casting class
 */
public class SpellLevelTable extends LevelTable {

	private Spell[][]spellsPerDay;
	
	/**
	 * The empty constructor for Kryo
	 */
	public SpellLevelTable() { }

	/**
	 * @param baseAttackBonus
	 * @param fortitudeSave
	 * @param reflexSave
	 * @param willSave
	 * @param specialFeatures
	 */
	public SpellLevelTable(int[] baseAttackBonus, Fortitude fortitudeSave,
			Reflex reflexSave, Will willSave, Feature[] specialFeatures) {
		super(baseAttackBonus, fortitudeSave, reflexSave, willSave,
				specialFeatures);
		// TODO Auto-generated constructor stub
	}

}
