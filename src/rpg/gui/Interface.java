
package rpg.gui;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Matthew
 */
public class Interface extends JefXif.GUI{
    
    /**
     *
     * @param stage
     * @param Title
     * @throws Exception
     */
    @Override
    public void initialize(Stage stage, String Title) throws Exception {
        JefXif.GUI.Path = "/pathfinder/gui/";
        super.initialize(stage, Title);
// Creates the scene and loads the main pane
        stage.setScene(super.createScene(loadMainPane()));

        stage.show();
    }

    /**
     * Loads the main fxml layout. Sets up the window switching Window Class.
     * Loads the first window into the fxml layout.
     *
     * @return the loaded pane.
     * @throws IOException if the pane could not be loaded.
     */
    @Override
    public Pane loadMainPane() throws IOException {
        FXMLLoader l = new FXMLLoader(getClass().getResource("main.fxml"));
        
        MainController mainController = new MainController();
        mainController.setPath(Path);
        
        l.setController(mainController);
        
        Pane mainPane = (Pane) l.load();

        return mainPane;
    }
}
