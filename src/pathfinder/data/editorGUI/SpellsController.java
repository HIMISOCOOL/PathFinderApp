/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pathfinder.data.editorGUI;

import JefXif.Controller;
import JefXif.WindowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Matthew
 */
public class SpellsController extends WindowController{
    
    @FXML
    AnchorPane spellDetails;
    @FXML
    ListView SpellList;

    public SpellsController(Controller mainController, String FXML) {
        super(mainController, FXML);
    }

    @Override
    public void windowInView() {
        mainController.swapWindow((Node)getPane().getChildren().get(0));
        this.initialize(null, null);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resources) {
        ObservableList<String> items = FXCollections.observableArrayList("TestItem1","TestItem2","TestItem3");
        SpellList.setItems(items);
        
        SpellList.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> ov, 
                    String old_val, String new_val) {
                        
                }
            });
    } 
}
