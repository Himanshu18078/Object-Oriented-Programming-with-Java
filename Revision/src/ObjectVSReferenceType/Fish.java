package ObjectVSReferenceType;

public class Fish extends Animal{
    Fish(){
        System.out.println("I am fish");
    }
    @Override
    void sound(){
        System.out.println("Eoowwww");
    }
    void swim(){
        System.out.println("Fish is swimming");
    }
}
