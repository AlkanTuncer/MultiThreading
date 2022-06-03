package day066_HaftalıkTekrar;

public class Main1 extends Thread{

    @Override
    public void run() {
        System.out.println("Yeni bir Thread çalıştı.");
    }

    public static void main(String[] args) {
        Main1 m = new Main1();
        m.start();

    }
}