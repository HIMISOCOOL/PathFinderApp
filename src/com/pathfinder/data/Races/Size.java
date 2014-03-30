package com.pathfinder.data.Races;

public enum Size {

	Colossal(-8), Gargantuan(-4), Huge(-2), Large(-1), Medium(0), Small(1), Tiny(2), Diminutive(4), Fine(8);
	
	private int sizeModifier;
	
	public int getSizeModifier() {
		return this.sizeModifier;
	}
	
	private Size(int sizeMod) {
		this.sizeModifier = sizeMod;
	}
}
