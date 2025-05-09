package org.yamanevler.B03JPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("like4.png");
        JLabel label = new JLabel();
        label.setText("Selam");
        label.setIcon(icon);
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(0,50,100,100);

        JPanel maviPanel = new JPanel();
        maviPanel.setBackground(Color.BLUE);
        maviPanel.setBounds(0,0,250,250);
        maviPanel.setLayout(null);

        JPanel kırmızıPanel = new JPanel();
        kırmızıPanel.setBackground(Color.red);
        kırmızıPanel.setBounds(250,0,250,250);
        kırmızıPanel.setLayout(null);

        JPanel yesilPanel = new JPanel();
        yesilPanel.setBackground(Color.GREEN);
        yesilPanel.setBounds(0,250,500,250);
        yesilPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        kırmızıPanel.add(label);
        frame.add(maviPanel);
        frame.add(kırmızıPanel);
        frame.add(yesilPanel);

        frame.setVisible(true);

    }
}
