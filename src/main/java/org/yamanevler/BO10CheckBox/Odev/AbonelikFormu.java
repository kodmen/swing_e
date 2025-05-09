package org.yamanevler.BO10CheckBox.Odev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbonelikFormu implements ActionListener {
    JFrame frame;
    JTextField emailField;
    JCheckBox checkBox;
    JButton button;

    public AbonelikFormu() {
        frame = new JFrame("E-posta Abonelik Formu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel emailLabel = new JLabel("E-posta adresiniz:");
        emailField = new JTextField(20);

        checkBox = new JCheckBox("Kampanyalardan haberdar olmak istiyorum");

        button = new JButton("Kaydol");
        button.addActionListener(this);

        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(checkBox);
        frame.add(button);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email = emailField.getText();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Lütfen e-posta adresinizi girin!", "Hata", JOptionPane.ERROR_MESSAGE);
        } else {
            String mesaj = "E-posta: " + email + "\n";
            mesaj += checkBox.isSelected() ? "Kampanyalara abone oldunuz." : "Kampanya bildirimi istemiyorsunuz.";
            JOptionPane.showMessageDialog(frame, mesaj, "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new AbonelikFormu();
    }
}

