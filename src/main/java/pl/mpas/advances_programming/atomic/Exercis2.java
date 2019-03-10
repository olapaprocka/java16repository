package pl.mpas.advances_programming.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Exercis2 {

    // 3 wątki zwiększają zwiększają zmienną typu long (500 iteracji)
    // wątek zwiększa zmienną co 500ms (w jobie)
    // wątki używają synchronizacji przy zapisie
    // jeden wątek wypisuje (bez synchronizacji) - cały czas
    // obserwujemy wyjście i sprawdzamy czy wypis zgadza się z zapisem
    // do zmiennej

    volatile static long counter = 0;

    public static void main(String[] args) {
        Runnable increaseJob = () -> {
            long currentCounterValue;
            for (int i = 0; i < 5000; i++) {

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //poniżej odwołujemy sie do zasobu współdzielonego
                synchronized (Exercis2.class) {
                    currentCounterValue = ++counter;
                }

                System.out.println(String.format("Current value: [%s], from thred: [%s]",
                        currentCounterValue, Thread.currentThread().getName()));
            }
        };

        Runnable showJob = () -> {
            while (true) {
                System.out.println("Value: [" + counter + "]");
            }
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);
        workers.execute(showJob);  //execute dorzucanie sekwencyjne - to nie konczy się
        workers.execute(increaseJob);  //to sie konczy
        workers.execute(increaseJob);
        workers.execute(increaseJob);


    }
}