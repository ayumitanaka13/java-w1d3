// (Compute the perimeter of a triangle)
// Write a program that reads three edges for a triangle and computes the perimeter
// if the input is valid. Otherwise, display that the input is invalid.
// The input is valid if the sum of every pair of two edges is greater than the remaining edge.
// (this is pythagorean theorm)

import java.util.Scanner;

public class PerimeterOfATriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1: Please enter a number");
        double perimeterA = input.nextDouble();
        System.out.println("2: Please enter a number");
        double perimeterB = input.nextDouble();
        System.out.println("3: Please enter a number");
        double perimeterC = input.nextDouble();

        if (perimeterA + perimeterB > perimeterC)
            System.out.println("The input is valid");
        else if (perimeterB + perimeterC > perimeterA)
            System.out.println("The input is valid");
        else if (perimeterC + perimeterA > perimeterB)
            System.out.println("The input is valid");
        else System.out.println("The input is invalid");

        System.out.println("The total length is " + perimeterA + perimeterB + perimeterC);

    }
}
