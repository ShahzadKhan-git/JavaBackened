package ExecuterFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executer = Executors.newFixedThreadPool(2);
        for(int i=1; i<5; i++){
            int finalI = i;
            executer.submit(
                    () -> {
                        long result = factorial(finalI);
                        System.out.println(factorial(finalI));
                    });
        }
        executer.shutdown();
        try{
            executer.awaitTermination(100, TimeUnit.MILLISECONDS);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }

    public static int factorial(int n){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        int res=1;
        for(int i=1; i<=n; i++){
            res = res*i;
        }
        return res;
    }
}
