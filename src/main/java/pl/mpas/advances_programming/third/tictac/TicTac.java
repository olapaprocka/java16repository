package pl.mpas.advances_programming.third.tictac;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Job implements Runnable {

    private String toPrint;
    private Object syncObject;

    public Job(String toPrint, Object syncObject) {
        this.toPrint = toPrint;
        this.syncObject = syncObject;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (syncObject){
                System.out.println(toPrint);
                try{
                    syncObject.notify();
                    syncObject.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

public class TicTac {

    public static void main(String[] args) {
        Object syn = new Object();
        Job tic = new Job("Tic", syn);
        Job tac = new Job("Tac", syn);

        ExecutorService workers = Executors.newFixedThreadPool(4);
        workers.execute(tic);
        workers.execute(tac);


    }


}
