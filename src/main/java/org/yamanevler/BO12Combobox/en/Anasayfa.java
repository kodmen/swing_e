package org.yamanevler.BO12Combobox.en;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {

    JFrame frame;
    JComboBox comboBox;
    String[] diller = {"Java","Python","C++","C#","JavaScript"};

    public Anasayfa(){
        frame = new JFrame();
        comboBox = new JComboBox(diller);
    }

    public void start(){

        frame.add(comboBox);

        comboBox.addActionListener(this);

        frame.setLayout(new FlowLayout());
        frame.setSize(300,400);
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
