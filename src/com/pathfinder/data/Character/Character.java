package com.pathfinder.data.Character;

import com.pathfinder.data.Races.Race;
import com.pathfinder.data.Attributes.Attribute;
import com.pathfinder.data.Attributes.Fortitude;
import com.pathfinder.data.Attributes.Will;
import com.pathfinder.data.Attributes.Reflex;
import com.pathfinder.data.Classes.Class;
import com.pathfinder.data.Classes.Objects.AdvancmentTable;
import com.pathfinder.data.Classes.Objects.LevelOption;
import com.pathfinder.data.Skills.Skill;
import com.pathfinder.data.Feats.Feat;

public class Character {
	private String name;
	private int level;
	private Race race;
	private Attribute[] attributes;
	private Fortitude fortitudeSave;
	private Will willSave;
	private Reflex reflexSave;
	private Class[] classes;
	private Skill[] skills;
	private Feat[] feats;
	/**
	 * get and set for this will need to take into account all of the relevant bonus'
	 */
	private int armorClass;
	
	/**
	 * int between 0 and 2
	 * 0 is slow track
	 * 1 is medium track
	 * 2 is fast track
	 */
	private int experienceTrack;
	private int experienceValue;
	
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 * do not use, set experience level instead
	 */
	protected void setLevel(int level) {
		this.level = level;
	}
	/**
	 * @return the experienceTrack
	 */
	public int getExpTrack() {
		return experienceTrack;
	}
	/**
	 * @param experienceTrack the experienceTrack to set
	 */
	public void setExpTrack(int experienceTrack) {
		this.experienceTrack = experienceTrack;
	}
	/**
	 * @return the experienceValue
	 */
	public int getExp() {
		return experienceValue;
	}
	/**
	 * @param experienceValue the experienceValue to set
	 * every time experience is updated, check to see if leveled
	 */
	public void setExp(int experienceValue) {
		this.experienceValue = experienceValue;
		LevelOption temp = AdvancmentTable.IsLeveled(this.experienceValue, this.experienceTrack);
		if(temp.getLevel()!=this.level) this.level = temp.getLevel();
	}
}