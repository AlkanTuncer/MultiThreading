package day062;

public class Main {
    public static void main(String[] args) {

        // MULTI THREADING _ ÇOK KANALLI PROGRAMLAMA

        // Current Thread, main, setName-getName
        System.out.println(Thread.currentThread().getName());

        Thread thread = Thread.currentThread();
        thread.setName("MyThread");
        System.out.println(1/0);

    }
}
