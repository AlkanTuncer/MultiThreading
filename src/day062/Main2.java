package day062;

public class Main2 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+" başladı.");

        Runnable runnable = new Runnable() {  // Interface'den nesne olusturulmaz ama böyle kullanırsak bir ANONİM sınıf olusturmus oluyoruz.
            @Override                         // Runnable interface'ini implemente etmiş bir sınıfmış gibi.
            public void run() {
                System.out.println(Thread.currentThread().getName()+" başladı.");
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(i+" ");
                    System.out.println(1/0);   // Bu hata olusturdugumuz Thread'de oluştu.
                }
            }
        };

        new Thread(runnable,"Dante").start();

        //System.out.println(1/0);  // Hataya ragmen bizim olusturdugumuz Thread calısır. main Thread
        System.out.println(Thread.currentThread().getName()+" bitti.");

    }
}
