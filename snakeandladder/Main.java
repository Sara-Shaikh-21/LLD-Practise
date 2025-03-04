package snakeandladder;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Entities entity = new Entities();

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
        System.out.println("Enter player's name: ");
        String p1 = input.next();
        String p2 = input.next();
        entity.setPlayers(p1, p2);

        PlaySnakeAndLadder PlaySnakeAndLadderObj=new PlaySnakeAndLadder(6);

    }

}