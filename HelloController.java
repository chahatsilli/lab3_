package com.example.hrmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {


    public Label username;

    @FXML
    protected void login() {

        try {
            Parent secondScene = FXMLLoader.load(getClass().getResource("dash-view.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("dash-view");
            secondStage.setScene(new Scene(secondScene));
            Stage firstSceneStage = (Stage) username.getScene().getWindow();

            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void exitclick(ActionEvent actionEvent) {
    }

    public void adminclick(ActionEvent actionEvent) {
    }

    public void employeeclick(ActionEvent actionEvent) {
    }

    public void logoutclick(ActionEvent actionEvent) {
    }
}
