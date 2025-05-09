package org.yamanevler.BO5JLayout.Video;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));// tercih edilen boyut
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));// varsayılan değeri CENTER= ORTA

        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(250,250));// tercih edilen boyut
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));// varsayılan değeri CENTER= ORTA


        frame.add(panel);
        frame.add(panel2);
        frame.setVisible(true);


    }
}
