package org.yamanevler.Excersise;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class En2Excercis {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        En2Excercis renk = new En2Excercis();

        for (int y = 0; y < 100; y++) {
            for (int x = 0; x < 100; x++) {
                JPanel panel = new JPanel();
                panel.setBackground(renk.rastgeleColor());//0,255
                panel.setBounds(x*10,y*10,10,10);
                frame.add(panel);
                System.out.println(x+"-"+y);
            }
        }


        frame.setVisible(true);

    }

    public Color rastgeleColor(){
        Random random = new Random();
        return  new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
    }
}
