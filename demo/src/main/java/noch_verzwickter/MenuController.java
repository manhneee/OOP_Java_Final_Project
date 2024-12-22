package noch_verzwickter;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class MenuController {
    @FXML
    private void newGame() throws IOException {
        App.setRoot("game");
        App.getPrimaryStage().setTitle("Noch Verzwickter");
    }

    @FXML
    private void exitApp() throws IOException {
        Platform.exit();
    }
}
