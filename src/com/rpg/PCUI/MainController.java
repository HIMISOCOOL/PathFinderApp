/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rpg.PCUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 *
 * @author Matthew
 */
public class MainController implements Initializable {
    final String path = "../com/pathfinder/UI/";
    @FXML
    private Pane mainPane;
    
    @FXML
    private void handleMenuAction(ActionEvent event) {
        //toggles the menu being open or closed
    }
    @FXML
    private void handleCharacterAction(ActionEvent event) {
        Window.swap("../com/pathfinder/UI/characterFluff.fxml");
    }
    @FXML
    private void handleCombatAction(ActionEvent event) {
       Window.swap("../com/pathfinder/UI/combatStats.fxml");
    }
    @FXML
    private void handleInventoryAction(ActionEvent event) {
        Window.swap("../com/pathfinder/UI/inventory.fxml");
    }
    @FXML
    private void handleSkillAction(ActionEvent event) {
        Window.swap("../com/pathfinder/UI/skills.fxml");
    }
    @FXML
    private void handleSpellAction(ActionEvent event) {
        Window.swap("windows/spells.fxml");
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
