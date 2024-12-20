package noch_verzwickter;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

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

    private ArrayList<Label> labels;
    private AnimalImages animalImages;
    private Board board;

    @FXML
    public void initialize() {
        labels = new ArrayList<>();

        // Add all labels to the list
        labels.add(card1t);
        labels.add(card1r);
        labels.add(card1b);
        labels.add(card1l);
        labels.add(card2t);
        labels.add(card2r);
        labels.add(card2b);
        labels.add(card2l);
        labels.add(card3t);
        labels.add(card3r);
        labels.add(card3b);
        labels.add(card3l);
        labels.add(card4t);
        labels.add(card4r);
        labels.add(card4b);
        labels.add(card4l);
        labels.add(card5t);
        labels.add(card5r);
        labels.add(card5b);
        labels.add(card5l);
        labels.add(card6t);
        labels.add(card6r);
        labels.add(card6b);
        labels.add(card6l);
        labels.add(card7t);
        labels.add(card7r);
        labels.add(card7b);
        labels.add(card7l);
        labels.add(card8t);
        labels.add(card8r);
        labels.add(card8b);
        labels.add(card8l);
        labels.add(card9t);
        labels.add(card9r);
        labels.add(card9b);
        labels.add(card9l);

        animalImages = new AnimalImages();
        board = new Board();
        display(animalImages, board.getElementArray());
    }

    public void setImageToLabel(@SuppressWarnings("exports") Label label, String imagePath) {
        // Load the image
        URL resourceURL = getClass().getResource(imagePath);
        if (resourceURL == null) {
            throw new IllegalArgumentException("Resource not found: " + imagePath);
        }

        Image img = new Image(resourceURL.toExternalForm());

        // Create new ImageView
        ImageView imgView = new ImageView(img);

        label.setGraphic(imgView);
    }

    public void display(AnimalImages animalImages, ArrayList<ArrayList<Integer>> elementArray) {
        // Get the image map from the AnimalImages instance
        HashMap<Integer, String> imageMap = animalImages.getImageMap();

        // Flatten the 2D elementArray into a single list
        ArrayList<Integer> flattenedElements = new ArrayList<>();
        for (ArrayList<Integer> row : elementArray) {
            flattenedElements.addAll(row);
        }

        // Ensure the flattened array matches the number of labels
        if (flattenedElements.size() > labels.size()) {
            throw new IllegalArgumentException("More elements in elementArray than available labels.");
        }

        // Iterate through the flattened elements and set images to labels
        for (int i = 0; i < flattenedElements.size(); i++) {
            int key = flattenedElements.get(i);
            Label label = labels.get(i); // Get the corresponding label

            if (imageMap.containsKey(key)) {
                // Get image from the map
                String imagePath = imageMap.get(key);
                setImageToLabel(label, imagePath); // Set the image to the label
            } else {
                label.setGraphic(null); // Clear the label graphic if key not found
            }
        }
    }

    @FXML
    private void goBack() throws IOException {
        App.setRoot("menu");
    }

    @FXML
    private void showSolution() throws IOException {
        display(animalImages, board.getSolution());
    }
}