package pl.mpas.advances_programming.third;

import java.util.PriorityQueue;

public class Example {

    public static void main(String[] args) {
        Runnable daemonJob = () -> {
            for (int i = 0; i < 10; i++){
                System.out.println("Run by: " + Thread.currentThread().getName() + ", Iteration: " + (i + 1));
        }
        };


        Runnable spawnJob = () -> {

            for (int i = 0; i < 3; i++) {
                String daemonName = Thread.currentThread().getName() + "-" + "daemon" + i;

                Thread newOne = new Thread(daemonJob);
                newOne.setDaemon(true);
                newOne.start();
                try {
                    Thread.sleep(500);  //janusz idz na piwo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread janusz = new Thread(spawnJob, "Janusz");
        janusz.setPriority(Thread.MAX_PRIORITY);
                janusz.start();


        Thread stefan = new Thread(spawnJob, "Stefan");
                stefan.setPriority(Thread.MIN_PRIORITY);
        stefan.start();

    }
}
