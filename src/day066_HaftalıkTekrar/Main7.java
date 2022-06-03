package day066_HaftalıkTekrar;

public class Main7 extends Thread{

    private static int sayi = 0;

    @Override
    public void run() {
        sayi++;
    }

    public static void main(String[] args) {
        Main7 main7 = new Main7();
        main7.start();
        System.out.println(sayi);
        sayi++;
        System.out.println(sayi);
    }
}
