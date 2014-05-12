import rpg.gui.Interface;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 * The package for general classes like the main class of the project
 * this main is for the PC gui
 */
public class Main extends Application{
    
    @Override
    public void start(Stage stage) throws Exception {
        Interface gui = new Interface();
        gui.initialize(stage, "RPG App");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
