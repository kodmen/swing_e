package org.yamanevler.BO5JLayout.Video;

import javax.swing.*;
import java.awt.*;

public class Ornek {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Renk Değiştirici");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLayout(new BorderLayout());

        JPanel kuzeyPanel = new JPanel();
        kuzeyPanel.setLayout(new FlowLayout());

        JLabel titel = new JLabel("Renk Değiştirici");
        titel.setFont(new Font("Arial",Font.BOLD,18));
        kuzeyPanel.add(titel);

        frame.add(kuzeyPanel,BorderLayout.NORTH);

        JPanel batıPanel = new JPanel();
        batıPanel.setLayout(new GridLayout(5,1,5,5));
        JButton kırmızıButon = new JButton("Kırmızı");
        JButton maviButon = new JButton("Mavi");
        JButton yesilButon = new JButton("Yeşil");
        JButton sarıButon = new JButton("Sarı");
        JButton pembeButon = new JButton("Pembe");

        batıPanel.add(kırmızıButon);
        batıPanel.add(maviButon);
        batıPanel.add(yesilButon);
        batıPanel.add(sarıButon);
        batıPanel.add(pembeButon);
        frame.add(batıPanel,BorderLayout.WEST);

        JPanel ortaPanel = new JPanel();
        ortaPanel.setBackground(Color.LIGHT_GRAY);
        frame.add(ortaPanel,BorderLayout.CENTER);

        JPanel guneyPanel = new JPanel();
        guneyPanel.setLayout(new FlowLayout());
        JButton cıkışButon= new JButton("Çıkış");
        guneyPanel.add(cıkışButon);
        frame.add(guneyPanel,BorderLayout.SOUTH);

        kırmızıButon.addActionListener(e -> {
            ortaPanel.setBackground(Color.red);
        });
        maviButon.addActionListener(e -> ortaPanel.setBackground(Color.BLUE));
        yesilButon.addActionListener(e -> ortaPanel.setBackground(Color.GREEN));
        sarıButon.addActionListener(e -> ortaPanel.setBackground(Color.YELLOW));
        pembeButon.addActionListener(e -> ortaPanel.setBackground(Color.PINK));

        cıkışButon.addActionListener(e -> System.exit(0));

        frame.setVisible(true);

    }
}
