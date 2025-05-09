package org.yamanevler.BO5JLayout;

import javax.swing.*;
import java.awt.*;

/**
 * BorderLayout konusu, Swing kütüphanesindeki en yaygın kullanılan layout türlerinden biridir.
 * BorderLayout, bir pencereyi beş ana bölgeye ayırarak bileşenleri bu bölgelere yerleştirmenizi
 * sağlar. güzel bir örneği.
 *
 * BorderLayout Nedir?
 * BorderLayout, pencereyi beş bölgeye ayıran bir düzenleme yöneticisidir:
 *
 * NORTH: Üst bölge
 * SOUTH: Alt bölge
 * WEST: Sol bölge
 * EAST: Sağ bölge
 * CENTER: Orta bölge (En büyük alan)
 * Özellikleri:
 *
 * Bir bölgeye yalnızca bir bileşen eklenebilir.
 * CENTER dışındaki diğer bölgeler sabit boyutludur, CENTER ise kalan alanı kaplar.
 * Eklediğiniz bileşenlerin sıralaması önemlidir; her bölge yalnızca bir bileşeni barındırır.
 *
 * Anlatım Akışı
 * BorderLayout'u Tanıtın:
 *
 * Neden layout yöneticisi kullanıyoruz?
 * BorderLayout’un beş ana bölgesi ve bu bölgelerin temel özelliklerini açıklayın.
 * Kod Üzerinde Giderek Her Bölgeyi Gösterin:
 *
 * Önce panel1, panel2, panel3, panel4 ve panel5’i gösterin.
 * Her birinin rengini ve boyut ayarını neden yaptığınızı açıklayın.
 * Panel İçinde Panel Kullanımı:
 *
 * Panel5 içine eklenen subpanellerin, bir panelin daha fazla bölünmesine nasıl olanak sağladığını açıklayın.
 * Subpanel kullanımının daha karmaşık düzenler için faydalı olduğunu vurgulayın.
 */
public class BorderLayoutExample {
    public static void main(String[] args) {
        // Border Layout: kuzey güney, batı doğu,orta

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10));//BorderLayout kullanılıyor ve yatay/dikey boşluklar 10 piksel olarak belirleniyor.

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));//setPreferredSize ile sabit boyutlar atanmış.
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));


        //------------- subPanels----------

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);


        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);


        frame.setVisible(true);


    }
}
