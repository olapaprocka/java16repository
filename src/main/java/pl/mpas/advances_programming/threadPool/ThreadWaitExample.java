package pl.mpas.advances_programming.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadWaitExample {

    static private int i = 0;

    public static void main(String[] args) {

        Runnable job = () -> {
            synchronized (ThreadWaitExample.class) {
                i++;
            }
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);

        for (int j = 0; j < 10; j++) {
            workers.execute(job);
        }
        workers.shutdown();

        boolean done = false;
        do {
            try {
                done = workers.awaitTermination(100, TimeUnit.SECONDS);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (!done) ;


//            while (true) {
//                try {
//                    done = workers.awaitTermination(1, TimeUnit.SECONDS);
//                    if (done) {
//                        break;
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
            System.out.println("i= " + i);


            System.out.println("after sending........");


        }
    }
}
