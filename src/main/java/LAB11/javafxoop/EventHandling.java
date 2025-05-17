package LAB11.javafxoop;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EventHandling extends Application{

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        stage.setTitle("JavaFX GUI Components");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label name = new Label("Enter your name: ");
        grid.add(name, 0, 2);
        TextField userTextField = new TextField();
        grid.add(userTextField, 0, 3);

        Label radioButton = new Label("Radio button option:");
        grid.add(radioButton, 0, 4);
        RadioButton choice1 = new RadioButton("Choice-1");
        RadioButton choice2 = new RadioButton("Choice-2");
        VBox choices = new VBox(10);
        choices.getChildren().addAll(choice1, choice2);
        grid.add(choices, 0, 5);

        Label checkBox = new Label("Checkbox option(May choose more than 1)");
        grid.add(checkBox, 0, 6);
        CheckBox optionA = new CheckBox("Option-A");
        CheckBox optionB = new CheckBox("Option-B");
        VBox optionsCheck = new VBox(10);
        optionsCheck.getChildren().addAll(optionA, optionB);
        grid.add(optionsCheck, 0, 7);

        Label comboBox = new Label("Combo box option:");
        grid.add(comboBox, 0, 9);
        ComboBox<String> options = new ComboBox<>();
        options.getItems().addAll("Option-1", "Option-2", "Option-3");
        VBox optionsCombo = new VBox(options);
        grid.add(optionsCombo, 0, 10);

        Label listOption = new Label("List option:");
        grid.add(listOption, 0, 11);
        ListView<String> features = new ListView<>();
        features.getItems().addAll("Feature-1", "Feature-2", "Feature-3");
        VBox featureOptions = new VBox(features);
        grid.add(featureOptions, 0, 12, 15, 8);

        Label date = new Label("Date option:");
        grid.add(date, 0, 21);
        DatePicker datePick = new DatePicker();
        VBox dateBox = new VBox(datePick);
        grid.add(dateBox, 0, 22);

        Slider slider = new Slider(0, 100, 50);
        grid.add(slider, 0, 23);
        Label volume = new Label("Volume:");
        grid.add(volume, 0, 24);

        Button valueButton = new Button("Check values");
        VBox button = new VBox(valueButton);
        grid.add(button, 0, 25);

        TextArea textArea = new TextArea("Item");
        VBox text = new VBox(textArea);
        grid.add(text, 0, 26, 15, 5);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 27);


        Scene scene = new Scene(grid, 700, 600);
        stage.setScene(scene);
        stage.show();
    }



}
