package day066_HaftalıkTekrar;

public class Main10 extends Thread{

    public static int sayi = 0;

    @Override
    public void run() {
        sayi++;
    }

    public static void main(String[] args) {
        Main10 main10 = new Main10();
        main10.start();

        int sayac = 0;
        while (main10.isAlive()){
            System.out.println(++sayac + ". kez bekliyor..");
        }

        System.out.println("Main : "+sayi);
        sayi++;
        System.out.println("Main : "+sayi);
    }
}
