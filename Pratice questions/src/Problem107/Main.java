package Problem107;

import java.util.List;

public class Main {
    static void main() {
        List<String> str = List.of("Himanshu","Bisht","Is","Best","In","This","Fucking","World");
        str.stream().forEach(word -> System.out.print(word + " "));
    }
}
