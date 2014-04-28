package pathfinder.data.Classes.Objects;

/**
 * 
 * @author Matthew Meehan
 * the generic Class Feature
 */
public abstract class Feature {
	private String name;
	
	private String description;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

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
	public Feature(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
