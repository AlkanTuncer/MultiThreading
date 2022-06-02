package day065.task4_COPY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class XCopy extends JFrame {

    private JButton dosyaSec , copyBtn;
    private File[] secilenDosyalar;
    private JTextArea files;
    private JTextField pathTarget;
    private Label lblTarget;


    public XCopy() throws HeadlessException{
        super("X-Copy");
        setLayout(null);
        setSize(480,240);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width-getWidth())/2;
        int y = (screenSize.height-getHeight())/2;
        setLocation(x,y);
        initialize();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initialize() {
        // Dosya Seç Butonu
        dosyaSec = new JButton("Dosya Seç");
        dosyaSec.setSize(120,30);
        dosyaSec.setLocation(10,10);
        dosyaSec.addActionListener((e)-> secimYap(e) );
        this.add(dosyaSec);

        // Dosya Listesi
        files = new JTextArea();
        files.setSize(200,150);
        files.setLocation(10,50);
        files.setEditable(false);
        this.add(files);

        // Target Etiketi
        lblTarget = new Label("Hedef Klasör : ");
        lblTarget.setSize(100,30);
        lblTarget.setLocation(140,10);
        this.add(lblTarget);

        // Target Path
        pathTarget = new JTextField();
        pathTarget.setSize(100,30);
        pathTarget.setLocation(250,10);
        this.add(pathTarget);

        // Copy Button
        copyBtn = new JButton("Kopyala");
        copyBtn.setSize(100,30);
        copyBtn.setLocation(360,10);
        copyBtn.addActionListener(e-> kopyala(e));
        this.add(copyBtn);

    }

    private void kopyala(ActionEvent e) {
        for (var item : secilenDosyalar){
            new FileCopy(item.getAbsolutePath(),pathTarget.getText()+"/"+item.getName());
        }
    }

    private void secimYap(ActionEvent e) {
        JFileChooser sec = new JFileChooser(new File("source"));
        sec.setMultiSelectionEnabled(true);
        if (sec.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            //JOptionPane.showMessageDialog(this,"Dosya seçildi.");
            secilenDosyalar = sec.getSelectedFiles();
            files.setText("");
            for (int i = 0; i < secilenDosyalar.length; i++) {
                files.append("["+(i+1)+"]"+secilenDosyalar[i].getName()+"\n");
            }
        }
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(XCopy::new);

    }

}
