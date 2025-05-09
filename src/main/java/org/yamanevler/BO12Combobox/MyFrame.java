package org.yamanevler.BO12Combobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    public MyFrame() {
        setTitle("Combobox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"Seçiniz", "Java", "Python", "C++", "C#"};
        comboBox = new JComboBox(items);
        comboBox.addActionListener(this);

//        comboBox.setEditable(true);
//        comboBox.getItemCount();
//        comboBox.addItem("JavaScript");
//        comboBox.insertItemAt("HTML", 1);
//        comboBox.setSelectedIndex(1);
//        comboBox.removeItem("C++");
//        comboBox.removeItemAt(2);
//        comboBox.removeAllItems();


        add(comboBox);
        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
