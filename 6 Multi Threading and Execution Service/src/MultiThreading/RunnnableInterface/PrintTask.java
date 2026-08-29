package MultiThreading.RunnnableInterface;

public class PrintTask implements Runnable{
    char Symbol;
    public PrintTask(char Symbol){
        this.Symbol = Symbol;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d %c", i,Symbol);
        }
        System.out.printf("\n%s %c Task Completed",Thread.currentThread().getName(),Symbol);
    }
}
