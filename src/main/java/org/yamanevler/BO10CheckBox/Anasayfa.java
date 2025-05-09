package org.yamanevler.BO10CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JCheckBox, kullanıcının bir seçeneği işaretleyip işaretlememesine olanak tanıyan bir bileşendir.
 * isSelected() metodu ile checkbox’ın seçili olup olmadığı kontrol edilir. Bu örnekte, bir "Kabul ediyorum"
 * checkbox’ı ve "Kaydet" butonu bulunmaktadır. Butona basıldığında, checkbox’ın işaretli olup olmadığı
 * kontrol edilir ve uygun mesaj ekrana yazdırılır.
 */
public class Anasayfa implements ActionListener {

    JFrame frame;
    JCheckBox checkBox;
    JButton button;


    public Anasayfa() {
        frame = new JFrame("CheckBox Kullanımı");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        checkBox = new JCheckBox("Kabul ediyorum");
        checkBox.setFont(new Font("Arial", Font.PLAIN, 20));

        button = new JButton("Kaydet");
        button.addActionListener(this);

        frame.add(checkBox);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (checkBox.isSelected()) {
                System.out.println("Kabul edildi.");
            } else {
                System.out.println("Kabul edilmedi.");
            }
        }
    }
}
