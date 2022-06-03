package day066_HaftalıkTekrar;

public class Main6 implements Runnable{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" Thread'i çalıştı.");
        //System.out.println(Thread.currentThread().getName()+" Thread'i çalıştı.");
    }

    public static void main(String[] args) {
        Main6 main6 = new Main6();
        Thread th6 = new Thread(main6,"Main6");

        th6.start();
        System.out.println(Thread.currentThread().getName()+" Thread'i çalıştı.");
    }
}
