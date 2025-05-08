package LAB10.javafxoop;

//Name : Nur Azyuni Binti Azam Aidid
//Matric No. : 2413546
//Section : 9
//Purpose :ShowFlowPane class
//Last Update : 7/05/2025

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class ShowFlowPane extends Application {
    public void start(Stage primaryStage) {
// Create a pane and set its properties
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);
// Place nodes in the pane
        TextField matricNo = new TextField();
        matricNo.setPromptText("Matric no. here");
        pane.getChildren().addAll(new Label("Name: "), new
                TextField(), new Label("Matric no: "), matricNo, new Label("                         "));
        pane.getChildren().addAll(new Button("Register"), new Button("Cancel"));
// Create a scene and place it in the stage
        Scene scene = new Scene(pane, 550, 250);
        primaryStage.setTitle("Registration Panel");
// Set the stage title
        primaryStage.setScene(scene);
// Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    public static void main(String[] args) {
        launch(args);
    }
}
