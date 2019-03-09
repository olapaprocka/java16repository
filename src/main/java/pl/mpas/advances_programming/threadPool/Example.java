package pl.mpas.advances_programming.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {

    public static void main(String[] args) {

        Runnable job = () -> {
            System.out.println("Performed by: " + Thread.currentThread().getName());
        };


        Runnable job1 = () -> {
            System.out.println("Performed by job1: " + Thread.currentThread().getName());
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            workers.execute(job);
            workers.execute(job1);
        }

        //workers.shutdown();
       // workers.execute(job);
        System.out.println("after sending........");

//        ExecutorService workers1 = Executors.newFixedThreadPool(2);
//
//        for (int i = 0; i < 5; i++) {
//            workers1.execute(job);
//        }
//        System.out.println("after after sending........");

    }
}