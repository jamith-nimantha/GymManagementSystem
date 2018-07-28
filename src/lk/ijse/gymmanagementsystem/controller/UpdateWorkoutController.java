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

/**
 * FXML Controller class
 *
 * @author jamith
 */
public class UpdateWorkoutController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private JFXButton updateBtn;

    @FXML
    private JFXButton clearBtn;

    @FXML
    private JFXButton removeBtn;

    @FXML
    private JFXButton cacelBtn;

    @FXML
    void cacelBtnOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirm Close");
        alert.setContentText("Are you want to Close?");
        Optional<ButtonType> showAndWait = alert.showAndWait();
        if(showAndWait.get()==ButtonType.OK){
            Stage stage  = (Stage) cacelBtn.getScene().getWindow();
            stage.close();
        }else{}
    }

    @FXML
    void clearBtnOnAction(ActionEvent event) {

    }

    @FXML
    void removeBtnOnAction(ActionEvent event) {

    }

    @FXML
    void updateBtnOnAction(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
