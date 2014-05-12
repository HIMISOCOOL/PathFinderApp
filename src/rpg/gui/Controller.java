package rpg.gui;

import JefXif.WindowController;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class Controller extends JefXif.Controller{
    
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        super.setWindows(new ArrayList<WindowController>());
        //getWindows().add(new WindowController(this, "characterFluff.fxml"));//0
        for (JefXif.WindowController windowController : getWindows()) {
            windowController.loadPane();
        }
    }    
}
