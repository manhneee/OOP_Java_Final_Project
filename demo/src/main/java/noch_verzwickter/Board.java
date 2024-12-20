package noch_verzwickter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Board {
    private ArrayList<ArrayList<Integer>> elementArray;
    private ArrayList<ArrayList<Integer>> solution;

    Random random = new Random();

    // Generate a random value for each card on the board (encoded values are
    // between -4 and 4, excluding 0)
    private int generateRandomValue() {
        int value;
        do {
            value = random.nextInt(9) - 4; // Generate numbers between -4 and 4
        } while (value == 0); // Ensure value is not 0
        return value;
    }

    // To manually set a card's element
    private void setCardElement(int indexImage, int value, ArrayList<Integer> receiver) {
        if (indexImage >= 4) {
            throw new IndexOutOfBoundsException("Index Out Of Bounds");
        }
        if (receiver.size() > indexImage) {
            receiver.remove(indexImage);
        }
        receiver.add(indexImage, value);
    }

    private int getCardElement(int indexImage, ArrayList<Integer> card) {
        if (indexImage >= 4) {
            throw new IndexOutOfBoundsException("Index Out Of Bounds");
        }
        return card.get(indexImage);
    }

    public Board() {
        elementArray = new ArrayList<>();
        solution = new ArrayList<>();

        // Create nine cards by randomly generating values, setting those in pairs to
        // match as to create a solved board

        // First Card
        ArrayList<Integer> firstCard = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            firstCard.add(generateRandomValue());
        }
        elementArray.add(firstCard);

        // Second Card
        ArrayList<Integer> secondCard = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            secondCard.add(generateRandomValue());
        }
        setCardElement(3, -getCardElement(1, firstCard), secondCard);
        elementArray.add(secondCard);

        // Third card
        ArrayList<Integer> thirdCard = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            thirdCard.add(generateRandomValue());
        }
        setCardElement(3, -getCardElement(1, secondCard), thirdCard);
        elementArray.add(thirdCard);

        // Fourth card
        ArrayList<Integer> fourthCard = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            fourthCard.add(generateRandomValue());
        }
        setCardElement(0, -getCardElement(2, firstCard), fourthCard);
        elementArray.add(fourthCard);

        // Fifth card
        ArrayList<Integer> fifthCard = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            fifthCard.add(generateRandomValue());
        }
        setCardElement(0, -getCardElement(2, secondCard), fifthCard);
        setCardElement(3, -getCardElement(1, fourthCard), fifthCard);
        elementArray.add(fifthCard);

        // Sixth card
        ArrayList<Integer> sixthCard = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            sixthCard.add(generateRandomValue());
        }
        setCardElement(0, -getCardElement(2, thirdCard), sixthCard);
        setCardElement(3, -getCardElement(1, fifthCard), sixthCard);
        elementArray.add(sixthCard);

        // Seventh card
        ArrayList<Integer> seventhCard = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            seventhCard.add(generateRandomValue());
        }
        setCardElement(0, -getCardElement(2, fourthCard), seventhCard);
        elementArray.add(seventhCard);

        // Eighth card
        ArrayList<Integer> eighthCard = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            eighthCard.add(generateRandomValue());
        }
        setCardElement(0, -getCardElement(2, fifthCard), eighthCard);
        setCardElement(3, -getCardElement(1, seventhCard), eighthCard);
        elementArray.add(eighthCard);

        // Ninth card
        ArrayList<Integer> ninthCard = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            ninthCard.add(generateRandomValue());
        }
        setCardElement(0, -getCardElement(2, sixthCard), ninthCard);
        setCardElement(3, -getCardElement(1, eighthCard), ninthCard);
        elementArray.add(ninthCard);

        // Store solution
        for (ArrayList<Integer> card : elementArray) {
            solution.add(new ArrayList<>(card));
        }

        // Shuffle the board
        elementArray = shuffleCard(elementArray);
    }

    private void rotateCard(ArrayList<Integer> array, int rotations, boolean clockwise) {
        rotations %= 4; // Optimize unnecessary rotations
        if (!clockwise) {
            rotations = 4 - rotations; // Reverse direction
        }
        for (int i = 0; i < rotations; i++) {
            int temp;
            if (clockwise) {
                temp = array.get(0);
                array.set(0, array.get(1));
                array.set(1, array.get(2));
                array.set(2, array.get(3));
                array.set(3, temp);
            } else {
                temp = array.get(3);
                array.set(3, array.get(2));
                array.set(2, array.get(1));
                array.set(1, array.get(0));
                array.set(0, temp);
            }
        }
    }

    private ArrayList<ArrayList<Integer>> rotateShuffle(ArrayList<ArrayList<Integer>> array) {
        for (ArrayList<Integer> card : array) {
            int rotations = random.nextInt(4); // 0-3 rotations
            boolean clockwise = random.nextBoolean();
            rotateCard(card, rotations, clockwise);
        }
        return array;
    }

    private ArrayList<ArrayList<Integer>> shuffleCard(ArrayList<ArrayList<Integer>> array) {
        ArrayList<ArrayList<Integer>> temparray = new ArrayList<>(array);
        Collections.shuffle(temparray); // Shuffle the array
        rotateShuffle(temparray); // Rotate and return
        return temparray;
    }

    public ArrayList<ArrayList<Integer>> getElementArray() {
        return this.elementArray;
    }

    public ArrayList<ArrayList<Integer>> getSolution() {
        return this.solution;
    }
}
