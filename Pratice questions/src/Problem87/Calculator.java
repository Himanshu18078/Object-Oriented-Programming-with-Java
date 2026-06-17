package Problem87;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 , num2;
        System.out.println("Enter first number : ");
        num1=sc.nextInt();
        System.out.println("Enter second number : ");
        num2=sc.nextInt();
        try{
            int result = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Code ends here...");
        }
    }
}
