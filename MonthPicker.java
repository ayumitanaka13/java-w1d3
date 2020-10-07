import java.util.Scanner;

public class MonthPicker {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between 1 - 12");
        int month = input.nextInt();

        switch (month) {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            default: System.out.println("wrong number");
        }
    }
    
}
