package Synchronization;

public class TestSynchronization {
    static void main() {
        Table t = new Table();
        Mythread1 t1 = new Mythread1(t);
        MyThread2 t2 = new MyThread2(t);
        t1.start();
        t2.start();
    }
}
