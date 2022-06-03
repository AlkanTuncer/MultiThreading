package day066_HaftalıkTekrar;

public class Main12_ThreadWithLambda {
    public static void main(String[] args) {

        // Gövdesiz
        Runnable runnable1 = () -> System.out.println("Thread çalıştı. Aktif Thread : "+Thread.currentThread().getName());
        new Thread(runnable1,"Gövdesiz").start();

        // Gövdeli
        Runnable runnable2 = () -> {
            String name = Thread.currentThread().getName();
            long id = Thread.currentThread().getId();
            System.out.printf("%s Thread'i %d ID ile çalıştı.\n",name,id);
        };
        new Thread(runnable2,"Gövdeli").start();

        // Metot Referansı ile
        Runnable runnable3 = Main12_ThreadWithLambda::go;
        new Thread(runnable3,"MetotReferansı").start();

    }

    private static void go() {
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        System.out.println("Thread : "+name+" - ID : "+id);
    }
}
