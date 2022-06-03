package day066_HaftalıkTekrar;

public class Main4 implements Runnable{
    @Override
    public void run() {
        System.out.println("NEW THREAD'S CODE");
    }

    public static void main(String[] args) {
        Main4 main4 = new Main4();
        Thread thread = new Thread(main4);

        thread.start();
        System.out.println("NOT NEW THREAD'S CODE");
    }
}
