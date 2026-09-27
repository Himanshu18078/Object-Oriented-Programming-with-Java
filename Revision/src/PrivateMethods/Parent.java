package PrivateMethods;

public class Parent {
    private void show(){
        System.out.println("Parent");
    }

    static void main() {
        Parent parent = new Parent();
        parent.show();
        Parent parent1 = new Child();
        parent1.show();
    }
}
