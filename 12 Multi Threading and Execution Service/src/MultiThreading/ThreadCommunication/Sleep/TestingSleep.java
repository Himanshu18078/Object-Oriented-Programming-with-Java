package MultiThreading.ThreadCommunication.Sleep;

public class TestingSleep {
    static void main() throws InterruptedException {
        System.out.println("Before Sleeping");
        Thread.sleep(5000);
        System.out.println("Woke Up");
    }
}
