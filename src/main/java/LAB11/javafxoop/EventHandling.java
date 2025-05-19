package LAB11.javafxoop;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


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
        grid.add(featureOptions, 0, 12, 12, 6);

        Label date = new Label("Date option:");
        grid.add(date, 0, 18);
        DatePicker datePick = new DatePicker();
        VBox dateBox = new VBox(datePick);
        grid.add(dateBox, 0, 19);

        Slider slider = new Slider(0, 100, 50);
        grid.add(slider, 0, 20);
        Label volume = new Label();
        grid.add(volume, 0, 21);

        Button valueButton = new Button("Check values");
        VBox button = new VBox(valueButton);
        grid.add(button, 0, 22);

        TextArea textArea = new TextArea();
        VBox text = new VBox(textArea);
        grid.add(text, 0, 23);

        Button exitButton = new Button("Exit");
        VBox button2 = new VBox(exitButton);
        grid.add(button2, 0, 24);

        exitButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

               stage.close();
            }
        });

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> obs, Number oldVal, Number newVal) {
                volume.setText("Volume: " + newVal.intValue());
            }
        });

        valueButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String name = userTextField.getText();

                String selection = "Not selected";
                if(choice1.isSelected()){
                    selection = "Choice-1";
                }else if(choice2.isSelected()){
                    selection = "Choice-2";
                }

                boolean option1 = optionA.isSelected();
                boolean option2 = optionB.isSelected();

                String feature = options.getValue();

                String item = features.getSelectionModel().getSelectedItem();

                String date;
                if(datePick.getValue() != null){
                    date = datePick.getValue().toString();
                }else {
                    date = "Not selected";
                }

                String msg = "Hi, " + name + "!\n" +
                        "Choice : " + selection + "\n" +
                        "Selection1 : " + option1 + "\n" +
                        "Selection2 : " + option2 + "\n" +
                        "Feature : " + feature + "\n" +
                        "Item :" + item + "\n" +
                        "Date : " + date;

                textArea.setText(msg);
            }
        });

        Scene scene = new Scene(grid, 700, 600);
        stage.setScene(scene);
        stage.show();
    }
}
