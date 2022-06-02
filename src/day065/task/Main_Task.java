package day065.task;

public class Main_Task {
    public static void main(String[] args) {

        // TASK 1
        Runnable downCounter = new Runnable() {
            @Override
            public void run() {
                int sayac = 10;
                do {
                    System.out.print(sayac-- +" ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (sayac < 0) break;
                }while (true);
                System.out.println();
            }
        };

        new Thread(downCounter).start();

        // TASK 1 - Lambda Expression ile
        Runnable rn = () -> {
            int sayac = 10;
            do {
                System.out.print(sayac-- +" ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (sayac < 0) break;
            }while (true);
            System.out.println();
        };

        new Thread(rn).start();

    }
}
