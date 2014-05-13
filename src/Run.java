
import javafx.application.Application;
import javafx.stage.Stage;
import rpg.gui.Interface;

/**
 *
 * @author Matthew
 */
public class Run extends Application{
    
    @Override
    public void start(Stage stage) throws Exception {
        Interface gui = new Interface();
        gui.initialize(stage, "Pathfinder Data Editor");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
