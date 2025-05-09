package org.yamanevler.Excersise;

import javax.swing.*;
import java.awt.*;

public class CVApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CV Uygulaması");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        frame.setLayout(null);

        // Üst Panel
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.LIGHT_GRAY);
        topPanel.setBounds(0, 0, 500, 200);
        topPanel.setLayout(new BorderLayout());

        JLabel nameLabel = new JLabel("Ad Soyad: Bedirhan Ergün", JLabel.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        ImageIcon profilePicture = new ImageIcon("like4.png");
        JLabel profileLabel = new JLabel(profilePicture, JLabel.CENTER);

        topPanel.add(profileLabel, BorderLayout.WEST);
        topPanel.add(nameLabel, BorderLayout.CENTER);

        // Orta Panel
        JPanel middlePanel = new JPanel();
        middlePanel.setBackground(Color.WHITE);
        middlePanel.setBounds(0, 200, 500, 300);
        middlePanel.setLayout(new GridLayout(2, 1));

        JLabel educationLabel = new JLabel("Eğitim: Sakarya Üniversitesi - Bilgisayar Mühendisliği");
        JLabel experienceLabel = new JLabel("İş Deneyimi: Huawei - Yazılım Geliştirici");
        middlePanel.add(educationLabel);
        middlePanel.add(experienceLabel);

        // Alt Panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.CYAN);
        bottomPanel.setBounds(0, 500, 500, 200);
        bottomPanel.setLayout(new GridLayout(2, 1));

        JLabel hobbiesLabel = new JLabel("Hobiler: Kitap Okuma, Yüzme, Kodlama");
        JLabel contactLabel = new JLabel("İletişim: bedirhan@gmail.com, 555-123-4567");
        bottomPanel.add(hobbiesLabel);
        bottomPanel.add(contactLabel);

        // Panelleri Frame'e Ekle
        frame.add(topPanel);
        frame.add(middlePanel);
        frame.add(bottomPanel);

        frame.setVisible(true);
    }
}
