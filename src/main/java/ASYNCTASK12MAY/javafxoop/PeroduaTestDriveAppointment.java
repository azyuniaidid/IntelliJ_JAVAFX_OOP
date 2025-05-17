package ASYNCTASK12MAY.javafxoop;

//Name : Nur Azyuni Binti Azam Aidid
//Matric No. : 2413546
//Section : 9
//Purpose :Perodua Test-Drive Appointment App
//Last Update : 12/05/2025

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import java.time.LocalDate;
import javafx.scene.layout.*;

public class PeroduaTestDriveAppointment extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("WELCOME TO PERODUA TEST-DRIVE APPOINTMENT SYSTEM");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Load an image (from URL or local resource)
        Image image = new Image("https://www.carlogos.org/logo/Perodua-logo-2008-640x434.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setPreserveRatio(true);
        GridPane.setColumnSpan(imageView, 2);
        GridPane.setHalignment(imageView, javafx.geometry.HPos.CENTER);
        grid.add(imageView, 0, 0, 2, 1);

        Text scenetitle = new Text("PERODUA TEST-DRIVE APPOINTMENT APP");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        grid.add(scenetitle, 0, 1, 2, 1);

        Label userName = new Label("Name: ");
        grid.add(userName, 0, 2);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 2);

        Label contact = new Label("Contact no.:");
        grid.add(contact, 0, 3);
        TextField contactBox = new TextField();
        grid.add(contactBox, 1, 3);

        Label email = new Label("Email:");
        grid.add(email, 0, 4);
        TextField emailBox = new TextField();
        grid.add(emailBox, 1, 4);

        Label date = new Label("Select a date:");
        GridPane.setColumnSpan(date, 2);
        GridPane.setHalignment(date, javafx.geometry.HPos.CENTER);
        grid.add(date, 0, 6);

        DatePicker datePick = new DatePicker();
        HBox dateBox = new HBox(datePick);
        dateBox.setAlignment(Pos.CENTER);
        grid.add(dateBox, 0, 7, 2, 1);

        Label carModel = new Label("Select Car Model:");
        GridPane.setColumnSpan(carModel, 2);
        GridPane.setHalignment(carModel, javafx.geometry.HPos.CENTER);
        grid.add(carModel, 0, 8);

        ComboBox<String> carModels = new ComboBox<>();
        carModels.getItems().addAll("Myvi", "Axia", "Alza", "Bezza");
        HBox carModelBox = new HBox(carModels);
        carModelBox.setAlignment(Pos.CENTER);
        grid.add(carModelBox, 0, 9, 2, 1);

        Label sessions = new Label("Preferred Session:");
        GridPane.setColumnSpan(sessions, 2);
        GridPane.setHalignment(sessions, javafx.geometry.HPos.CENTER);
        grid.add(sessions, 0, 10);

        ToggleGroup sessionChoices = new ToggleGroup();
        RadioButton session1 = new RadioButton("Session-1 : 10-11 AM");
        RadioButton session2 = new RadioButton("Session-2 : 12-1 PM");
        RadioButton session3 = new RadioButton("Session-3 : 2-3 PM");

        session1.setToggleGroup(sessionChoices);
        session2.setToggleGroup(sessionChoices);
        session3.setToggleGroup(sessionChoices);

        VBox sessionBox = new VBox(10);
        sessionBox.setAlignment(Pos.CENTER);
        sessionBox.getChildren().addAll(session1, session2, session3);
        grid.add(sessionBox, 0, 11, 2, 1);

        Button btn1 = new Button("Submit");
        Button btn2 = new Button("Cancel");
        HBox hbBtn2 = new HBox(20);
        hbBtn2.setAlignment(Pos.CENTER);
        hbBtn2.getChildren().addAll(btn1, btn2);
        grid.add(hbBtn2, 0, 12, 2, 1);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 13);

        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Submit button is pressed");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                actiontarget.setFill(Color.FIREBRICK);
                userTextField.setText("");
                contactBox.setText("");
                emailBox.setText(" ");
                datePick.setValue(null);
                carModels.setValue(null);
                sessionChoices.selectToggle(null);
                actiontarget.setText("Cancel button is pressed");
            }
        });
        Scene scene = new Scene(grid, 700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
