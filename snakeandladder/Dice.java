package snakeandladder;

import java.util.Random;

public class Dice {
    Random randomNumber;
    int noOfDice;

    Dice(int n) {
        randomNumber = new Random();
        this.noOfDice = n;
    }

    public int getCurrentDiceNumber() {
        return randomNumber.nextInt((this.noOfDice - 1) + 1) + 1;
    }
}
