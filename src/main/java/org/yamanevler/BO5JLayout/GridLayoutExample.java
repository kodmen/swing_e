package org.yamanevler.BO5JLayout;

import javax.swing.*;
import java.awt.*;

/**
 * GridLayout Nedir?
 * GridLayout, Swing bileşenlerini eşit boyutlu hücrelerden oluşan bir kare veya dikdörtgen ızgara düzenine yerleştirir.
 *
 * Özellikleri:
 * Her bileşen eşit boyuttadır.
 * Izgara satır ve sütun sayısı ile tanımlanır.
 * Bileşenler eklenme sırasına göre soldan sağa ve yukarıdan aşağıya dizilir.
 * Hücreler arasındaki yatay ve dikey boşluklar özelleştirilebilir.
 */
public class GridLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(6,1));// 9,1

        for (int i = 0; i < 6; i++) {
            frame.add(new JButton("*"));
        }


        frame.setVisible(true);
    }
}
/**
 * Uygulama Özellikleri
 * Ana Çerçeve (JFrame):
 *
 * Çerçeve boyutu 600x400 olacak.
 * BorderLayout kullanılarak bölgelere bölünecek.
 * Kuzey Bölgesi (North):
 *
 * FlowLayout ile bir panel.
 * İçinde "Renk Değiştirici" yazan bir JLabel olacak.
 * Batı Bölgesi (West):
 *
 * GridLayout ile 5 düğmeden oluşan bir panel.
 * Her düğme bir rengi temsil edecek (örneğin, kırmızı, mavi, yeşil, sarı, pembe).
 * Kullanıcı bir düğmeye tıkladığında, ana panelin (merkez) arka plan rengi değişecek.
 * Merkez Bölgesi (Center):
 *
 * İlk başta varsayılan bir arka plan rengine sahip boş bir panel.
 * Güney Bölgesi (South):
 *
 * Bir çıkış düğmesi olacak ve bu düğmeye tıklandığında uygulama kapanacak.
 */