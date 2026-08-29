package Problem106;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    static void main(String[] args) {
       BinaryOperator<Integer> multi = (a,b) -> a * b;
       int result = multi.apply(4,5);
        System.out.println(result);
    }
}
