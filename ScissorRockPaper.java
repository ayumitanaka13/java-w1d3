// (Game: scissor, rock, paper)
// Write a program that plays the popular scissor-rock-paper game.
// (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
// The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
// The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
// whether the user or the computer wins, loses, or draws.

import java.lang.Math;
import java.util.Scanner;

public class ScissorRockPaper {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number 0: rock, 1: paper, or 2: scissor");

        int handA = input.nextInt(); // human
        int handB = (int)(Math.random() * 3); // computer

        // int rock = 0;
        // int paper = 1;
        // int scissor = 2;

        switch (handA) {
            case 0: System.out.println("You are rock.");
            break;
            case 1: System.out.println("You are paper.");
            break;
            case 2: System.out.println("You are scissor.");
            break;
            default: System.out.println("wrong number");
        }

        switch (handB) {
            case 0: System.out.println("The computer is rock.");
            break;
            case 1: System.out.println("The computer is paper.");
            break;
            case 2: System.out.println("The computer is scissor.");
        }

        if (handA == handB)
            System.out.println("Draw");
        else if (handA == 0 && handB == 2 || handA == 1 && handB == 0 || handA == 2 && handB == 1)
            System.out.println("You win!");
        else System.out.println("You lose...");
    }
}
