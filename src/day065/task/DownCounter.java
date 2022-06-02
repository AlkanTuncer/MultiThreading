package day065.task;

public class DownCounter extends Thread{

    // TASK 2
    private int count;

    public DownCounter(int count) {
        this.count = count;
        this.start();
    }

    @Override
    public void run() {
        do {
            System.out.print(count-- + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (count > 0);
        System.out.println();
    }

    public static void main(String[] args) {

        new DownCounter(10);
        new DownCounter(20);
        new DownCounter(30);

    }
}
