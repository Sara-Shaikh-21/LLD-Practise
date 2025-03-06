package snakeandladder;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Entities entity = Entities.getInstance();

        System.out.println("Enter total number of snakes:");
        int noOfSnakes = input.nextInt();
        System.out.println("Enter snake's source and destination position:");
        for (int i = 0; i < noOfSnakes; i++) {
            int source;
            int destination;
            source = input.nextInt();
            destination = input.nextInt();
            entity.setSnakes(source, destination);
        }

        System.out.println("Enter total number of ladders:");
        int noOfLadder = input.nextInt();
        System.out.println("Enter ladder's source and destination position:");
        for (int i = 0; i < noOfLadder; i++) {
            int source;
            int destination;
            source = input.nextInt();
            destination = input.nextInt();
            entity.setLadder(source, destination);
        }
        String p1, p2;
        System.out.println("Enter player 1 name: ");
        p1 = input.next();
        System.out.println("Enter player 2 name: ");
        p2 = input.next();
        entity.setPlayers(p1, p2);
        // System.out.println(entity.getPlayers());

        PlaySnakeAndLadder PlaySnakeAndLadderObj = new PlaySnakeAndLadder(6);
        System.out.println(PlaySnakeAndLadderObj.playGame() + " wins the game!");
        input.close();
    }

}