package org.yamanevler.BO12Combobox.en2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {

    JFrame frame;
    JComboBox comboBox;
    String[] items = {"Item 1", "Item 2", "Item 3"};

    public Anasayfa() {
        frame = new JFrame("Anasayfa");
        comboBox = new JComboBox(items);
    }

    public void start(){

        comboBox.addActionListener(this);

        frame.add(comboBox);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
