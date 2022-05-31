package day063.digitalsaat;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.concurrent.ThreadLocalRandom;

public class Saat extends JComponent implements Runnable{

    private Thread th;
    private Color renk;

    public Saat(){
        int r = ThreadLocalRandom.current().nextInt(0,256);
        int g = ThreadLocalRandom.current().nextInt(0,256);
        int b = ThreadLocalRandom.current().nextInt(0,256);
        renk = new Color(r,g,b);
        th = new Thread(this);
        th.start();
    }


    @Override
    public void paint(Graphics g) {
        g.setColor(renk);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.white);
        String metin = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        g.drawString(metin,5,20);
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }
}
