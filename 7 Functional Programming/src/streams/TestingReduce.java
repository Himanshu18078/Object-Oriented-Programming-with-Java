package streams;

import java.util.List;

public class TestingReduce {
    static void main(String[] args) {
        List <Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        int num = numbers
                .stream()
                .reduce(0 , (a,b) -> a + b);
        System.out.println(num);
        int max = numbers
                .stream()
                .reduce(Integer.MIN_VALUE , (a , b) -> a > b ? a : b);
        System.out.println(max);
        int min = numbers
                .stream()
                .reduce(Integer.MAX_VALUE , (a , b) -> a < b ? a : b);
        System.out.println(min);
    }
}
