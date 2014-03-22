package com.pathfinder.data.Classes.Objects;

/**
 * 
 * @author Matthew Meehan
 * the generic Class Feature
 */
public abstract class Feature {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public Feature() { }
	
	/**
	 * @param name
	 */
	public Feature(String name) {
		this.name = name;
	}
}
