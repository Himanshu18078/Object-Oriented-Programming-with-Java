package InterThreadCommunication;

public class DepositThread extends Thread {
    Customer c;
    DepositThread(Customer c){
        this.c = c;
    }

    @Override
    public void run() {
        c.deposit(20000);
    }
}
