package rtu.mirea.project;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * Starts the ToDo List Application
 */

public class Todo extends Application {
    /**
     * Starts the JavaFX Application
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 500, 600));
        primaryStage.show();
    }

    /**
     * Entry Point of the Application
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
