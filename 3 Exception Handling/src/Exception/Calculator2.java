package Exception;
import java.util.Scanner;
public class Calculator2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int first , second;
        System.out.print("First : ");
        first = input.nextInt();
        System.out.println("Second : ");
        second = input.nextInt();
        try{
            int[] a = new int[5];
//            System.out.printf("Result: %d",a[6]);
            a[6] =  first / second;
            System.out.printf("Result: %d",a[6]);
        }catch (ArithmeticException e){
            System.out.printf("%s",e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("%s",e.getMessage());
        }catch (Throwable e){
            System.out.println("General Exception");
        }
        /*
        // We use multiple catch blocks because different exceptions
        // may require different recovery actions or error messages.
        // Specific exceptions should be caught before more general ones.
         */

    }
}
