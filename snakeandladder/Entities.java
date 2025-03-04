package snakeandladder;

import java.util.HashMap;

public class Entities {
    HashMap<Integer, Integer> snakes;
    HashMap<Integer, Integer> ladders;
    HashMap<Integer, String> players;

    Entities() {
        snakes = new HashMap<>();
        ladders = new HashMap<>();
    }

    public void setSnakes(int source, int destination) {
        snakes.put(source, destination);
    }

    public HashMap<Integer, Integer> getSnakes() {
        return snakes;
    }

    public void setLadder(int source, int destination) {
        ladders.put(source, destination);
    }

    public HashMap<Integer, Integer> getLadder() {
        return ladders;
    }

    public void setPlayers(String name1, String name2) {
        players.put(1, name1);
        players.put(2, name2);
    }

    public HashMap<Integer, String> getPlayers() {
        return players;
    }

}
