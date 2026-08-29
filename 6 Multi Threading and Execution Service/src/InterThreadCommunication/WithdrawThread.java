package InterThreadCommunication;

public class WithdrawThread extends Thread{
    Customer c;
    WithdrawThread(Customer c){
        this.c = c;
    }

    @Override
    public void run() {
        c.withdraw(10000);
    }
}
