package org.yamanevler.BO5JLayout;

import javax.swing.*;
import java.awt.*;

/**
 * FlowLayout Nedir?
 * FlowLayout, Swing'de kullanılan bir layout yöneticisi olup bileşenleri ekleme sırasına
 * göre yan yana veya alt alta düzenler.
 *
 * Bileşenlerin varsayılan boyutlarını korumasına izin verir ve bileşenler yatay olarak
 * sıralandığında panelin genişliğini aşarsa, otomatik olarak bir sonraki satıra geçer.
 *
 * Özellikleri:
 * Varsayılan olarak bileşenleri soldan sağa hizalar.
 * Yatay (x ekseni) ve dikey (y ekseni) boşluk ayarları yapılabilir.
 * Pencere boyutu değiştirildiğinde bileşenlerin düzeni buna göre yeniden ayarlanır.
 *
 * Uygulama ve Ödev Önerisi:
 *
 * Öğrencilerden FlowLayout kullanarak bir "hesap makinesi arayüzü" veya
 * "renk seçim arayüzü" oluşturmalarını isteyin.
 */
public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLayout(new java.awt.FlowLayout(FlowLayout.CENTER,10,10));
        //FlowLayout.CENTER: Tüm bileşenler yatayda ortalanıyor.
        //10, 10: Yatay ve dikey boşluklar 10 piksel olarak ayarlanmış.

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));// setPreferredSize tercih edilen boyut
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());
        //JPanel’in içindeki bileşenlerin de FlowLayout ile düzenleneceğini belirtir.

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));


        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(250,250));// setPreferredSize tercih edilen boyut
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setLayout(new FlowLayout());
        //JPanel’in içindeki bileşenlerin de FlowLayout ile düzenleneceğini belirtir.

        panel2.add(new JButton("1"));
        panel2.add(new JButton("2"));
        panel2.add(new JButton("3"));
        panel2.add(new JButton("4"));
        panel2.add(new JButton("5"));
        panel2.add(new JButton("6"));
        panel2.add(new JButton("7"));
        panel2.add(new JButton("8"));
        panel2.add(new JButton("9"));

        frame.add(panel);
        frame.add(panel2);
        frame.setVisible(true);
    }
}
