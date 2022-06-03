package day066_HaftalıkTekrar;

public class Main3 extends Thread{
    @Override
    public void run() {
        System.out.println("Yeni Thread içinde çalışan kod.");
    }


    public static void main(String[] args) {

        Main3 main3 = new Main3();
        main3.start();
        System.out.println("Bu kod Yeni Thread'in dışında.");

    }
}