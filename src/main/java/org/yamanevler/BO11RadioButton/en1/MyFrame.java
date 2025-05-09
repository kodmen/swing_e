package org.yamanevler.BO11RadioButton.en1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton hamurger;
    JRadioButton burger;
    JRadioButton hotdog;

    ButtonGroup buttonGroup;

    public MyFrame(){
        hamurger = new JRadioButton("Hamburger");
        burger = new JRadioButton("Burger");
        hotdog = new JRadioButton("Hotdog");

        buttonGroup = new ButtonGroup();

    }

    public void start(){

        add(hamurger);
        add(burger);
        add(hotdog);

        buttonGroup.add(hamurger);
        buttonGroup.add(burger);
        buttonGroup.add(hotdog);

        hamurger.addActionListener(this);
        burger.addActionListener(this);
        hotdog.addActionListener(this);

        setTitle("Radio Button");
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hamurger){
            System.out.println("Hamburger seçildi.");
        }else if (e.getSource() == burger){
            System.out.println("Burger seçildi.");
        }else if (e.getSource() == hotdog){
            System.out.println("Hotdog seçildi.");
        }
    }
}
