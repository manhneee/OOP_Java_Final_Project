package noch_verzwickter;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;

public class SolutionController {
    @FXML
    private Label card1_0;
    @FXML
    private Label card1_1;
    @FXML
    private Label card1_2;
    @FXML
    private Label card1_3;
    @FXML
    private Label card1_4;
    @FXML
    private Label card1_5;
    @FXML
    private Label card1_6;
    @FXML
    private Label card1_7;
    @FXML
    private Label card1_8;

    @FXML
    private Label card2_0;
    @FXML
    private Label card2_1;
    @FXML
    private Label card2_2;
    @FXML
    private Label card2_3;
    @FXML
    private Label card2_4;
    @FXML
    private Label card2_5;
    @FXML
    private Label card2_6;
    @FXML
    private Label card2_7;
    @FXML
    private Label card2_8;

    @FXML
    private Label card3_0;
    @FXML
    private Label card3_1;
    @FXML
    private Label card3_2;
    @FXML
    private Label card3_3;
    @FXML
    private Label card3_4;
    @FXML
    private Label card3_5;
    @FXML
    private Label card3_6;
    @FXML
    private Label card3_7;
    @FXML
    private Label card3_8;

    @FXML
    private Label card4_0;
    @FXML
    private Label card4_1;
    @FXML
    private Label card4_2;
    @FXML
    private Label card4_3;
    @FXML
    private Label card4_4;
    @FXML
    private Label card4_5;
    @FXML
    private Label card4_6;
    @FXML
    private Label card4_7;
    @FXML
    private Label card4_8;

    @FXML
    private Label card5_0;
    @FXML
    private Label card5_1;
    @FXML
    private Label card5_2;
    @FXML
    private Label card5_3;
    @FXML
    private Label card5_4;
    @FXML
    private Label card5_5;
    @FXML
    private Label card5_6;
    @FXML
    private Label card5_7;
    @FXML
    private Label card5_8;

    @FXML
    private Label card6_0;
    @FXML
    private Label card6_1;
    @FXML
    private Label card6_2;
    @FXML
    private Label card6_3;
    @FXML
    private Label card6_4;
    @FXML
    private Label card6_5;
    @FXML
    private Label card6_6;
    @FXML
    private Label card6_7;
    @FXML
    private Label card6_8;

    @FXML
    private Label card7_0;
    @FXML
    private Label card7_1;
    @FXML
    private Label card7_2;
    @FXML
    private Label card7_3;
    @FXML
    private Label card7_4;
    @FXML
    private Label card7_5;
    @FXML
    private Label card7_6;
    @FXML
    private Label card7_7;
    @FXML
    private Label card7_8;

    @FXML
    private Label card8_0;
    @FXML
    private Label card8_1;
    @FXML
    private Label card8_2;
    @FXML
    private Label card8_3;
    @FXML
    private Label card8_4;
    @FXML
    private Label card8_5;
    @FXML
    private Label card8_6;
    @FXML
    private Label card8_7;
    @FXML
    private Label card8_8;

    @FXML
    private Label card9_0;
    @FXML
    private Label card9_1;
    @FXML
    private Label card9_2;
    @FXML
    private Label card9_3;
    @FXML
    private Label card9_4;
    @FXML
    private Label card9_5;
    @FXML
    private Label card9_6;
    @FXML
    private Label card9_7;
    @FXML
    private Label card9_8;

    private ArrayList<Label> labels;
    private AnimalImages animalImages;
    private Board board;

    public void setBoard(Board board) {
        this.board = board;
    }

    @FXML
    public void initialize() {
        if (board != null) {
            labels = new ArrayList<>();

            // Add all labels to the list
            labels.add(card1_0);
            labels.add(card1_1);
            labels.add(card1_2);
            labels.add(card1_3);
            labels.add(card1_4);
            labels.add(card1_5);
            labels.add(card1_6);
            labels.add(card1_7);
            labels.add(card1_8);
            labels.add(card2_0);
            labels.add(card2_1);
            labels.add(card2_2);
            labels.add(card2_3);
            labels.add(card2_4);
            labels.add(card2_5);
            labels.add(card2_6);
            labels.add(card2_7);
            labels.add(card2_8);
            labels.add(card3_0);
            labels.add(card3_1);
            labels.add(card3_2);
            labels.add(card3_3);
            labels.add(card3_4);
            labels.add(card3_5);
            labels.add(card3_6);
            labels.add(card3_7);
            labels.add(card3_8);
            labels.add(card4_0);
            labels.add(card4_1);
            labels.add(card4_2);
            labels.add(card4_3);
            labels.add(card4_4);
            labels.add(card4_5);
            labels.add(card4_6);
            labels.add(card4_7);
            labels.add(card4_8);
            labels.add(card5_0);
            labels.add(card5_1);
            labels.add(card5_2);
            labels.add(card5_3);
            labels.add(card5_4);
            labels.add(card5_5);
            labels.add(card5_6);
            labels.add(card5_7);
            labels.add(card5_8);
            labels.add(card6_0);
            labels.add(card6_1);
            labels.add(card6_2);
            labels.add(card6_3);
            labels.add(card6_4);
            labels.add(card6_5);
            labels.add(card6_6);
            labels.add(card6_7);
            labels.add(card6_8);
            labels.add(card7_0);
            labels.add(card7_1);
            labels.add(card7_2);
            labels.add(card7_3);
            labels.add(card7_4);
            labels.add(card7_5);
            labels.add(card7_6);
            labels.add(card7_7);
            labels.add(card7_8);
            labels.add(card8_0);
            labels.add(card8_1);
            labels.add(card8_2);
            labels.add(card8_3);
            labels.add(card8_4);
            labels.add(card8_5);
            labels.add(card8_6);
            labels.add(card8_7);
            labels.add(card8_8);
            labels.add(card9_0);
            labels.add(card9_1);
            labels.add(card9_2);
            labels.add(card9_3);
            labels.add(card9_4);
            labels.add(card9_5);
            labels.add(card9_6);
            labels.add(card9_7);
            labels.add(card9_8);

            animalImages = new AnimalImages();
            display(animalImages, board.getSolution());
        }
    }

