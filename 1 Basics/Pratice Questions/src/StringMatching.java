import java.util.Scanner;
public class StringMatching {
    public static int greater(int [] arr){
        int count = 1;
        int element = arr[0];
        for (int i =1 ;i < arr.length;i++){
            if(element <= arr[i]){
                count++;
            }
        }
        return count;
    }
    public static int starAndHash(String input){
        if(input.length() == 0){
            throw new IllegalArgumentException("String length can't be 0");
        }
        int hash = 0;
        int star = 0;
        for(int i = 0 ; i < input.length() ; i++){
            if(input.charAt(i)== '#'){
                hash++;
            }
            else if(input.charAt(i) == '*'){
                star++;
            }
            else{
                throw new IllegalArgumentException("Only * and # allowed");
            }
        }
        if(hash == star){
            return 0;
        }else if( star > hash){
            return 1;
        }
        else return -1;
    }


    public static void naiveString(String S, String P){
        int count = 0;
        for(int i = 0; i < (S.length() - P.length()); i++){
            for(int j = 0; j < S.length(); j++){
                if(S.charAt(j) != P.charAt(j)){
                    System.out.println("String didn't matched");
                }
                count++;
            }
        }
        System.out.printf("There are total %d Patterns in the given string",count);
    }


    public static void matchString(String s1 ,String s2){
        if(s1.length() == s2.length()){
            for(int i =0 ; i < s1.length() ; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.printf("String didn't matched at index %d", i);
                    return;
                }
            }
        }
        System.out.println("String Matched");
    }
    public static void main(String [] args){
//        int[] arr = {5,6,8,9,1,2,3};
//        System.out.println(greater(arr));
        String staring = "allppallpp";
        String pattern = "all";
        naiveString(staring,pattern);
    }
}
