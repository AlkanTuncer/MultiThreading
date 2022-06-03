package day066_HaftalıkTekrar;

public class Main11_AnonimNesne {
    public static void main(String[] args) {

        // Anonim Nesne Kullanımı

        Runnable runnable = new Runnable() {   // Bir interface'in örneği oluşturulamaz. Bir sınıf(abstract olmayan) interface'i implement ederse o sınıfın nesnesi oluşturulur.
            @Override                          // Ama ANONİM sınıf/nesne oluşturup kullanabiliriz metodu implement ederek.
            public void run() {
                System.out.println("Thread Name : "+Thread.currentThread().getName()+" - Thread ID : "+Thread.currentThread().getId());
            }
        };

        Thread thread = new Thread(runnable);  // Referansa ihtiyaç yoksa : new Thread(runnable).start();

        new Thread(runnable,"T1").start();
        new Thread(runnable,"T2").start();
        new Thread(runnable,"T3").start();

        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        System.out.println("Thread Name : "+Thread.currentThread().getName()+" - Thread ID : "+Thread.currentThread().getId());

    }
}
