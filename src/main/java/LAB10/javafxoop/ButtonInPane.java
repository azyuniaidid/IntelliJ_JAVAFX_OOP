package LAB10.javafxoop;

//Name : Nur Azyuni Binti Azam Aidid
//Matric No. : 2413546
//Section : 9
//Purpose :ButtonInPane class
//Last Update : 7/05/2025

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

    @Override // Override the start method in the Application class

    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene
        StackPane pane = new StackPane();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        pane.getChildren().addAll(button1, button2, button3, button4 );

        button1.setTranslateX(-110);
        button2.setTranslateX(-37);
        button3.setTranslateX(37);
        button4.setTranslateX(110);

        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("Button in a pane");
        // Set the stage title
        primaryStage.setScene(scene);
        // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }

    public static void main(String[] args) {

        launch(args);
    }
}