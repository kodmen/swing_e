package org.yamanevler.BO9TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KullaniciAdiGirisi implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton button;

    public KullaniciAdiGirisi() {
        frame = new JFrame("Kullanıcı Adı Girişi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 40));
        textField.setFont(new Font("Arial", Font.PLAIN, 20));

        button = new JButton("Kaydet");
        button.addActionListener(this);

        frame.add(new JLabel("Adınızı giriniz:"));
        frame.add(textField);
        frame.add(button);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String ad = textField.getText().trim();// trim() metodu baştaki ve sondaki boşlukları siler.
            if (ad.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen adınızı giriniz!", "Uyarı", JOptionPane.WARNING_MESSAGE);
            } else {
                System.out.println("Kullanıcı adı: " + ad);
                JOptionPane.showMessageDialog(null, "Adınız başarıyla kaydedildi!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                textField.setEditable(false);
            }
        }
    }

    public static void main(String[] args) {
        new KullaniciAdiGirisi();
    }
}
