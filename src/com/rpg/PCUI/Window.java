package com.rpg.PCUI;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
import javafx.scene.Node;

/**
 * Utility class for controlling navigation between vistas.
 *
 * All methods on the navigator are static to facilitate simple access from
 * anywhere in the application.
 */
public class Window {

    /**
     * The main application layout controller.
     */
    private static MainController mainController;

    /**
     * Stores the main controller for later use in navigation tasks.
     *
     * @param mainController the main application layout controller.
     */
    public static void setMainController(MainController mainController) {
        Window.mainController = mainController;
    }

    /**
     * Loads the vista specified by the fxml file into the vistaHolder pane of
     * the main application layout.
     *
     * Previously loaded vista for the same fxml file are not cached. The fxml
     * is loaded anew and a new vista node hierarchy generated every time this
     * method is invoked.
     *
     * A more sophisticated load function could potentially add some
     * enhancements or optimizations, for example: cache FXMLLoaders cache
     * loaded vista nodes, so they can be recalled or reused allow a user to
     * specify vista node reuse or new creation allow back and forward history
     * like a browser
     *
     * @param fxml the fxml file to be loaded.
     */
    public static void swap(String fxml) {
        try {
            // Load file as XML
            mainController.swapWindow((Node) FXMLLoader.load(Window.class.getResource(fxml)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
