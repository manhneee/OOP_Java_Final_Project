package noch_verzwickter;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MenuController {
    private MusicSounds musicSounds = new MusicSounds();

    @FXML
    private Label messageLabel;

    @FXML
    private void newGame() throws IOException {
        playSE(2);
        Board newBoard = new Board(); // Initialize a new game board
        GameController.setBoard(newBoard); // Set the new board in the GameController
        App.setRoot("game");
        App.getPrimaryStage().setTitle("Noch Verzwickter");
    }

    @FXML
    private void exitApp() throws IOException {
        playSE(2);
        Platform.exit();
    }

    @FXML
    private void continueGame() throws IOException {
        playSE(2);
        Board board = loadGameState("saved_game.dat");
        if (board != null) {
            GameController.setBoard(board);
            App.setRoot("game");
            App.getPrimaryStage().setTitle("Noch Verzwickter");
        } else {
            // Handle the case where the saved game could not be loaded
            messageLabel.setText("No saved game found.");
        }
    }

    @SuppressWarnings("unchecked")
    private Board loadGameState(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("No saved game file found.");
            return null;
        }

        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<ArrayList<Integer>> elementArray = (ArrayList<ArrayList<Integer>>) in.readObject();
            ArrayList<ArrayList<Integer>> solution = (ArrayList<ArrayList<Integer>>) in.readObject();
            in.close();
            fileIn.close();
            Board board = new Board();
            board.setElementArray(elementArray);
            board.setSolution(solution);
            return board;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void playSE(int i) {
        musicSounds.setFile(i);
        musicSounds.play();
    }
}