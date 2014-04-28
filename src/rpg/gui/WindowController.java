/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpg.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

/**
 *
 * @author Matthew
 */
public abstract class WindowController implements Initializable{
    Pane pane;
    public MainController mainController;
    private final String fxml;

    /**
     * @return the pane
     */
    public Pane getPane() {
        return pane;
    }

    /**
     * @param pane the pane to set
     */
    public void setPane(Pane pane) {
        this.pane = pane;
    }
    
    /**
     * The actions to take when the window is in view
     */
    public abstract void windowInView();

    @Override
    public void initialize(URL url, ResourceBundle resources) {
        
    }
    public WindowController(MainController mainController, String FXML) {
        this.mainController = mainController;
        this.fxml = FXML;
    }

    public void loadPane() {
        try {
            FXMLLoader l = new FXMLLoader(getClass().getResource(GUI.path+fxml));
            l.setController(this);
            this.pane = l.load();
        } catch (IOException ex) {
            Logger.getLogger(WindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
