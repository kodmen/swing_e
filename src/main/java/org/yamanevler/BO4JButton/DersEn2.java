package org.yamanevler.BO4JButton;


import javax.swing.*;
import java.awt.*;

public class DersEn2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel sayıEkranı = new JLabel();
        sayıEkranı.setText("0");
        sayıEkranı.setBounds(200,100,100,150);
        sayıEkranı.setBackground(Color.red);

        JButton buton10 = new JButton();
        buton10.setText("10");
        buton10.setBounds(150,200,100,100);
        buton10.addActionListener(e -> {
            sayıEkranı.setText("10");
        });

        JButton buton20 = new JButton();
        buton20.setText("20");
        buton20.setBounds(300,200,100,100);
        buton20.addActionListener(e -> {
            sayıEkranı.setText("20");
        });

        JButton buton30 = new JButton();
        buton30.setText("30");
        buton30.setBounds(450,200,100,100);
        buton30.addActionListener(e -> {
            sayıEkranı.setText("30");
        });

        frame.add(sayıEkranı);
        frame.add(buton10);
        frame.add(buton20);
        frame.add(buton30);
        frame.setVisible(true);
    }
}
