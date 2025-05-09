package org.yamanevler.Excersise;

import javax.swing.*;
import java.awt.*;

public class ImageResizeExample {
    public static void main(String[] args) {
        // JFrame oluştur
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        // Orijinal resmi ImageIcon ile yükle
        ImageIcon originalIcon = new ImageIcon("şaşkın.png");

        // Resmi yeniden boyutlandır
        Image scaledImage = originalIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);

        // JLabel'e yeniden boyutlandırılmış resmi ekle
        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(50, 50, 200, 200); // JLabel boyutları resimle aynı
        frame.add(imageLabel);

        // JFrame'i görünür yap
        frame.setVisible(true);
    }
}
