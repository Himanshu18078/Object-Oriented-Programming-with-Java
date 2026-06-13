public class StringFormatting2 {
    public static void main(String[] args){
        String str = "Java";
        System.out.printf("%s\n",str);
        System.out.printf("%15s\n",str); //this make sure that the string must take 15 length
        System.out.printf("%-15s\n",str);//similar to above but left align
        System.out.printf("%-15S\n",str);

    }
}
