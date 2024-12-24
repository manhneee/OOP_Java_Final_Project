package noch_verzwickter;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.animation.Interpolator;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class GameController {
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

    private double originalCardPaneX;
    private double originalCardPaneY;
    private Label dragSourceLabel;
    private ArrayList<Label> labels;
    private AnimalImages animalImages;
    private Board board;

    @FXML
    public void initialize() {
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
        board = new Board();
        display(animalImages, board.getElementArray());

        // Attach interaction handlers
        for (Label label : labels) {
            label.setOnMouseClicked(event -> handleLabelClick(label)); // Rotation
            label.setOnDragDetected(event -> handleDragDetected(label)); // Drag start
            label.setOnMouseDragReleased(event -> handleDragDropped(label)); // Drop
        }
    }

    private GridPane getGridPaneFromLabel(Label label) {
        if (label.getParent() instanceof GridPane) {
            return (GridPane) label.getParent();
        }
        return null; // Return null if the parent is not a GridPane
    }

    @FXML
    private void handleLabelClick(Label label) {
        GridPane cardPane = getGridPaneFromLabel(label);
        if (cardPane == null) {
            return;
        }
        // Card rotation animation class
        RotateTransition rotateTransition = new RotateTransition(Duration.millis(200), cardPane);
        rotateTransition.setByAngle(90);
        rotateTransition.setCycleCount(1);
        rotateTransition.setInterpolator(Interpolator.EASE_BOTH);

        rotateTransition.setOnFinished(event -> {
            int labelIndex = labels.indexOf(label); // Find the label's index
            if (labelIndex == -1) {
                return; // Ensure label exists in the list
            }

            // Determine the current section
            int section = labelIndex / 9; // Each section spans 9 labels (0-8, 9-17, etc.)
            ArrayList<Integer> card = board.getElementArray().get(section);
            board.rotateCard(card, 1, true);
            // Update only the card content, not its rotation
            cardPane.setRotate(0);
            // Update the display
            display(animalImages, board.getElementArray());
        });

        rotateTransition.play();
    }

    @FXML
    private void handleDragDetected(Label label) {
        if (label == null)
            return; // Ensure label is not null
        dragSourceLabel = label; // Track the source label

        GridPane cardPane = getGridPaneFromLabel(label);

        // Store the original position of the cardPane
        originalCardPaneX = cardPane.getLayoutX();
        originalCardPaneY = cardPane.getLayoutY();

        label.startFullDrag(); // Start the drag process

        // Start tracking the mouse for dragging
        cardPane.setOnMouseDragged(this::handleMouseDrag);
        cardPane.setOnMouseReleased(this::handleMouseRelease);
    }

    // Method to handle mouse dragging
    private void handleMouseDrag(MouseEvent event) {
        // Get the source pane (cardPane)
        GridPane cardPane = (GridPane) event.getSource();

        DraggableMaker draggableMaker = new DraggableMaker();
        draggableMaker.makeDraggable(cardPane);
    }

    // Method to handle mouse release (stop following the mouse)
    private void handleMouseRelease(MouseEvent event) {
        GridPane cardPane = (GridPane) event.getSource();

        // Stop listening for mouse drag events after release
        cardPane.setOnMouseDragged(null);
        cardPane.setOnMouseReleased(null);

        // Sets the cardPane back to where it was from, for actual swap to happen
        cardPane.setLayoutX(originalCardPaneX);
        cardPane.setLayoutY(originalCardPaneY);
    }

    @FXML
    private void handleDragDropped(Label targetLabel) {
        if (dragSourceLabel == null || targetLabel == null)
            return;

        int sourceIndex = labels.indexOf(dragSourceLabel);
        int targetIndex = labels.indexOf(targetLabel);

        if (sourceIndex == -1 || targetIndex == -1)
            return; // Ensure valid indices

        int sourceCardIndex = sourceIndex / 9; // Adjust based on group size
        int targetCardIndex = targetIndex / 9;

        // Ensure valid card indices
        if (sourceCardIndex >= board.getElementArray().size() || targetCardIndex >= board.getElementArray().size())
            return;

        // Swap the cards
        ArrayList<ArrayList<Integer>> elementArray = board.getElementArray();
        Collections.swap(elementArray, sourceCardIndex, targetCardIndex);

        // Update the display
        display(animalImages, board.getElementArray());
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

        // Set the fitWidth and fitHeight to match the label size
        imgView.setFitWidth(44);
        imgView.setFitHeight(44);

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

    @FXML
    private void goBack() throws IOException {
        App.setRoot("menu");
    }

    // Add a class-level variable for the solution stage
    private Stage solutionStage;

    @FXML
    private void showSolution() throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("solution.fxml"));
            Parent root = loader.load();

            // Open the new window
            solutionStage = new Stage();
            solutionStage.setTitle("Solution");
            solutionStage.setScene(new Scene(root));

            // Position the new window next to the game window
            Stage gameStage = (Stage) card1_0.getScene().getWindow(); // Reference primary stage
            solutionStage.setX(gameStage.getX() + gameStage.getWidth() - 15); // Position next to game window
            solutionStage.setY(gameStage.getY()); // Align vertically with the game window

            // Ensure display works with the solution root instead of game elements
            GameController solutionController = loader.getController(); // Get controller for the solution.fxml
            solutionController.display(animalImages, board.getSolution());

            for (Label label : solutionController.labels) {
                label.setOnMouseClicked(null);
                label.setOnDragDetected(null);
                label.setOnMouseDragReleased(null);
            }

            solutionStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private boolean checkingBoard(ArrayList<ArrayList<Integer>> elementArray, ArrayList<int[]> invalidConditions) {
        boolean[] validCond = {
                (elementArray.get(0).get(1) == (-elementArray.get(1).get(3))),
                (elementArray.get(0).get(2) == (-elementArray.get(3).get(0))),
                (elementArray.get(1).get(1) == (-elementArray.get(2).get(3))),
                (elementArray.get(1).get(2) == (-elementArray.get(4).get(0))),
                (elementArray.get(2).get(2) == (-elementArray.get(5).get(0))),
                (elementArray.get(3).get(1) == (-elementArray.get(4).get(3))),
                (elementArray.get(3).get(2) == (-elementArray.get(6).get(0))),
                (elementArray.get(4).get(1) == (-elementArray.get(5).get(3))),
                (elementArray.get(4).get(2) == (-elementArray.get(7).get(0))),
                (elementArray.get(5).get(2) == (-elementArray.get(8).get(0))),
                (elementArray.get(6).get(1) == (-elementArray.get(7).get(3))),
                (elementArray.get(7).get(1) == (-elementArray.get(8).get(3)))
        };

        invalidConditions.clear();

        for (int i = 0; i < validCond.length; i++) {
            if (!validCond[i]) {
                switch (i) {
                    case 0:
                        invalidConditions.add(new int[] { 0, 1, 1, 3 });
                        break;
                    case 1:
                        invalidConditions.add(new int[] { 0, 2, 3, 0 });
                        break;
                    case 2:
                        invalidConditions.add(new int[] { 1, 1, 2, 3 });
                        break;
                    case 3:
                        invalidConditions.add(new int[] { 1, 2, 4, 0 });
                        break;
                    case 4:
                        invalidConditions.add(new int[] { 2, 2, 5, 0 });
                        break;
                    case 5:
                        invalidConditions.add(new int[] { 3, 1, 4, 3 });
                        break;
                    case 6:
                        invalidConditions.add(new int[] { 3, 2, 6, 0 });
                        break;
                    case 7:
                        invalidConditions.add(new int[] { 4, 1, 5, 3 });
                        break;
                    case 8:
                        invalidConditions.add(new int[] { 4, 2, 7, 0 });
                        break;
                    case 9:
                        invalidConditions.add(new int[] { 5, 2, 8, 0 });
                        break;
                    case 10:
                        invalidConditions.add(new int[] { 6, 1, 7, 3 });
                        break;
                    case 11:
                        invalidConditions.add(new int[] { 7, 1, 8, 3 });
                        break;
                }
            }
        }

        return invalidConditions.isEmpty();
    }

    @FXML
    private void validCheck(ActionEvent event) {
        ArrayList<int[]> invalidCards = new ArrayList<int[]>();
        boolean isValid = checkingBoard(board.getElementArray(), invalidCards); // Call the validation method

        // Find or create a label to display the result
        Label resultLabel = new Label();
        resultLabel.setText(isValid ? "You Did It!" : "Try Again!");
        resultLabel.setStyle(isValid ? "-fx-text-fill: green;" : "-fx-text-fill: red;");
        resultLabel.setFont(new Font("Comic Sans MS Bold Italic", 15));
        resultLabel.setLayoutX(260); // Align at the center of the screen
        resultLabel.setLayoutY(51); // Adjust layoutY with the BACK button

        // Remove any existing result label before adding the new one
        Parent root = ((Button) event.getSource()).getScene().getRoot();
        if (root instanceof Pane) {
            Pane pane = (Pane) root;
            pane.getChildren().removeIf(node -> node instanceof Label && "resultLabel".equals(node.getId()));
            resultLabel.setId("resultLabel");
            pane.getChildren().add(resultLabel);
        }
        // Reset result label after 5 seconds
        if (!isValid) {
            PauseTransition pauseLabel = new PauseTransition(Duration.seconds(5));
            pauseLabel.setOnFinished(e -> resultLabel.setText(""));
            pauseLabel.play();
        }

        // Clear all borders
        for (Label label : labels) {
            label.setStyle(null);
        }

        // Add border to invalid cards
        for (int[] invalidPairs : invalidCards) {
            if (Arrays.equals(invalidPairs, new int[] { 0, 1, 1, 3 })) {
                labels.get(3).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(16).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 0, 2, 3, 0 })) {
                labels.get(5).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(28).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 1, 1, 2, 3 })) {
                labels.get(12).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(25).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 1, 2, 4, 0 })) {
                labels.get(14).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(37).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 2, 2, 5, 0 })) {
                labels.get(23).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(46).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 3, 1, 4, 3 })) {
                labels.get(30).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(43).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 3, 2, 6, 0 })) {
                labels.get(32).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(55).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 4, 1, 5, 3 })) {
                labels.get(39).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(52).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 4, 2, 7, 0 })) {
                labels.get(41).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(64).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 5, 2, 8, 0 })) {
                labels.get(50).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(73).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 6, 1, 7, 3 })) {
                labels.get(57).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(70).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
            if (Arrays.equals(invalidPairs, new int[] { 7, 1, 8, 3 })) {
                labels.get(66).setStyle("-fx-border-color: red; -fx-border-width: 2");
                labels.get(79).setStyle("-fx-border-color: red; -fx-border-width: 2");

            }
        }
        // Set green background for valid cards
        if (isValid) {
            for (Label label : labels) {
                label.setStyle("-fx-border-color: green; -fx-border-width: 2");
            }
            return;
        }

        // Reset borders after 5 seconds
        PauseTransition pause = new PauseTransition(Duration.seconds(5));
        pause.setOnFinished(e -> resetCardBorders());
        pause.play();
    }

    private void resetCardBorders() {
        for (Label label : labels) {
            label.setStyle("-fx-border-color: transparent;");
        }
    }

    @FXML
    private void restartGame() throws IOException {
        // Close the Solution window if it is opened
        if (solutionStage != null) {
            solutionStage.close();
            solutionStage = null; // Reset the reference
        }

        // Restart the game
        App.setRoot("game");
    }
}