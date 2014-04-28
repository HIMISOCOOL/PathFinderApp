package pathfinder.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import rpg.gui.WindowController;
import javafx.scene.Node;
import rpg.gui.MainController;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class OtherCharacterController extends WindowController {

    @FXML
    private void handleNewCharacterAction(ActionEvent event) {
        this.mainController.windows.get(7).windowInView();
    }
    
    public OtherCharacterController(MainController mainController, String FXML) {
        super(mainController, FXML);
    }

    @Override
    public void windowInView() {
        mainController.swapWindow((Node)getPane());
    }    
}
