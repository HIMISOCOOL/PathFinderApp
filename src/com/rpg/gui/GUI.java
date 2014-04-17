
package com.rpg.gui;

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
    final String path = "../../pathfinder/UI/";

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

        Pane mainPane;
        mainPane = FXMLLoader.load(getClass().getResource("main.fxml"));

        MainController mainController = new MainController(path);
        Window.setMainController(mainController);
        Window.swap(path+"characterFluff.fxml");

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
