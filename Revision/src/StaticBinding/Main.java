package StaticBinding;

public class Main {
    static void main() {
//        Parent parent = new Parent();
//        parent.show();
        Parent.show();
        Parent parent = new Child();
        parent.show();
        Child.show();
    }
}
