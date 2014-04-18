/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpg.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class MainController implements Initializable {
    
    private String path;
    
    @FXML
    private Pane mainPane;
    
    @FXML
    private void handleMenuAction(ActionEvent event) {
        //toggles the menu being open or closed
    }
    @FXML
    private void handleCharacterAction(ActionEvent event) {
        Window.swap(path+"characterFluff.fxml");
    }
    @FXML
    private void handleCombatAction(ActionEvent event) {
       Window.swap(path+"combatStats.fxml");
    }
    @FXML
    private void handleInventoryAction(ActionEvent event) {
        Window.swap(path+"inventory.fxml");
    }
    @FXML
    private void handleSkillAction(ActionEvent event) {
        Window.swap(path+"skills.fxml");
    }
    @FXML
    private void handleSpellAction(ActionEvent event) {
        Window.swap(path+"spells.fxml");
    }
    @FXML
    private void handleOptionAction(ActionEvent event) {
        // opens the option menu
    }
    
    /**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    public void swapWindow(Node node) {
        mainPane.getChildren().setAll(node);
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
    
}
