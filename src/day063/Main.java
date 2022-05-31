package day063;

public class Main {
    public static void main(String[] args) {

        System.out.println("#"+Thread.currentThread().getId());
        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("#"+Thread.currentThread().getId());
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"Sayaç");
        th.start();

    }
}