    private Image rotateImage(Image inputImage, double angle, boolean clockwise) {
        // Calculate the actual rotation angle in degrees
        double rotationAngle = clockwise ? angle : -angle;

        // Original image dimensions
        double width = inputImage.getWidth();
        double height = inputImage.getHeight();

        // Calculate the dimensions of the rotated image's bounding box
        double radians = Math.toRadians(rotationAngle);
        double sin = Math.abs(Math.sin(radians));
        double cos = Math.abs(Math.cos(radians));
        double newWidth = width * cos + height * sin;
        double newHeight = width * sin + height * cos;

        // Create a canvas large enough to hold the rotated image
        Canvas canvas = new Canvas(newWidth, newHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Translate the canvas to the center of the new bounding box
        gc.translate(newWidth / 2, newHeight / 2);

        // Rotate around the center
        gc.rotate(rotationAngle);

        // Draw the original image at the center
        gc.translate(-width / 2, -height / 2);
        gc.drawImage(inputImage, 0, 0);

        // Capture the result as a WritableImage
        WritableImage rotatedImage = new WritableImage((int) newWidth, (int) newHeight);
        canvas.snapshot(null, rotatedImage);

        return rotatedImage;
    }

    private Image imageAdjustment(Image img, int keyImage, int labelCount) {
        if (labelCount == 0) {
            return rotateImage(img, 90, (keyImage > 0));
        } else if (labelCount == 1 && keyImage > 0) {
            return rotateImage(img, 180, true);
        } else if (labelCount == 2) {
            return rotateImage(img, 90, (keyImage < 0));
        } else if (labelCount == 3 && keyImage < 0) {
            return rotateImage(img, 180, false);
        } else {
            return img;
        }
    }

    public void setImageToLabel(@SuppressWarnings("exports") Label label, String imagePath, int keyImage,
            int labelCount) {
        // Load the image
        URL resourceURL = getClass().getResource(imagePath);
        if (resourceURL == null) {
            throw new IllegalArgumentException("Resource not found: " + imagePath);
        }
        Image img = imageAdjustment(new Image(resourceURL.toExternalForm()), keyImage, labelCount);
        // Create new ImageView
        ImageView imgView = new ImageView(img);

        label.setGraphic(imgView);
    }

    public void display(AnimalImages animalImages, ArrayList<ArrayList<Integer>> elementArray) {
        /*
         * The new grid will be
         * 0 1(image) 2
         * 7(image) 8 3(image)
         * 6 5(image) 4
         */
        // Get the image map from the AnimalImages instance
        HashMap<Integer, String> imageMap = animalImages.getImageMap();

        // Iterate through the flattened elements and set images to labels
        int labelCount = 0;
        int trackingCard = 1;
        for (int i = 0; i < labels.size(); i++) {
            // Stop if trackingCard exceeds the number of groups in elementArray
            if (trackingCard > elementArray.size())
                break;

            if (trackingCard % 2 == 1 && i % 2 == 1) {
                int key = elementArray.get((trackingCard - 1)).get(labelCount);
                Label label = labels.get(i);
                if (imageMap.containsKey(key)) {
                    // Get image from the map
                    String imagePath = imageMap.get(key);
                    setImageToLabel(label, imagePath, key, labelCount); // Set the image to the label
                } else {
                    label.setGraphic(null); // Clear the label graphic if key not found
                }
                labelCount++;
                if (labelCount == 4) {
                    labelCount = 0;
                    trackingCard++;
                    i++;
                }

            } else if (trackingCard % 2 == 0) {
                if (i % 2 == 0) {
                    int key = elementArray.get((trackingCard - 1)).get(labelCount);
                    Label label = labels.get(i);
                    if (imageMap.containsKey(key)) {
                        // Get image from the map
                        String imagePath = imageMap.get(key);
                        setImageToLabel(label, imagePath, key, labelCount); // Set the image to the label
                    } else {
                        label.setGraphic(null); // Clear the label graphic if key not found
                    }
                    labelCount++;
                    if (labelCount == 4) {
                        labelCount = 0;
                        trackingCard++;
                        i++;
                    }
                }
            }
        }
    }
}
