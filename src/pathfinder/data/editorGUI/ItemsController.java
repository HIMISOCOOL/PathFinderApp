package pathfinder.data.editorGUI;

import JefXif.Controller;
import JefXif.WindowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Node;

/**
 *
 * @author Matthew
 */
public class ItemsController extends WindowController{

    public ItemsController(Controller mainController, String FXML) {
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
