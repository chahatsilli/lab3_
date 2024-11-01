package com.example.hrmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class dashcontroller {

    public Label password;

    public void adminclick(ActionEvent actionEvent) {
        try {
            Parent secondScene = FXMLLoader.load(getClass().getResource("admin-view.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("login");
            secondStage.setScene(new Scene(secondScene));
            Stage firstSceneStage = (Stage)password.getScene().getWindow();

            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitclick(ActionEvent actionEvent) {
    }

    public void employeeclick(ActionEvent actionEvent) {
    }

    public void logoutclick(ActionEvent actionEvent) {
    }
}