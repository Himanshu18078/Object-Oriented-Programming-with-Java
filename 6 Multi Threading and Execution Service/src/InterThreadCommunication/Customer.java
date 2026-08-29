package InterThreadCommunication;

public class Customer {
    int amount = 5000;
    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw...");
        while(this.amount < amount){
            System.out.println("Your account has less balance......");
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        this.amount = this.amount - amount;
        System.out.println("Withdraw completed ... Current Balance : "+ this.amount);
    }
    synchronized void deposit(int amount){
        System.out.println("Going to deposit....");
        this.amount = this.amount + amount;
        System.out.println("Deposit completed... Current Balance is : "+ this.amount);
        notify();
    }
}
