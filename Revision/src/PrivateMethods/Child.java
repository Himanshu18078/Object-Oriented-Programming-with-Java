package PrivateMethods;

public class Child extends Parent{
    private void show(){
        System.out.println("Child");
    }

    static void main() {
        Child child = new Child();
        child.show();
        Parent parent = new Child();
//        parent.show();
    }
}
