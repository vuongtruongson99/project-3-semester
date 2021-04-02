package rtu.mirea.project.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import rtu.mirea.project.Database.DatabaseHandler;
import rtu.mirea.project.model.User;

import java.io.IOException;

public class SignupController {
    @FXML
    private TextField signupLastName;

    @FXML
    private TextField signupFirstName;

    @FXML
    private TextField signupUsername;

    @FXML
    private CheckBox signupCheckBoxMale;

    @FXML
    private CheckBox signupCheckBoxFemale;

    @FXML
    private TextField signupLocation;

    @FXML
    private TextField signupPassword;

    @FXML
    private Button signupButton;

    @FXML
    private Hyperlink signupLogin;

    @FXML
    void initialize() {
        signupLogin.setOnAction(event -> {
            signupLogin.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../login.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        signupButton.setOnAction(event -> {
            createUser();
        });
    }

    private void createUser() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        String name = signupFirstName.getText();
        String lastName = signupLastName.getText();
        String userName = signupUsername.getText();
        String password = signupPassword.getText();
        String location = signupLocation.getText();

        String gender = "";
        if (signupCheckBoxFemale.isSelected()) {
            gender = "Female";
        } else {
            gender = "Male";
        }

        User user = new User(name, lastName, userName, password, location, gender);

        databaseHandler.signupUser(user);
    }
}
