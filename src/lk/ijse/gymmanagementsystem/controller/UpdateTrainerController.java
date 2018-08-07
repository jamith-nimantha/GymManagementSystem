/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import lk.ijse.gymmanagementsystem.common.Alerts;

/**
 * FXML Controller class
 *
 * @author jamith
 */
public class UpdateTrainerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private JFXButton saveBtn;

    @FXML
    private JFXButton clearBtn;

    @FXML
    private JFXButton removeBtn;

    @FXML
    private JFXButton cancelBtn;

    @FXML
    void cancelBtnOnAction(ActionEvent event) {
        Alerts.confirmClose(cancelBtn);
    }

    @FXML
    void clearOnAction(ActionEvent event) {

    }

    @FXML
    void removeBtnOnAction(ActionEvent event) {

    }

    @FXML
    void saveOnAction(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
