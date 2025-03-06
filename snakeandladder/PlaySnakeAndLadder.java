package snakeandladder;

import java.util.HashMap;

public class PlaySnakeAndLadder {
    Entities entities;
    Dice dice;
    HashMap<String, Integer> playersLatestPosition;

    public PlaySnakeAndLadder(int n) {
        dice = new Dice(6);
        playersLatestPosition = new HashMap<>();
        entities = Entities.getInstance();
    }

    public String playGame() {
        initializePlayerStartValue();

        int i = -1;
        do {
            i++;
            if (i >= entities.getPlayers().size()) {
                i = 0;
            }
            StringBuilder str = new StringBuilder();
            String currentPlayer = entities.getPlayers().get(i);
            str.append(currentPlayer);
            int currentDiceNumber = dice.getCurrentDiceNumber();
            int endPosition = playersLatestPosition.get(currentPlayer) + currentDiceNumber;
            String sl = "";
            if (checkOutOfRange(endPosition)) {
                str.append(" rolled a ").append(currentDiceNumber);
                str.append(" and moved from ").append(playersLatestPosition.get(currentPlayer));
                if (entities.getSnakes().get(endPosition) != null) {
                    sl = " after Snake dinner ";
                    playersLatestPosition.put(currentPlayer, entities.getSnakes().get(endPosition));
                } else {
                    if (entities.getLadder().get(endPosition) != null) {
                        playersLatestPosition.put(currentPlayer, entities.getLadder().get(endPosition));
                        sl = " after Ladder ride ";
                    } else {
                        playersLatestPosition.put(currentPlayer, endPosition);

                    }
                }
                str.append(" to ").append(playersLatestPosition.get(currentPlayer));
                str.append(sl);
            }

            System.out.println(str);

        } while (!winnerFound(entities.getPlayers().get(i)));
        return entities.getPlayers().get(i);
    }

    private void initializePlayerStartValue() {
        for (int i = 0; i < entities.getPlayers().size(); i++) {
            playersLatestPosition.put(entities.getPlayers().get(i), 0);
        }
    }

    private boolean winnerFound(String player) {
        return playersLatestPosition.get(player) == 100;
    }

    private boolean checkOutOfRange(int position) {
        return position <= 100;
    }
}
