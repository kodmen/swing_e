package org.yamanevler.B01Jframe;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes heres"); // başlık belirtme
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // uygulamadan çıkınca uygulamayı bitirmeye yarıyor
        this.setResizable(false);
        this.setSize(420,420); // boyut ayarlama, x-boyut, y-boyut
        this.setVisible(true); // ekranı görünür yapma

        ImageIcon image = new ImageIcon("logo.png");// resim iconu oluşturma
        this.setIconImage(image.getImage()); // ekranın icon değiştirme
        this.getContentPane().setBackground(new Color(0,0,255)); // arka plan resmini değiştirme

    }
}
