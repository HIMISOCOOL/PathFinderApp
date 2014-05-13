package rpg.gui;

import JefXif.WindowController;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pathfinder.data.editorGUI.*;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class Controller extends JefXif.Controller{
    
    @FXML
    private void handleSkillsAction(ActionEvent event) {
        getWindows().get(4).windowInView();
    }
    @FXML
    private void handleSpellsAction(ActionEvent event) {
        getWindows().get(5).windowInView();
    }
    @FXML
    private void handleItemsAction(ActionEvent event) {
        getWindows().get(2).windowInView();
    }
    @FXML
    private void handleRacesAction(ActionEvent event) {
        getWindows().get(3).windowInView();
    }
    @FXML
    private void handleClassesAction(ActionEvent event) {
        getWindows().get(0).windowInView();
    }
    @FXML
    private void handleFeatsAction(ActionEvent event) {
        getWindows().get(1).windowInView();
    }
    @FXML
    private void handleReadClasses(ActionEvent event) {
        
    }
    @FXML
    private void handleReadRaces(ActionEvent event) {
        
    }
    @FXML
    private void handleReadItems(ActionEvent event) {
        
    }
    @FXML
    private void handleReadSkills(ActionEvent event) {
        
    }
    @FXML
    private void handleReadSpells(ActionEvent event) {
        
    }
    @FXML
    private void handleReadFeats(ActionEvent event) {
        
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        super.setWindows(new ArrayList<WindowController>());
        getWindows().add(new ClassesController(this, "classes.fxml"));//0
        getWindows().add(new FeatsController(this, "feats.fxml"));//1
        getWindows().add(new ItemsController(this, "items.fxml"));//2
        getWindows().add(new RacesController(this, "races.fxml"));//3
        getWindows().add(new SkillsController(this, "skills.fxml"));//4
        getWindows().add(new SpellsController(this, "spells.fxml"));//5
        for (JefXif.WindowController windowController : getWindows()) {
            windowController.loadPane();
        }
    }    
}
