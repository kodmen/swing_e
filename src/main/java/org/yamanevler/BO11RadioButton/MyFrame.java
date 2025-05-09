package org.yamanevler.BO11RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    //ImageIcon pizzaIcon = new ImageIcon("src/main/java/org/yamanevler/BO11RadioButton/pizza.png");
// böyle icon verebiliriz.

    public MyFrame() {
        setTitle("Radio Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         pizzaButton = new JRadioButton("Pizza");
         hamburgerButton = new JRadioButton("Hamburger");
         hotdogButton = new JRadioButton("Hotdog");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizzaButton);
        buttonGroup.add(hamburgerButton);
        buttonGroup.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        //pizzaButton.setIcon();

        add(pizzaButton);
        add(hamburgerButton);
        add(hotdogButton);

        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton){
            System.out.println("Pizza seçildi.");
        }else if(e.getSource() == hamburgerButton){
            System.out.println("hamburger seçildi.");
        }else if (e.getSource() == hotdogButton){
            System.out.println("hotdog seçildi.");
        }
    }
}
