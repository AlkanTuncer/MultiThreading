package day066_HaftalıkTekrar;

public class Main2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Yeni bir Thread çalıştı.");
    }

    public static void main(String[] args) {

        Main2 main2 = new Main2();
        Thread thread = new Thread(main2);

        thread.start();
    }
}
