package day066_HaftalıkTekrar;

public class Counter implements Runnable{

    private int sayac,sure;

    public Counter(int sayac, int sure) {
        this.sayac = sayac;
        this.sure = sure;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = sayac; i >0 ; i--) {
            System.out.print(i+" ");
            try {
                Thread.sleep(sure);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Counter(10,1000));
    }
}
