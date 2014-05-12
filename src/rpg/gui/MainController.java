package rpg.gui;

import JefXif.WindowController;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import pathfinder.gui.*;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class MainController extends JefXif.MainController{
    
    @FXML
    private void handleMenuAction(ActionEvent event) {
        //toggles the menu being open or closed
    }
    @FXML
    private void handleCharacterAction(ActionEvent event) {
        getWindows().get(0).windowInView();
    }
    @FXML
    private void handleCombatStatsAction(ActionEvent event) {
        getWindows().get(1).windowInView();
    }
    @FXML
    private void handleInventoryAction(ActionEvent event) {
        getWindows().get(2).windowInView();
    }
    @FXML
    private void handleSkillsAction(ActionEvent event) {
        getWindows().get(3).windowInView();
    }
    @FXML
    private void handleSpellsAction(ActionEvent event) {
        getWindows().get(4).windowInView();
    }
    @FXML
    private void handleOtherCharacterAction(ActionEvent event) {
        getWindows().get(5).windowInView();
    }
    
    @FXML
    private void handleCombatAction(ActionEvent event) {
        getWindows().get(6).windowInView();
    }
    
    @FXML
    private void handleNewCharacterAction(ActionEvent event) {
        getWindows().get(7).windowInView();
    }
    
    @FXML
    private void handleFeatsAction(ActionEvent event) {
        getWindows().get(8).windowInView();
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        super.setWindows(new ArrayList<WindowController>());
        getWindows().add(new CharacterFluffController(this, "characterFluff.fxml"));//0
        getWindows().add(new CombatStatsController(this, "combatStats.fxml"));//1
        getWindows().add(new InventoryController(this, "inventory.fxml"));//2
        getWindows().add(new SkillsController(this, "skills.fxml"));//3
        getWindows().add(new SpellsController(this, "spells.fxml"));//4
        getWindows().add(new OtherCharacterController(this, "otherCharacter.fxml"));//5
        getWindows().add(new CombatController(this, "combat.fxml"));//6
        getWindows().add(new NewCharacterController(this, "newCharacter.fxml"));//7
        getWindows().add(new FeatsController(this, "feats.fxml")); //8
        for (JefXif.WindowController windowController : getWindows()) {
            windowController.loadPane();
        }
    }    
}
