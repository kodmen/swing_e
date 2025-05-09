package org.yamanevler.BO4JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZikirMatik extends JFrame implements ActionListener {

    private int sayac;
    JLabel baslik;
    JLabel sayıEkranı;
    JButton arttır;
    JButton azalt;
    JButton sıfırla;

    ZikirMatik(){
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        this.setTitle("Zikir Matik");

        sayac = 0;

        baslik = new JLabel();
        baslik.setText("Zikir matik");
        baslik.setFont(new Font("Arial",Font.BOLD,30));
        baslik.setBounds(140,50,250,150);

        sayıEkranı = new JLabel();
        sayıEkranı.setText(String.valueOf(sayac));
        sayıEkranı.setFont(new Font("Arial",Font.BOLD,50));
        sayıEkranı.setBounds(250,150,100,100);

        arttır = new JButton();
        azalt = new JButton();
        sıfırla = new JButton();

        arttır.setText("Arttır");
        azalt.setText("azalt");
        sıfırla.setText("sıfırla");

        arttır.setBounds(100,350,400,100);
        azalt.setBounds(100,450,200,100);
        sıfırla.setBounds(300,450,200,100);

        arttır.addActionListener(this);
        azalt.addActionListener(this);
        sıfırla.addActionListener(this);



        this.add(arttır);
        this.add(azalt);
        this.add(sıfırla);
        this.add(sayıEkranı);
        this.add(baslik);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == arttır){
            sayac++;
            sayıEkranı.setText(String.valueOf(sayac));
        }

        if (e.getSource() == azalt){
            sayac--;
            sayıEkranı.setText(String.valueOf(sayac));
        }

        if (e.getSource() == sıfırla){
            sayac = 0;
            sayıEkranı.setText(String.valueOf(sayac));
        }
    }
}
