package org.yamanevler.B02Label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    // JLabel = ekrana yazı resim göstermeye yarıyor

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("code.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);

        JLabel label = new JLabel();
        label.setText("Selam dostum kod yazdın mı?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);// LEFT,CENTER,RİGHT VEREBİLİRSİN
        label.setVerticalTextPosition(JLabel.TOP);// TOP,CENTER,BOTTOM
        label.setForeground(Color.green);// yazı rengi
        label.setFont(new Font("Courier",Font.PLAIN,50));
        label.setIconTextGap(-25);// icon ve text arasındaki mesafe
        label.setBackground(Color.BLACK);
        label.setOpaque(true);// background color ayarlama
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // icon+image position
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,100,600,600);//set x,y position

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700,700);
        //frame.setLayout(null);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);

    }
}
