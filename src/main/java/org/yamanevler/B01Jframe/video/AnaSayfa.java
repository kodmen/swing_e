package org.yamanevler.B01Jframe.video;

import javax.swing.*;
import java.awt.*;

public class AnaSayfa extends JFrame {// jframe değerlerini kopyalama

    public AnaSayfa(){
        this.setVisible(true); // ekranın gözükmesi ayarı
        this.setSize(420,420);// ekranın boyutu ayarlama
        this.setTitle("Uygulama ekranı"); // uygulama başlığı ayarlama
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// uygulama çıkıldığında kapansın
        this.setResizable(false);// boyutu değiştirme ayarı

        ImageIcon icon = new ImageIcon("logo.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(230, 255, 0));
    }
}
