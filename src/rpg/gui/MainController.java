package rpg.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import pathfinder.gui.*;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class MainController implements Initializable {
    
    private String path;
    
    public ArrayList<WindowController>windows;
    
    @FXML
    private Pane mainPane;
    
    @FXML
    private void handleMenuAction(ActionEvent event) {
        //toggles the menu being open or closed
    }
    @FXML
    private void handleCharacterAction(ActionEvent event) {
        windows.get(0).windowInView();
    }
    @FXML
    private void handleCombatStatsAction(ActionEvent event) {
        windows.get(1).windowInView();
    }
    @FXML
    private void handleInventoryAction(ActionEvent event) {
        windows.get(2).windowInView();
    }
    @FXML
    private void handleSkillsAction(ActionEvent event) {
        windows.get(3).windowInView();
    }
    @FXML
    private void handleSpellsAction(ActionEvent event) {
        windows.get(4).windowInView();
    }
    @FXML
    private void handleOtherCharacterAction(ActionEvent event) {
        windows.get(5).windowInView();
    }
    
    @FXML
    private void handleCombatAction(ActionEvent event) {
        windows.get(6).windowInView();
    }
    
    @FXML
    private void handleNewCharacterAction(ActionEvent event) {
        windows.get(7).windowInView();
    }
    
    @FXML
    private void handleFeatsAction(ActionEvent event) {
        windows.get(8).windowInView();
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
        windows = new ArrayList<>();
        windows.add(new CharacterFluffController(this, "characterFluff.fxml"));//0
        windows.add(new CombatStatsController(this, "combatStats.fxml"));//1
        windows.add(new InventoryController(this, "inventory.fxml"));//2
        windows.add(new SkillsController(this, "skills.fxml"));//3
        windows.add(new SpellsController(this, "spells.fxml"));//4
        windows.add(new OtherCharacterController(this, "otherCharacter.fxml"));//5
        windows.add(new CombatController(this, "combat.fxml"));//6
        windows.add(new NewCharacterController(this, "newCharacter.fxml"));//7
        windows.add(new FeatsController(this, "feats.fxml")); //8
        for (WindowController windowController : windows) {
            windowController.loadPane();
        }
    }    

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
    
}
