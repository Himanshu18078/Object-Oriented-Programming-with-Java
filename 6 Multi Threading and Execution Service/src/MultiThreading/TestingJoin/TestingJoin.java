package MultiThreading.TestingJoin;

import MultiThreading.RunnnableInterface.PrintTask;

public class TestingJoin {
    static void main() throws InterruptedException {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("Thread 1 Started ");
        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("Thread 2 Started ");
        t1.join();
        t1.join();
        /*
         * Waits for t1 to finish execution.
         *
         * The main thread is blocked at this point and cannot execute the
         * statements that follow until t1 terminates.
         *
         * Since t2 has already been started, it continues running independently
         * while the main thread is waiting for t1.
         *
         * After t1 completes, the main thread resumes execution and starts t3.
         */
        Thread t3 = new Thread(p3);
        t3.start();
    }
}
