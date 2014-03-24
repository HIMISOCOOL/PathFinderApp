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

/**
 * Need to account for resistances and calculate AC
 */
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
	 * get and set for this will need to take into account all of the relevant
	 * bonus'
	 */
	private int armorClass;
	/**
	 * int between 0 and 2; 0 is slow track, 1 is medium track, 2 is fast track
	 */
	private int experienceTrack;
	private int experienceValue;
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	/**
	 * @return the race
	 */
	public Race getRace() {
		return race;
	}
	/**
	 * @param race the race to set
	 */
	public void setRace(Race race) {
		this.race = race;
	}
	/**
	 * @return the attributes
	 */
	public Attribute[] getAttributes() {
		return attributes;
	}
	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Attribute[] attributes) {
		this.attributes = attributes;
	}
	/**
	 * @return the fortitudeSave
	 */
	public Fortitude getFortitudeSave() {
		return fortitudeSave;
	}
	/**
	 * @param fortitudeSave the fortitudeSave to set
	 */
	public void setFortitudeSave(Fortitude fortitudeSave) {
		this.fortitudeSave = fortitudeSave;
	}
	/**
	 * @return the willSave
	 */
	public Will getWillSave() {
		return willSave;
	}
	/**
	 * @param willSave the willSave to set
	 */
	public void setWillSave(Will willSave) {
		this.willSave = willSave;
	}
	/**
	 * @return the reflexSave
	 */
	public Reflex getReflexSave() {
		return reflexSave;
	}
	/**
	 * @param reflexSave the reflexSave to set
	 */
	public void setReflexSave(Reflex reflexSave) {
		this.reflexSave = reflexSave;
	}
	/**
	 * @return the classes
	 */
	public Class[] getClasses() {
		return classes;
	}
	/**
	 * @param classes the classes to set
	 */
	public void setClasses(Class[] classes) {
		this.classes = classes;
	}
	/**
	 * @return the skills
	 */
	public Skill[] getSkills() {
		return skills;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}
	/**
	 * @return the feats
	 */
	public Feat[] getFeats() {
		return feats;
	}
	/**
	 * @param feats the feats to set
	 */
	public void setFeats(Feat[] feats) {
		this.feats = feats;
	}
	/**
	 * @return the armorClass
	 */
	public int getArmorClass() {
		return armorClass;
	}
	/**
	 * @param armorClass the armorClass to set
	 */
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	/**
	 * @return the experienceTrack
	 */
	public int getExperienceTrack() {
		return experienceTrack;
	}
	/**
	 * @param experienceTrack the experienceTrack to set
	 */
	public void setExperienceTrack(int experienceTrack) {
		this.experienceTrack = experienceTrack;
	}
	/**
	 * @return the experienceValue
	 */
	public int getExperienceValue() {
		return experienceValue;
	}
	/**
	 * @param experienceValue 
	 *            the experienceValue to set
	 * @description every time experience is updated, check to see if leveled
	 */
	public void setExp(int experienceValue) {
		this.experienceValue = experienceValue;
		LevelOption temp = AdvancmentTable.IsLeveled(this.experienceValue,
				this.experienceTrack);
		if (temp.Level() != this.level)
			this.level = temp.Level();
	}
	
	public Character() {}
	
	/**
	 * @param name
	 * @param level
	 * @param race
	 * @param attributes
	 * @param fortitudeSave
	 * @param willSave
	 * @param reflexSave
	 * @param classes
	 * @param skills
	 * @param feats
	 * @param armorClass
	 * @param experienceTrack
	 * @param experienceValue
	 */
	public Character(String name, int level, Race race, Attribute[] attributes,
			Fortitude fortitudeSave, Will willSave, Reflex reflexSave,
			Class[] classes, Skill[] skills, Feat[] feats, int armorClass,
			int experienceTrack, int experienceValue) {
		this.name = name;
		this.level = level;
		this.race = race;
		this.attributes = attributes;
		this.fortitudeSave = fortitudeSave;
		this.willSave = willSave;
		this.reflexSave = reflexSave;
		this.classes = classes;
		this.skills = skills;
		this.feats = feats;
		this.armorClass = armorClass;
		this.experienceTrack = experienceTrack;
		this.experienceValue = experienceValue;
	}	
}