package Switch;

import java.util.Scanner;

public class Switch2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number (1 to 7): ");
        int num = input.nextInt();
        String day = switch (num){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 ->"Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            default -> "Invalid";
        };
        System.out.println(day);
    }
}
