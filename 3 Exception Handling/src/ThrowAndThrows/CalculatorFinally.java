package ThrowAndThrows;

import java.util.Scanner;

public class CalculatorFinally {
    public static void a(){
        b();
    };
    public static void b(){
        c();
    };
    public static void c(){
        d();
    }
    public static void d(){
        Scanner input = new Scanner(System.in);
        int first , second;
        System.out.print("First : ");
        first = input.nextInt();
        System.out.println("Second : ");
        second = input.nextInt();
        try{
            int[] a = new int[5];
            System.out.printf("Result: %d",a[6]);
            a[6] =  first / second;
            System.out.printf("Result: %d",a[6]);
        }catch (ArithmeticException e){
            System.out.printf("%s",e.getMessage());
        }catch (Throwable e){
            System.out.println("General Exception");
            throw e;
        }finally {
            System.out.println("Finally");
        }
    };
    public static void main() {
        a();
    }
}
