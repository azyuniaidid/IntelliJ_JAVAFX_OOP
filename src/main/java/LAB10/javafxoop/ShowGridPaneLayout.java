package LAB10.javafxoop;

//Name : Nur Azyuni Binti Azam Aidid
//Matric No. : 2413546
//Section : 9
//Purpose :ShowGridPane class
//Last Update : 7/05/2025

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Node;
public class ShowGridPaneLayout extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
//Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
// Place nodes in the pane
        pane.add(new Label("Name:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("Matric No:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        Button btAdd1 = new Button("Register");
        pane.add(btAdd1, 1, 3);
        GridPane.setHalignment(btAdd1, HPos.LEFT);
        Button btAdd2 = new Button("Cancel");
        pane.add(btAdd2, 1, 3);
        GridPane.setHalignment(btAdd2, HPos.RIGHT);
// Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Registration Panel");
// Set the stage title
        primaryStage.setScene(scene);
// Place the scene in the stage
        primaryStage.show();
// Display the stage
    }
    public static void main(String[] args) {
        launch(args);
    }
}
