package pl.mpas.advances_programming;

public class Exercice5 {

    public static void main(String[] args) throws InterruptedException {
        Person ola = new Person("Ola", "P.", null);
        try {
            System.out.println("Befor callig");
            synchronized (ola) {
                ola.wait();
                ola.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end.....");
    }
}