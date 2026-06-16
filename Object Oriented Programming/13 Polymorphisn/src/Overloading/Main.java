package Overloading;

public class Main {
    Main(){
        System.out.println("Default Constructor called");
    }
    Main(String pop){
        System.out.println(pop);
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b,int c){
        return a+b+c;
    }
    public static String add(String a, String b){
        return  a + b;
    }
    public static void main(String [] args){
        System.out.println(Main.add(2,3));
        System.out.println(Main.add(2,3,4));
        System.out.println(Main.add("Himanshu","Bisht"));
    }
}
