package org.yamanevler.Excersise;

import javax.swing.*;
import java.awt.*;

public class CVAppUygulama {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                JPanel panel = new JPanel();
                panel.setBounds(i*100,j*100,100,100);
                panel.setBackground(new Color(i*40,j*20,i*40) );
                frame.add(panel);
            }
        }



        frame.setVisible(true);
    }
}
