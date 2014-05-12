
import javafx.application.Application;
import javafx.stage.Stage;
import rpg.gui.GUI;

/**
 *
 * @author Matthew
 */
public class Run extends Application{
    
    @Override
    public void start(Stage stage) throws Exception {
        GUI gui = new GUI();
        gui.initialize(stage, "RPG App");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
