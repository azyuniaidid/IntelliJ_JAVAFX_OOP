package LAB10.javafxoop;

//Name : Nur Azyuni Binti Azam Aidid
//Matric No. : 2413546
//Section : 9
//Purpose :ShowText class
//Last Update : 7/05/2025

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class ShowText extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
// Create a pane to hold the texts
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        Text text1 = new Text(20, 20, "Welcome to<Your Project>");
        text1.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR, 15));
        text1.setFill(Color.DARKBLUE);
        pane.getChildren().add(text1);
        Text text2 = new Text(60, 60, "Group members");
        Text text3 = new Text(60, 70, "Name {Matric}");
        Text text4 = new Text(60, 80, "Name {Matric}");
        Text text5 = new Text(60, 90, "Name {Matric}");
                pane.getChildren().add(text2);
                pane.getChildren().add(text3);
                pane.getChildren().add(text4);
                pane.getChildren().add(text5);
// Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Welcome Page");
// Set the stage title
        primaryStage.setScene(scene);
// Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    public static void main(String[] args) {
        launch(args);
    }
}
