package day066_HaftalıkTekrar;

public class Main9 extends Thread{

    public Main9() {
        super("Sayaç");
    }

    @Override
    public void run() {
        say();
    }

    private void say() {
        System.out.println(Thread.currentThread().getName()+" çalışıyor.");
        for (int i = 0; i < 5; i++) {
            System.out.println("# "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" Thread başladı.");
        new Main9().start();
        System.out.println(Thread.currentThread().getName()+" Thread bitti.");
    }
}
