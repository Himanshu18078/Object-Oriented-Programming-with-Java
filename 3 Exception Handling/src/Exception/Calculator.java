package Exception;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int num1 , num2;
        System.out.print("Enter first number : ");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        System.out.print("Enter second number : ");
        num2 = input.nextInt();
        /*
        int div = num1/num2;
        System.out.printf("Result is : %d",div);

        When divided by 0 then we will get :
        Exception in thread "main" java.lang.ArithmeticException: / by zero

        Therefor we use try catch to solve this problem
         */
        try{
            int div = num1/num2;
            System.out.printf("Result is : %d",div);
        } catch (ArithmeticException e){
            /*
            // The catch block executes only if an ArithmeticException is thrown.
            // ArithmeticException commonly occurs when dividing an integer by zero.
            // 'e' is a reference variable that points to the exception object created by Java.
            // Catch receives a reference to an exception object whose class is a subclass of Throwable.
            // The catch parameter must be a reference variable of a class that inherits from Throwable.
            // Through this reference, we can access details about the exception.
            // e.getMessage() returns a descriptive message about the error (e.g., "/ by zero").
            */
            System.out.printf("%s, Please enter a valid number. ",e.getMessage());
        }
    }
}
