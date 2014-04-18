/**
 * The package for general classes like the main class of the project
 * this main is for the PC gui
 */


import rpg.gui.GUI;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Real Standard Studios
 *
 */
public class Main extends Application{
    
    @Override
    public void start(Stage stage) throws Exception {
        GUI gui = new GUI();
        gui.initialize(stage);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
