package day064.bilardo;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Pervane extends JComponent implements Runnable {

    private int aci;
    private Color renk1,renk2;
    private boolean flag;
    private int kontrol;

    public Pervane() {
        this.aci = 45;
        int r = ThreadLocalRandom.current().nextInt(0,256);
        int g = ThreadLocalRandom.current().nextInt(0,256);
        int b = ThreadLocalRandom.current().nextInt(0,256);
        this.renk1 = new Color(r,g,b);
        this.renk2 = Color.white;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true){
            flag =! flag;
            kontrol = flag ? 0 : 1;
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 360/aci ; i++) {
            Color renk = i%2 == kontrol ? renk1 : renk2;
            g.setColor(renk);
            g.fillArc(0, 0, getWidth(), getHeight(),(i+1)*aci, aci);
        }
    }
}
