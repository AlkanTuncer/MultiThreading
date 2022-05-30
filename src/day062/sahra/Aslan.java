package day062.sahra;

public class Aslan extends Hayvan implements Runnable{

    private Thread th;
    private int hiz;

    public Aslan(String isim,int hiz) {
        super(isim);
        this.hiz = hiz;
        th = new Thread(this,isim); // Thread'te de aslanın ismini verdik.
        th.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(10000/hiz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getIsim()+" "+(i*20)+" metre ilerledi.");
        }
    }
}
