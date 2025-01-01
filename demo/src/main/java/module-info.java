module noch_verzwickter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;

    opens noch_verzwickter to javafx.fxml;

    exports noch_verzwickter;
}
