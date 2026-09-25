package ObjectVSReferenceType;

public class Main {
    static void main() {
        Animal animal;
        animal = new Dog();
        animal.sound();
        animal = new Fish();
        animal.sound();
    }
}
