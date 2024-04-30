package com.example.addressbook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {

    @FXML
    private void navigateToRegistrationPage(ActionEvent event) {
        try {
            // Load the FXML file for the registration page
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/addressbook/registration-view.fxml"));
            Scene registrationScene = new Scene(fxmlLoader.load());

            // Get the stage from the event source
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(registrationScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
}
