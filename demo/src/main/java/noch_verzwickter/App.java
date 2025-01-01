package noch_verzwickter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

public class App extends Application {

    private static Scene scene;
    private static Stage primaryStage;
    private MusicSounds musicSounds = new MusicSounds();
    private int currentTrackIndex = 0; // Keep track of the current playing track

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        scene = new Scene(loadFXML("menu"));
        primaryStage = stage;
        stage.setScene(scene);
        stage.show();

        // Adjusts the position of the window
        javafx.geometry.Rectangle2D screenBounds = javafx.stage.Screen.getPrimary().getVisualBounds();
        stage.setX((screenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((screenBounds.getHeight() - stage.getHeight()) / 10);

        playMusic();
    }

    public void playMusic() {
        playCurrentTrack();

        musicSounds.addLineListener(new LineListener() {

            @Override
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    // Switch to the next track
                    currentTrackIndex = (currentTrackIndex + 1) % 2; // Toggle between 0 and 1
                    playCurrentTrack();
                }
                throw new UnsupportedOperationException("Unimplemented method 'update'");
            }
        });
    }

    private void playCurrentTrack() {
        musicSounds.setFile(currentTrackIndex);
        musicSounds.play();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        // Adjusts the stage size to fit the new scene
        Stage stage = (Stage) scene.getWindow();
        if (stage != null) {
            stage.sizeToScene();
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    @SuppressWarnings("exports")
    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}