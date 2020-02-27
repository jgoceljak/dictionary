package sample;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button add;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Dictionary");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets (10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Search
        Label name

        window.show();
    }
}
