package pathfinder.gui;

import JefXif.WindowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Node;
import rpg.gui.MainController;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class NewCharacterController extends WindowController {

    public NewCharacterController(MainController mainController, String FXML) {
        super(mainController, FXML);
    }

    @Override
    public void windowInView() {
        mainController.swapWindow((Node)getPane());
    }    

    @Override
    public void initialize(URL url, ResourceBundle resources) {
        
    }
}
