package TernaryOperator;
import java.util.Scanner;
public class TernaryOperator1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        /*A Scanner object cannot read by itself.
        It needs another object (like System.in) to tell it what to read and from where.
        System.in is an InputStream that represents the keyboard, so Scanner reads keyboard input*/
        System.out.println("Welcome to number checker");
        System.out.print("Please enter the number : ");
        int num1 = input.nextInt();
        System.out.print("Please enter another number : ");
        int num2 = input.nextInt();
        int num =  num1 > num2 ? num1 : num2;
        System.out.println(num +" is greater");
    }
}
