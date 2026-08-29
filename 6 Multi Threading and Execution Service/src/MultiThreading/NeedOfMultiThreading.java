package MultiThreading;

public class NeedOfMultiThreading {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        //First Task
        for(int i = 1; i <= 1000; i++){
            System.out.printf("%d* ",i);
        }
        System.out.println("\n* Task Completed");
        //Second Task
        for(int i = 1; i <= 1000; i++){
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n* Task Completed");
        //Third Task
        for(int i = 1; i <= 1000; i++){
            System.out.printf("%d# ",i);
        }
        System.out.println("\n* Task Completed");
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken : %d",(endTime - startTime));

    }
}
