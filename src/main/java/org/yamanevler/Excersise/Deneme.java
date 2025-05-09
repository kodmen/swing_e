package org.yamanevler.Excersise;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Deneme {
    public static void main(String[] args) {

        List<JPanel> boxes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                JPanel panel = new JPanel();
                panel.setBackground(new Color(i*20,j*20,0));
                panel.setBounds(i*50,j*50,50,50);
                boxes.add(panel);
            }
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        for(JPanel panel:boxes)
            frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
