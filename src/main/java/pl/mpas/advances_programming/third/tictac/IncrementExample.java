package pl.mpas.advances_programming.third.tictac;

//class Job implements Runnable {
//
//    private int toIncrement = 0;
//    private static  int staticIncrement = 1;
//
//    public static void incStatic(){
//        synchronized (Job.class){
//            staticIncrement++;
//        }
//    }
//
//
//    @Override
//    public String toString() {
//        return "Job{" +
//                "toIncrement=" + toIncrement +
//                '}';
//    }
//
//    @Override
//    synchronized public void run() {  //tylko jeden wątek może wykonywać na raz
//                  for (int i = 0; i < 900; i++) {
//
//                System.out.println("Increased by thread: " + Thread.currentThread().getName());
//                synchronized (this) {toIncrement++;
//            }
//        }
//    }
//}

public class IncrementExample {

    public static void main(String[] args) {
//        Job job = new Job();
//        Thread worker1 = new Thread(job, "janusz");
//        Thread worker2 = new Thread(job, "andrzej");
//        worker1.start();
//        worker2.start();
//
//        try {
//            worker1.join();
//            worker2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Current job value: " + job);
    }
}
