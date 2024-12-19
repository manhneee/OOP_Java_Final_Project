module noch_verzwickter {
    requires javafx.controls;
    requires javafx.fxml;

    opens noch_verzwickter to javafx.fxml;
    exports noch_verzwickter;
}
