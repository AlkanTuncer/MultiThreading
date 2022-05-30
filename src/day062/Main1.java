package day062;

public class Main1 {
    public static void main(String[] args) {

        // Yeni bir Thread oluşturup, Constructor'a bir Runnable nesne oluşturulup verildi.

        System.out.println(Thread.currentThread().getName()+" başladı.");

        Counter ctr = new Counter();
        Thread th1 = new Thread(ctr);

        th1.start();   // run() metodunu asla calıstırmıyoruz. Thread start() ile başlatılır. start() dediğimiz anda run() metotu çalışır.

        System.out.println(Thread.currentThread().getName()+" bitti.");   // main Thread ayrı çalıştı. Bizim th1 thread'ide başladı sonra bitti.

    }
}

record Counter() implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.print(i+" ");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}