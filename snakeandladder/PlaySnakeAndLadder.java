package snakeandladder;

import java.util.HashMap;

public class PlaySnakeAndLadder {
    Entities entities;
    Dice dice;
    HashMap<String, Integer> getPlayersLatestPosition;

    PlaySnakeAndLadder(int n) {
        dice = new Dice(6);
    }

    public String playGame() {
        initializePlayerStartValue();
        return "";
    }

    private void initializePlayerStartValue() {
        for (int i = 0; i < 2; i++) {
            getPlayersLatestPosition.put(entities.getPlayers().get(i), 0);
        }
    }
}
