package pathfinder.gui;

import JefXif.WindowController;
import javafx.scene.Node;
import rpg.gui.MainController;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class CombatController extends WindowController {

    public CombatController(MainController mainController, String FXML) {
        super(mainController, FXML);
    }

    @Override
    public void windowInView() {
        mainController.swapWindow((Node)getPane());
    }    
}
