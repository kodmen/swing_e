package org.yamanevler.BO14ProgressBar.En2;

import javax.swing.*;
import java.awt.*;

public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar progressBar= new JProgressBar();

    public ProgressBar(){

        progressBar.setValue(0);        // Başlangıç değeri
        progressBar.setBounds(0,0,420,50);
        progressBar.setStringPainted(true);        // Değerin görünmesi sağlanıyor

        progressBar.setForeground(Color.red);        // Değerin rengini yeşil yapıyoruz
        progressBar.setBackground(Color.black);

        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();

    }

    public void fill(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            progressBar.setValue(i);
        }

        progressBar.setString("Bitti");
    }

}
