package pathfinder.data.Feats;

/**
 * 
 * @author Real Standard Studios - Matthew Meehan
 * 
 * A data class for character Feats
 */
public class Feat {
	private String name;
	private Feat prerequisite;
	private String benefit;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the prerequisite
     */
    public Feat getPrerequisite() {
        return prerequisite;
    }

    /**
     * @return the benefit
     */
    public String getBenefit() {
        return benefit;
    }
    
    public Feat() {}
    
    public Feat(String name, Feat prerequisite, String benefit) {
        this.name = name;
        this.prerequisite = prerequisite;
        this.benefit = benefit;
    }
}