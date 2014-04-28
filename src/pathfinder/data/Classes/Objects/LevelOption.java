package pathfinder.data.Classes.Objects;

/**
 * 
 * @author Matthew Meehan Indicates whether the level has a feat or ability
 *         score increase
 */
public enum LevelOption {
	LevelOne(1, true, false), LevelTwo(2, false, false), LevelThree(3, true,
			false), LevelFour(4, false, true), LevelFive(5, true, false), LevelSix(
			6, false, false), LevelSeven(7, true, false), LevelEight(8, false,
			true), LevelNine(9, true, false), LevelTen(10, false, false), LevelEleven(
			11, true, false), LevelTwelve(12, false, true), LevelThirteen(13,
			true, false), LevelFourteen(14, false, false), LevelFifteen(15,
			true, false), LevelSixteen(16, false, true), LevelSeventeen(17,
			true, false), LevelEighteen(18, false, false), LevelNineteen(19,
			true, false), LevelTwenty(20, false, true);

	private boolean feat;
	private boolean abilityScore;
	private int level;

	/**
	 * @return whether there is a new feat this level
	 */
	public boolean Feat() {
		return feat;
	}

	/**
	 * @return whether there is an ability score increase this level
	 */
	public boolean AbilityScore() {
		return abilityScore;
	}

	/**
	 * @return the level of this option
	 */
	public int Level() {
		return level;
	}

	/**
	 * @param The
	 *            level of this option
	 * @param Whether
	 *            a feat is gained this level
	 * @param Whether
	 *            there is an Ability Score increase this level
	 */
	private LevelOption(int level, boolean feat, boolean abilityScore) {
		this.level = level;
		this.feat = feat;
		this.abilityScore = abilityScore;
	}

}
