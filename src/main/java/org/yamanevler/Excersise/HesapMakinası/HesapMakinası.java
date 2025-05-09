package org.yamanevler.Excersise.HesapMakinası;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class HesapMakinası implements ActionListener {

    JFrame frame;
    JLabel sayıEkranı;
    JPanel numaraPaneli;
    JPanel karakterPaneli;


    String[] sayılar = {"1","2","3","4","5","6","7","8","9","0"};
    String[] işlemler = {" + "," - "," * "," / "};

    List<JButton> sayıButonlar = new ArrayList<>();
    List<JButton> islemButonları = new ArrayList<>();

    JButton buttonSıfırla;
    JButton buttonHesapla;

    int sayı1;
    int sayı2;
    String islem;

    HesapMakinası(){

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,100));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        sayıEkranı = new JLabel();
        sayıEkranı.setFont(new Font(null,Font.PLAIN,50));
        sayıEkranı.setText("");

        panel.add(sayıEkranı);

        numaraPaneli = new JPanel();
        numaraPaneli.setPreferredSize(new Dimension(500,400));
        numaraPaneli.setBackground(Color.darkGray);
        numaraPaneli.setLayout(new GridLayout(4,4));

        karakterPaneli = new JPanel();
        karakterPaneli.setPreferredSize(new Dimension(125,400));
        karakterPaneli.setBackground(Color.darkGray);
        karakterPaneli.setLayout(new GridLayout(4,1));


       for(String sayı: sayılar){
           JButton button = new JButton(sayı);
           button.addActionListener(this);
           sayıButonlar.add(button);
       }

        for(String islem: işlemler){
            JButton button = new JButton(islem);
            button.addActionListener(this);
            islemButonları.add(button);
        }



        buttonSıfırla = new JButton("AC");
        buttonHesapla = new JButton("=");

        buttonSıfırla.addActionListener(this);
        buttonHesapla.addActionListener(this);

        for (JButton button: sayıButonlar){
            numaraPaneli.add(button);
        }

        for (JButton button: islemButonları){
            karakterPaneli.add(button);
        }


        numaraPaneli.add(buttonSıfırla);
        numaraPaneli.add(buttonHesapla);


        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setTitle("Hesap Makinası");
        frame.setLayout(new BorderLayout());

        frame.add(numaraPaneli,BorderLayout.CENTER);
        frame.add(panel,BorderLayout.NORTH);
        frame.add(karakterPaneli,BorderLayout.EAST);
        frame.setVisible(true);
    }

    public void labelDeğiştir(String yeniKarakter){
        String eskiText = sayıEkranı.getText();
        sayıEkranı.setText(eskiText + yeniKarakter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(JButton sayıButonu: sayıButonlar){
            if (e.getSource() == sayıButonu){
                 String buttonText = sayıButonu.getText();
                 labelDeğiştir(buttonText);
            }
        }

        for(JButton karakter:islemButonları ){
            if (e.getSource() == karakter){
                String buttonText = karakter.getText();
                labelDeğiştir(buttonText);
            }
        }

        if (e.getSource() == buttonSıfırla){
            sayıEkranı.setText("0");
        }
        if (e.getSource() == buttonHesapla){
            parcalarAyır();
        }

    }

    private void parcalarAyır(){
        String islem = sayıEkranı.getText();
        String[] parcalar = islem.split(" ");
        sayı1 = Integer.parseInt(parcalar[0]);
        sayı2 = Integer.parseInt(parcalar[2]);
        islem = parcalar[1];

        hesapla(sayı1,sayı2,islem);
    }

    private void hesapla(int s1, int s2, String islem){

        int sonuc = 0;

        switch (islem){
            case "+":
                sonuc = s1 +s2;
                break;
            case "-":
                sonuc = s1 - s2;
                break;
            case "*":
                sonuc = s1*s2;
                break;
            case "/":
                sonuc = s1 / s2;
                break;
            default:
                sonuc = 0;
                break;
        }
        sayıEkranı.setText(String.valueOf(sonuc));

    }


}
