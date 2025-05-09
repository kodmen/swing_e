package org.yamanevler.BO14ProgressBar.En1;

import javax.swing.*;
import java.awt.*;

public class ProgressBarEn1 {

    JFrame frame;
    JProgressBar progressBar;

    public ProgressBarEn1(){
        frame = new JFrame("Progress Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setTitle("Progress Bar Example");
        

        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(0, 0, 400, 100);

        progressBar.setValue(50);
        progressBar.setBackground(Color.BLACK);
        progressBar.setForeground(Color.RED);

        progressBar.setStringPainted(true); // Değerin görünmesi sağlanıyor

        frame.add(progressBar);
        frame.setVisible(true);

        fill();
    }

    public void fill(){

        for (int i = 0; i < 100; i++) {
            progressBar.setValue(i);

            try {
                Thread.sleep(100); // 100 ms bekle
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        progressBar.setString("Done");

    }
}
