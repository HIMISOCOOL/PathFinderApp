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
public class SpellLevelTableRow extends LevelTableRow {

	private Spell[] spellsPerDay;
	
	/**
	 * @return the spellsPerDay
	 */
	public Spell[] getSpellsPerDay() {
		return spellsPerDay;
	}

	/**
	 * The empty constructor for Kryo
	 */
	public SpellLevelTableRow() { }

	/**
	 * @param baseAttackBonus
	 * @param fortitudeSave
	 * @param reflexSave
	 * @param willSave
	 * @param specialFeatures
	 */
	public SpellLevelTableRow(int[] baseAttackBonus, Fortitude fortitudeSave,
			Reflex reflexSave, Will willSave, Feature[] specialFeatures, Spell[] spellsPerDay) {
		super(baseAttackBonus, fortitudeSave, reflexSave, willSave,
				specialFeatures);
		this.spellsPerDay = spellsPerDay;
	}

}
