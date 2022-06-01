package day064.bilardo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);  // Pencere teması için

        SwingUtilities.invokeLater(new Runnable() {  // Başka bir Thread'de oluşturma sebebimiz ;
            @Override                                // main Thread'de bir hata olursa penceremiz çalışsın etkilenmesin bundan.
            public void run() {
                System.out.println(Thread.currentThread().getName());
                new Form();
            }
        });

    }
}
