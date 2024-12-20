package noch_verzwickter;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameController {
    @FXML
    private Label card1t;
    @FXML
    private Label card1r;
    @FXML
    private Label card1b;
    @FXML
    private Label card1l;

    @FXML
    private Label card2t;
    @FXML
    private Label card2r;
    @FXML
    private Label card2b;
    @FXML
    private Label card2l;

    @FXML
    private Label card3t;
    @FXML
    private Label card3r;
    @FXML
    private Label card3b;
    @FXML
    private Label card3l;

    @FXML
    private Label card4t;
    @FXML
    private Label card4r;
    @FXML
    private Label card4b;
    @FXML
    private Label card4l;

    @FXML
    private Label card5t;
    @FXML
    private Label card5r;
    @FXML
    private Label card5b;
    @FXML
    private Label card5l;

    @FXML
    private Label card6t;
    @FXML
    private Label card6r;
    @FXML
    private Label card6b;
    @FXML
    private Label card6l;

    @FXML
    private Label card7t;
    @FXML
    private Label card7r;
    @FXML
    private Label card7b;
    @FXML
    private Label card7l;

    @FXML
    private Label card8t;
    @FXML
    private Label card8r;
    @FXML
    private Label card8b;
    @FXML
    private Label card8l;

    @FXML
    private Label card9t;
    @FXML
    private Label card9r;
    @FXML
    private Label card9b;
    @FXML
    private Label card9l;

    public void setImageToLabel(@SuppressWarnings("exports") Label label, String imagePath) {
        // Load the image
        Image img = new Image(imagePath);

        // Create new ImageView
        ImageView imgView = new ImageView(img);

        label.setGraphic(imgView);
    }

    @FXML
    private void goBack() throws IOException {
        App.setRoot("menu");
    }
}
