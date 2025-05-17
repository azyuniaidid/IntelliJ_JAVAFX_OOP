module com.example.javafxoop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.javafxoop to javafx.fxml;
    exports com.example.javafxoop;

    opens LAB10.javafxoop to javafx.fxml;
    exports LAB10.javafxoop;

    opens ASYNCTASK12MAY.javafxoop to javafx.fxml;
    exports ASYNCTASK12MAY.javafxoop;

    opens LAB11.javafxoop to javafx.fxml;
    exports LAB11.javafxoop;
}
