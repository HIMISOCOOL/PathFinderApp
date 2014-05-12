package pathfinder.gui;

import JefXif.WindowController;
import javafx.scene.Node;
import rpg.gui.MainController;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class CharacterFluffController extends WindowController {

    public CharacterFluffController(MainController mainController, String FXML) {
        super(mainController, FXML);
    }

    @Override
    public void windowInView() {
        mainController.swapWindow((Node)getPane());
    }    
}
