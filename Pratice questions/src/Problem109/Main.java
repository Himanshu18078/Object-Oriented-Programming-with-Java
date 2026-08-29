package Problem109;

import java.util.List;

public class Main {
    static void main() {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach( number -> System.out.println(number));
    }
}
