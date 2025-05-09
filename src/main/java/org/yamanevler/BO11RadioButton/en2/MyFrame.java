package org.yamanevler.BO11RadioButton.en2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton kadin;
    JRadioButton erkek;

    ButtonGroup buttonGroup;

    public MyFrame(){
        kadin = new JRadioButton("Kadın");
        erkek = new JRadioButton("Erkek");

        buttonGroup = new ButtonGroup();
    }

    public void start(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(kadin);
        add(erkek);

        kadin.addActionListener(this);
        erkek.addActionListener(this);

        buttonGroup.add(kadin);
        buttonGroup.add(erkek);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == kadin){
            System.out.println("Kadın seçildi.");
        }else if(e.getSource() == erkek){
            System.out.println("Erkek seçildi.");
        }

    }
}
