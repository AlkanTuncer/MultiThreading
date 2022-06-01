package day064.bilardo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.ThreadLocalRandom;

public class Form extends JFrame {

    private JButton btnCiz;
    private Pervane pervane1,pervane2;

    public Form() throws HeadlessException {
        super("Bilardo v1");
        this.setLayout(null);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension screenSize = new Dimension(800,600);
        this.setSize(screenSize);
        this.setLocation((dimension.width-screenSize.width)/2,(dimension.height-screenSize.height)/2);
        addKeyListener(new KeyAdapter() {  // Esc'ye basınca pencere kapanması için.
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==27){
                    System.exit(0);
                }
            }
        });

    /*    btnCiz=new JButton("Çiz");
        btnCiz.setSize(80,20);
        btnCiz.setLocation(20,20);
        btnCiz.addActionListener((e) -> cizimYap(e));
        this.add(btnCiz);

        pervane1 = new Pervane();
        pervane1.setSize(53,53);
        pervane1.setLocation(20,50);
        this.add(pervane1);

        pervane2 = new Pervane();
        pervane2.setSize(100,100);
        pervane2.setLocation(120,120);
        this.add(pervane2); */

        initialize();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private boolean flag = false;

    private void cizimYap(ActionEvent e) {
        Graphics gr = this.getGraphics();

        flag=!flag;
        int kontrol = flag ? 0 : 1;

        int aci = 60;
        for (int i = 0; i < 360/aci ; i++) {
            if (i%2==kontrol){
                gr.setColor(Color.RED);
            }else{
                gr.setColor(Color.YELLOW);
            }
            gr.fillArc((getWidth()-200)/2,(getHeight()-200)/2,200,200,(i+1)*aci,aci);
        }
    }

    private Top top1;

    private void initialize() {
        // Top1 nesnesi
        for (int i = 0; i < 10; i++) {
            int x = ThreadLocalRandom.current().nextInt(0,getWidth());
            int y = ThreadLocalRandom.current().nextInt(0,getHeight());
            Top t = new Top();
            t.setLocation(x,y);
            add(t);
        }
    }
}
