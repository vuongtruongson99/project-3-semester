package rtu.mirea.project.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import rtu.mirea.project.database.DatabaseHandler;
import rtu.mirea.project.animations.Shaker;
import rtu.mirea.project.model.User;

import javax.xml.crypto.Data;
import javax.xml.transform.Result;


public class LoginController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginUsername;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Button loginButton;

    @FXML
    private Hyperlink loginForgotPwd;

    @FXML
    private Hyperlink loginSignup;

    private DatabaseHandler databaseHandler;
    @FXML
    void initialize() {
        databaseHandler = new DatabaseHandler();

        loginButton.setOnAction(event -> {
            String loginText = loginUsername.getText().trim();
            String loginPwd = loginPassword.getText().trim();

            User user = new User();
            user.setUserName(loginText);
            user.setPassword(loginPwd);

            ResultSet userRow = databaseHandler.getUser(user);

            int counter = 0;

            try {
                while (userRow.next()) {
                    counter++;
                    String name = userRow.getString("firstname");
                    System.out.println("Welcome! " + name);
                }

                if (counter == 1) {
                    showAddItemScreen();
                } else {
                    Shaker userNameShaker = new Shaker(loginUsername);
                    Shaker passwordShaker = new Shaker(loginPassword);
                    userNameShaker.shake();
                    passwordShaker.shake();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        });

        loginSignup.setOnAction(event -> {
            loginSignup.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            URL location = LoginController.class.getProtectionDomain().getCodeSource().getLocation();
            System.out.println(location.getFile());
            loader.setLocation(getClass().getResource("../signup.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Todo List");
            stage.showAndWait();
        });
    }

    private void showAddItemScreen() {
        loginButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("../ToDoGUI.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Todo List");
        stage.getIcons().add(new Image("file:H:\\Ki 2 nam 2\\Final\\src\\main\\resources\\rtu\\mirea\\project\\assets\\icon.jpg"));
        stage.showAndWait();
    }

}
