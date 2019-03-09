package pl.mpas.advances_programming.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadWaitExample {

    static private int i =  0;

    public static void main(String[] args) {

        Runnable job = () -> {
           synchronized(ThreadWaitExample.class) {
               i++;
           }
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);

        for (int j = 0; j < 200; j++) {
            workers.execute(job);
        }
        workers.shutdown();
try {

    workers.awaitTermination(1000, TimeUnit.DAYS);
}catch (InterruptedException e){
    e.printStackTrace();
}
        System.out.println("i= " + i);


     //   System.out.println("after sending........");
    }
}

