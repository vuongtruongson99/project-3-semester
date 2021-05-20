package rtu.mirea.project;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
        String fxmlPath = "ToDoGUI.fxml";
        URL location = getClass().getResource(fxmlPath);
        FXMLLoader loader = new FXMLLoader(location);
        Scene scene = new Scene(loader.load());

        primaryStage.setTitle("To-Do List Application");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("file:H:\\Ki 2 nam 2\\Final\\src\\main\\resources\\rtu\\mirea\\project\\assets\\icon.jpg"));
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
