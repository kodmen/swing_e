package org.yamanevler.BO10CheckBox.Odev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UyeGirisi implements ActionListener {
    JFrame frame;
    JTextField nameField;
    JPasswordField passwordField;
    JCheckBox checkBox;
    JButton button;

    public UyeGirisi() {
        frame = new JFrame("Üye Girişi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Kullanıcı Adı:");
        nameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Şifre:");
        passwordField = new JPasswordField(15);

        checkBox = new JCheckBox("Gizlilik politikasını kabul ediyorum");

        button = new JButton("Giriş Yap");
        button.addActionListener(this);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(checkBox);
        frame.add(button);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String password = new String(passwordField.getPassword());

        if (name.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Lütfen tüm alanları doldurun!", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (!checkBox.isSelected()) {
            JOptionPane.showMessageDialog(frame, "Gizlilik politikasını kabul etmelisiniz!", "Uyarı", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame, "Giriş Başarılı!\nHoşgeldiniz, " + name + "!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new UyeGirisi();
    }
}
