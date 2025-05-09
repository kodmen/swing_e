package org.yamanevler.BO4JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SayıEkranı extends JFrame implements ActionListener {

    JLabel label;
    JButton button1;
    JButton button2;
    JButton button3;

    SayıEkranı(){
        setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        label= new JLabel();
        label.setText("0");
        label.setBounds(200,100,100,150);
        label.setBackground(Color.red);

        button1= new JButton();
        button1.setText("10");
        button1.setBounds(150,200,100,100);
        button1.addActionListener(this);


        button2 = new JButton();
        button2.setText("20");
        button2.setBounds(300,200,100,100);
        button2.addActionListener(this);


        button3 = new JButton();
        button3.setText("30");
        button3.setBounds(450,200,100,100);
        button3.addActionListener(this);

        this.add(label);
        this.add(button1);
        this.add(button2);
        this.add(button3);

        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            label.setText("10");
        }

        if (e.getSource() == button2){
            label.setText("20");
        }

        if (e.getSource() == button3){
            label.setText("30");
        }
    }
}
