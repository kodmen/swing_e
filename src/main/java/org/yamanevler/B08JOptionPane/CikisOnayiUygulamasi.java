package org.yamanevler.B08JOptionPane;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CikisOnayiUygulamasi extends JFrame {
    public CikisOnayiUygulamasi() {
        setTitle("Çıkış Onayı");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton cikisButonu = new JButton("Çıkış");
        cikisButonu.setBounds(100, 70, 100, 30);

        cikisButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sonuc = JOptionPane.showConfirmDialog(
                        null,
                        "Çıkmak istediğinize emin misiniz?",
                        "Çıkış Onayı",
                        JOptionPane.YES_NO_OPTION
                );

                if (sonuc == JOptionPane.YES_OPTION) {
                    System.exit(0); // Programı kapat
                }
            }
        });

        add(cikisButonu);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CikisOnayiUygulamasi();
    }
}

