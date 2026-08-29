package ClassAndInterface;

public class Runnable1 extends Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Here I have implemented runnable...");
    }
}
