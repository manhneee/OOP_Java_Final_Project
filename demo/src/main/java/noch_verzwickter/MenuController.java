package noch_verzwickter;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class MenuController {
    private MusicSounds musicSounds = new MusicSounds();

    @FXML
    private void newGame() throws IOException {
        playSE(2);
        App.setRoot("game");
        App.getPrimaryStage().setTitle("Noch Verzwickter");
    }

    @FXML
    private void exitApp() throws IOException {
        playSE(2);
        Platform.exit();
    }

    public void playSE(int i) {
        musicSounds.setFile(i);
        musicSounds.play();
    }
}
