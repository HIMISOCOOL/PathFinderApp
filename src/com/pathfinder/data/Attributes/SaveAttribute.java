package com.pathfinder.data.Attributes;

public abstract class SaveAttribute {
	private int baseValue;
	private int total;

	public abstract void setTotal(Attribute pAttribute, int pMagicMod, int pMiscMod);
}