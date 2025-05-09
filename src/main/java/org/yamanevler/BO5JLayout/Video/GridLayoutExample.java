package org.yamanevler.BO5JLayout.Video;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,5));

        for (int i = 0; i < 25; i++) {
            frame.add(new JButton(String.valueOf(i+1)));
        }

        frame.setVisible(true);
    }
}
