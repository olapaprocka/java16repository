package pl.mpas.advances_programming.threadSecond;

public class SecondThreadExample {

    public static void main(String[] args) {
        System.out.println("main beginning");

        Runnable job = () -> {

            for (int i = 0; i < 10; i++){
                System.out.println(("Run by: " + Thread.currentThread().getName()+", iteration: " + (i+1) ));
            }
        };


        Thread worker1 = new Thread(job, "Stefan");
        worker1.setDaemon(true);
        Thread worker2 = new Thread(job, "Zdzislaw");
        worker2.setDaemon(true);
        Thread worker3 = new Thread(job, "Janusz");
        worker3.setDaemon(true);
        // worker.setName("Worker");
       // worker1.run();//nie wywołujemy nie robimy tak- dajesz robote i robisz ją sama
        //chociaz kiedy chcemy nazwac main to musi byc run
        worker1.start(); //robi robote Janusz a nie ja za niego
        System.out.println("inside main");
        worker2.start();
        System.out.println("inside main");
        worker3.start();
       // worker.start();

        System.out.println("main end");

//    worker bierze prace
//    main buerze 3x
//    obserwujemy wyjscie

    }
}
