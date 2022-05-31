package day063.digitalsaat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Form extends JFrame {

    private JButton btn;
    private Saat s1,s2,s3;

    public Form() throws HeadlessException{
        super("Digital Saat");
        setLayout(null);
        setSize(800,600);
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (size.width-getWidth())/2;
        int y = (size.height-getHeight())/2;
        setLocation(x,y);
        initialize();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initialize() {
        btn = new JButton("Çiz");
        btn.setSize(80,30);
        btn.setLocation(20,20);
        btn.addActionListener((e)->ciz(e));
        add(btn);

        s1 = new Saat();
        s1.setSize(100,50);
        s1.setLocation(20,60);
        add(s1);

        s2 = new Saat();
        s2.setSize(100,50);
        s2.setLocation(20,120);
        add(s2);

        s3 = new Saat();
        s3.setSize(100,50);
        s3.setLocation(20,180);
        add(s3);
    }


    private void ciz(ActionEvent e) {
        Graphics g = this.getGraphics();
        g.drawOval(150,70,200,200);
    }

}
