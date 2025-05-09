package org.yamanevler.B02Label.video;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("code.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);

        JLabel label = new JLabel();
        label.setText("Selam dostum hiç kod yazdın mı?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//yatay poziyonu düzenleme
        label.setVerticalTextPosition(JLabel.TOP);// dikey pozisyon
        label.setForeground(Color.green); // yazının rengini değiştirme
        label.setFont(new Font("Courier",Font.PLAIN,25)); // yazının fornt değiştirme
        label.setIconTextGap(-40); // yazıl ile resim arasını mesafe
        label.setBackground(Color.BLACK); // arkaplan rengi tanımlama
        label.setOpaque(true); // arkaplan rengi gösterme
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,50,500,500);


        JFrame ekran = new JFrame();
        ekran.setVisible(true);
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ekran.setLayout(null);
        ekran.add(label);


    }
}
