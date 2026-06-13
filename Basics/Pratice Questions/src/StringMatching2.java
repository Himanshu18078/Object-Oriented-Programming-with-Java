import java.util.Scanner;
public class StringMatching2 {
    public static String evalReverse(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }
    public static void isPalindrome(String str){
        if(str.equals(evalReverse(str))){
            System.out.print("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
//    backtracking using two pointer
    public static void isPalindrome2(String str){
        for(int i = 0; i < (str.length() / 2) ; i++){
            for(int j = str.length(); i <= (str.length()/2);i++){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println("Palindrome...");
                }else{
                    System.out.println("Not a palidrome...");
                }
            }

        }
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string : ");
       String str = input.nextLine();
       String reversedString = evalReverse(str);
        System.out.println("You have entered : "+str);
        System.out.println("Reverse is :"+reversedString);
        System.out.print("Result is : ");
        isPalindrome(str);
    }
}

