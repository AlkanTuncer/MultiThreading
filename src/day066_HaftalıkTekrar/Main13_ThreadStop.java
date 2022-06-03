package day066_HaftalıkTekrar;

public class Main13_ThreadStop implements Runnable{

    // Thread.stop() metotu kullanımdan kalkmıştır.
        // Deprecated - Kullanımdan kalkmış
        // İster extend Thread ister implement Runnable kullanılsın kendi stop metodumuzu tasarlamamız gerekir.

    private boolean flag = false;

    private synchronized boolean keepRunning(){
        return flag == false;  // true döndürür.
    }

    private synchronized boolean doStop(){
        return flag = true;
    }

    @Override
    public void run() {
        while (keepRunning()){
            System.out.println("Thread çalışıyor.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Main13_ThreadStop main13 = new Main13_ThreadStop();
        Thread thread = new Thread(main13);
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        main13.doStop();
        //thread.stop(); kullanmıyoruz.

    }
}
