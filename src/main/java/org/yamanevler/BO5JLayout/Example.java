package org.yamanevler.BO5JLayout;

import javax.swing.*;
import java.awt.*;

public class Example {
    public static void main(String[] args) {


                // Ana çerçeve
                JFrame frame = new JFrame("Renk Değiştirici");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 400);
                frame.setLayout(new BorderLayout());

                // Kuzey bölgesi: Başlık
                JPanel northPanel = new JPanel(new FlowLayout());
                JLabel title = new JLabel("Renk Değiştirici");
                title.setFont(new Font("Arial", Font.BOLD, 18));
                northPanel.add(title);
                frame.add(northPanel, java.awt.BorderLayout.NORTH);

                // Batı bölgesi: Renk düğmeleri
                JPanel westPanel = new JPanel(new GridLayout(5, 1, 5, 5));
                JButton redButton = new JButton("Kırmızı");
                JButton blueButton = new JButton("Mavi");
                JButton greenButton = new JButton("Yeşil");
                JButton yellowButton = new JButton("Sarı");
                JButton pinkButton = new JButton("Pembe");

                westPanel.add(redButton);
                westPanel.add(blueButton);
                westPanel.add(greenButton);
                westPanel.add(yellowButton);
                westPanel.add(pinkButton);
                frame.add(westPanel, java.awt.BorderLayout.WEST);

                // Merkez bölgesi: Arka plan
                JPanel centerPanel = new JPanel();
                centerPanel.setBackground(Color.LIGHT_GRAY);
                frame.add(centerPanel, java.awt.BorderLayout.CENTER);

                // Güney bölgesi: Çıkış düğmesi
                JPanel southPanel = new JPanel(new FlowLayout());
                JButton exitButton = new JButton("Çıkış");
                southPanel.add(exitButton);
                frame.add(southPanel, java.awt.BorderLayout.SOUTH);

                // ActionListeners for renk düğmeleri
                redButton.addActionListener(e -> centerPanel.setBackground(Color.RED));
                blueButton.addActionListener(e -> centerPanel.setBackground(Color.BLUE));
                greenButton.addActionListener(e -> centerPanel.setBackground(Color.GREEN));
                yellowButton.addActionListener(e -> centerPanel.setBackground(Color.YELLOW));
                pinkButton.addActionListener(e -> centerPanel.setBackground(Color.PINK));

                // Çıkış düğmesi
                exitButton.addActionListener(e -> System.exit(0));

                // Görünürlük
                frame.setVisible(true);
    }
}
