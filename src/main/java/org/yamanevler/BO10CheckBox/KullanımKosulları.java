package org.yamanevler.BO10CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KullanımKosulları implements ActionListener {

    JFrame frame;
    JCheckBox checkBox;
    JButton button;

    public KullanımKosulları() {
        frame = new JFrame("Kullanım Koşulları");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        checkBox = new JCheckBox("Kullanım koşullarını kabul ediyorum");
        checkBox.setFont(new Font("Arial", Font.PLAIN, 15));
        checkBox.addActionListener(this);

        button = new JButton("Devam Et");
        button.setEnabled(false); // Başlangıçta devre dışı

        button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Onaylandı, devam edebilirsiniz!", "Bilgi", JOptionPane.INFORMATION_MESSAGE));

        frame.add(checkBox);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(checkBox.isSelected()); // Checkbox işaretliyse buton aktif olur
    }

    public static void main(String[] args) {
        new KullanımKosulları();
    }
}