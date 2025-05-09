package org.yamanevler.BO14ProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar progressBar= new JProgressBar();

    public ProgressBarDemo() {

        progressBar.setValue(0);        // Başlangıç değeri
        progressBar.setBounds(0,0,420,50);
        progressBar.setStringPainted(true);        // Değerin görünmesi sağlanıyor

        progressBar.setFont(new Font("MV Boli", Font.BOLD, 20));

        progressBar.setForeground(Color.red);        // Değerin rengini yeşil yapıyoruz
        progressBar.setBackground(Color.black);        // Arka plan rengini siyah yapıyoruz

        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 100;

//        while (counter <= 100) {
//           progressBar.setValue(counter);
//           try {
//               Thread.sleep(50);        // 100 ms bekle
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
//              counter+=1;
//        }

        while (0 < counter) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);        // 100 ms bekle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter-=1;
        }
        progressBar.setString("Done");
    }
}
