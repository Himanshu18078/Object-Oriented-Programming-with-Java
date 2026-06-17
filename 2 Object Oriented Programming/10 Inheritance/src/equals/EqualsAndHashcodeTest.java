package equals;

public class EqualsAndHashcodeTest {
    static void main() {
        Person person1 = new Person("Himanshu",21,"18078");
        Person person2 = new Person("Himanshu",21,"18078");
        if(person1.equals(person2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
