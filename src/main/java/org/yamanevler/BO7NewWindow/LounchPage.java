package org.yamanevler.BO7NewWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * bir butona tıklandığında yeni bir pencere açan bir uygulamayı temsil eder
 */
public class LounchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Clik me");

    LounchPage(){

        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            frame.dispose();// bu frame kaldırır,
            NewWindow myWindow = new NewWindow();
        }
    }
}
