package pl.mpas.advances_programming.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class Exercicel {

    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();

        Runnable job = () -> {
            for (int i = 0; i < 100; i++) {
                int tmp = counter.incrementAndGet();  //++current
                System.out.println("Run by: " + Thread.currentThread().getName() + " current atomic value: " + tmp);
            }
        };

        ExecutorService workers = Executors.newFixedThreadPool(3);
        workers.execute(job);
        workers.execute(job);
        workers.execute(job);

        workers.shutdown();

        boolean done = false;
        do {
            try {
                done = workers.awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!done);

        System.out.println("Value from main: " + counter);
        System.out.println("end");
    }
}



