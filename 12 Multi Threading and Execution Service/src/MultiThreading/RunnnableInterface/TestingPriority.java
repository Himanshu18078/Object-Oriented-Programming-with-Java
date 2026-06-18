package MultiThreading.RunnnableInterface;

public class TestingPriority {
    static void main() {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        // Sets the thread priority to MAX_PRIORITY (10).
        // Higher priority may increase the chance of execution,
        // but the actual scheduling is determined by the JVM and OS.
        t1.start();
        t2.start();
        t3.start();

    }
}
