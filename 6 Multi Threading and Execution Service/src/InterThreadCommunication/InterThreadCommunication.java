package InterThreadCommunication;

public class InterThreadCommunication {
    public static void main(String[] args){
        Customer c = new Customer();
        WithdrawThread w = new WithdrawThread(c);
        DepositThread d = new DepositThread(c);
        w.start();
        d.start();
    }
}
