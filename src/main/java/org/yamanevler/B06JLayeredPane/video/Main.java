package org.yamanevler.B06JLayeredPane.video;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JLabel yesilLabel = new JLabel();
        yesilLabel.setOpaque(true); // arka plan rengini göstermek için
        yesilLabel.setBackground(Color.green);
        yesilLabel.setBounds(50,50,200,200);

        JLabel kırmızıLabel = new JLabel();
        kırmızıLabel.setOpaque(true); // arka plan rengini göstermek için
        kırmızıLabel.setBackground(Color.red);
        kırmızıLabel.setBounds(100,100,200,200);

        JLabel maviLabel = new JLabel();
        maviLabel.setOpaque(true); // arka plan rengini göstermek için
        maviLabel.setBackground(Color.blue);
        maviLabel.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

//        layeredPane.add(yesilLabel,JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(kırmızıLabel,JLayeredPane.DRAG_LAYER);
//        layeredPane.add(maviLabel,JLayeredPane.MODAL_LAYER);

        layeredPane.add(yesilLabel,Integer.valueOf(6));
        layeredPane.add(kırmızıLabel,Integer.valueOf(3));
        layeredPane.add(maviLabel,Integer.valueOf(5));

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
