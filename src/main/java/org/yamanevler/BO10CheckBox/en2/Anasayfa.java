package org.yamanevler.BO10CheckBox.en2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {

    JFrame frame;
    JCheckBox checkBox;
    JButton button;

    public Anasayfa() {
        frame = new JFrame();
        checkBox = new JCheckBox();
        button = new JButton("Kaydet");
    }

    public void baslat(){
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkBox.setText("Kullanım Koşullarını Kabul Ediyorum");

        button.addActionListener(this);
        //button.setEnabled(false);

        frame.add(checkBox);
        frame.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            if (checkBox.isSelected()){
                System.out.println("Kabul edildi.");
            }else {
                System.out.println("Kabul edilmedi.");
            }
        }
    }
}
