package com.pathfinder.data.Character;

import com.pathfinder.data.Races.Race;
import com.pathfinder.data.Attributes.Attribute;
import com.pathfinder.data.Attributes.Fortitude;
import com.pathfinder.data.Attributes.Will;
import com.pathfinder.data.Attributes.Reflex;
import com.pathfinder.data.Classes.Class;
import com.pathfinder.data.Skills.Skill;
import com.pathfinder.data.Feats.Feat;

public class Character {
	private String name;
	private int level;
	
//  Why are these needed? mostly the attack rolls but I dont understand your logic for armor value - Matthew	
//	private int attackRolls;
	private int armourValue;
	
	private Race race;
	private Attribute[] attributes;
	private Fortitude fortitudeSave;
	private Will willSave;
	private Reflex reflexSave;
	private Class[] classes;
	private Skill[] skills;
	private Feat[] feats;
}