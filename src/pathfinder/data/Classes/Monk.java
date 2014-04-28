package pathfinder.data.Classes;

import pathfinder.data.DiceType;
import pathfinder.data.Character.Alignment;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Classes.Objects.LevelTableRow;
import pathfinder.data.Items.ArmorType;
import pathfinder.data.Items.WeaponType;
import pathfinder.data.Skills.Skill;

/**
 * 
 * @author Matthew
 * http://paizo.com/pathfinderRPG/prd/classes/monk.html#_monk
 */
public class Monk extends Class {
	private LevelTableRow[] levelTable;
	
	private int[] flurryOfBlowsBAB;
	
	private int[] unarmedDamageMultiplier;
	
	private DiceType[] unarmedDamage;
	
	private int[] acBonus;
	
	private int[] fastMovement;

	/**
	 * @return the levelTable
	 */
	public LevelTableRow[] getLevelTable() {
		return levelTable;
	}

	/**
	 * @return the flurryOfBlowsBAB
	 */
	public int[] getFlurryOfBlowsBAB() {
		return flurryOfBlowsBAB;
	}

	/**
	 * @return the unarmedDamageMultiplier
	 */
	public int[] getUnarmedDamageMultiplier() {
		return unarmedDamageMultiplier;
	}

	/**
	 * @return the unarmedDamage
	 */
	public DiceType[] getUnarmedDamage() {
		return unarmedDamage;
	}

	/**
	 * @return the acBonus
	 */
	public int[] getAcBonus() {
		return acBonus;
	}

	/**
	 * @return the fastMovement
	 */
	public int[] getFastMovement() {
		return fastMovement;
	}

	/**
	 * @param name
	 * @param description
	 * @param role
	 * @param level
	 * @param requireAlignments
	 * @param hitDice
	 * @param startingWealthD6
	 * @param skillRanksPerLevel
	 * @param classSkills
	 * @param features
	 * @param weaponProficiencies
	 * @param armorProficiencies
	 * @param levelTable
	 * @param flurryOfBlowsBAB
	 * @param unarmedDamageMultiplier
	 * @param unarmedDamage
	 * @param acBonus
	 * @param fastMovement
	 */
	public Monk(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, Skill[] classSkills,
			Feature[] features, WeaponType[] weaponProficiencies,
			ArmorType[] armorProficiencies, LevelTableRow[] levelTable,
			int[] flurryOfBlowsBAB, int[] unarmedDamageMultiplier,
			DiceType[] unarmedDamage, int[] acBonus, int[] fastMovement) {
		super(name, description, role, level, requireAlignments, hitDice,
				startingWealthD6, skillRanksPerLevel, classSkills, features,
				weaponProficiencies, armorProficiencies);
		this.levelTable = levelTable;
		this.flurryOfBlowsBAB = flurryOfBlowsBAB;
		this.unarmedDamageMultiplier = unarmedDamageMultiplier;
		this.unarmedDamage = unarmedDamage;
		this.acBonus = acBonus;
		this.fastMovement = fastMovement;
	}
	
	
}