package streams;

import java.util.List;

public class TestingFilter {
    static void main() {
        List<String> list = List.of("Apple" , "Banana" , "Mango" , "Date");
        list.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));


        /*
        list.stream().forEach(System.out::println);

        */

        /*
        list.stream().
                forEach(
                        new Consumer<String>() {
                            @Override
                            public void accept(String s) {
                                System.out.println(s);
                            }
                        }
                );
         */
    }
}
