package ObjectVSReferenceType;

public class Dog extends  Animal{
    Dog(){
        System.out.println("I am dog");
    }
    @Override
    void sound(){
        System.out.println("Barks");
    }
    void run(){
        System.out.println("Dog is running");
    }
}
