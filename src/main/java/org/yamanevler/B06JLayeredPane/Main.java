package org.yamanevler.B06JLayeredPane;

import javax.swing.*;
import java.awt.*;

/**
 * JLayeredPane popup mantığında çalışıyor ekranları hangisinin öne çıkarılacağına
 * karar vermeye yarıyor
 *
 * JLayeredPane Tanımlanması:
 * JLayeredPane ile bir katmanlı panel oluşturuluyor. Bu panel içinde, bileşenler katman numaralarına göre sıralanıyor.
 * setBounds() ile panelin boyutları ayarlanıyor.
 *
 * Oyun Geliştirme: Bileşenleri katmanlara ayırarak oyun öğeleri (örneğin, zemin, karakterler, efektler) yerleştirilebilir.
 * Karmaşık UI Tasarımı: Bir UI'da katmanlama gerektiren durumlar için kullanılabilir. Örneğin, arka plan, içerik ve üstteki araçlar.
 * Özel Animasyonlar: Birden fazla katmanda animasyonlar oluşturulabilir.
 *
 */
public class Main {
    public static void main(String[] args) {

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2,Integer.valueOf(2));
        layeredPane.add(label3,Integer.valueOf(1));

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
