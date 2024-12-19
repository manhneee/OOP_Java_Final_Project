package noch_verzwickter;

import java.io.IOException;

import javafx.fxml.FXML;

public class GameController {
    @FXML
    private void goBack() throws IOException {
        App.setRoot("menu");
    }
}
