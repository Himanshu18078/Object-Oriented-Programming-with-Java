import java.util.Scanner;

public class cdLab {
    public static StringBuilder removePunction(String s){
        StringBuilder newString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                newString.append(c);
            }
        }
        for(int i = 0 ; i < s.length();i++){

        }
        return newString;
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string : ");
        String str = input.nextLine();
        System.out.println(removePunction(str));
    }
}
//