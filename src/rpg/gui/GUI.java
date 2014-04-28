
package rpg.gui;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Matthew
 */
public class GUI{
    public static final String path = "/pathfinder/gui/";
    
    public static FXMLLoader Loader = new FXMLLoader();
    
    

    public void initialize(Stage stage) throws Exception {
        stage.setTitle("Rpg App");
// Creates the scene and loads the main pane
        stage.setScene(createScene(loadMainPane()));

        stage.show();
    }

    /**
     * Loads the main fxml layout. Sets up the window switching Window Class.
     * Loads the first window into the fxml layout.
     *
     * @return the loaded pane.
     * @throws IOException if the pane could not be loaded.
     */
    private Pane loadMainPane() throws IOException {
        FXMLLoader l = new FXMLLoader(getClass().getResource("main.fxml"));
        
        MainController mainController = new MainController();
        mainController.setPath(path);
        
        l.setController(mainController);
        
        Pane mainPane = l.load();

        return mainPane;
    }

    /**
     * Creates the main application scene.
     *
     * @param mainPane the main application layout.
     *
     * @return the created scene.
     */
    private Scene createScene(Pane mainPane) {
        Scene scene = new Scene(mainPane);
//Uncomment if using a stylesheet        
//        scene.getStylesheets().setAll(getClass().getResource("vista.css").toExternalForm());
        return scene;
    }
}
