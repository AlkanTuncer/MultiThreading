package day066_HaftalıkTekrar;

public class Main5 extends Thread{

    public Main5() {
        super("Main5");
    }

    @Override
    public void run() {
        System.out.println(this.getName()+" Thread'i çalıştı.");
    }

    public static void main(String[] args) {
        new Main5().start();
        System.out.println(Thread.currentThread().getName()+" Thread'i çalıştı.");
    }
}
