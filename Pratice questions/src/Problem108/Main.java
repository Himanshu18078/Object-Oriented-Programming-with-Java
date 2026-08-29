package Problem108;


import javax.xml.namespace.QName;
import java.util.List;

public class Main {
    static void main() {
        List<String> str = List.of("Himanshu","Bisht","Is","Greatest","Among","All","Humans");
        str.stream()
                .filter(name -> name.length() >= 8)
                .forEach(name -> System.out.println(name));
    }
}
