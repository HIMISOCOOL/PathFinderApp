/**
 * The package for general classes like the main class of the project
 * this main is for the PC gui
 */
package com.rpg;

import com.rpg.gui.MainController;
import com.rpg.gui.Window;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Real Standard Studios
 *
 */
public class Main extends Application{
    final String path = "../../pathfinder/UI/";
    
    @Override
    public void start(Stage stage) throws Exception {
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
        FXMLLoader loader = new FXMLLoader();

        Pane mainPane = (Pane) loader.load(
                getClass().getResourceAsStream("main.fxml"));

        MainController mainController = loader.getController();
        mainController.setPath(path);
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
    /**
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
