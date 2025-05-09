package org.yamanevler.Excersise.HesapMakinasıEn2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class HesapMakinası implements ActionListener {

    public JFrame frame;
    public JPanel ekranPaneli;
    public JPanel işlemPaneli;
    public JPanel sayıPaneli;

    public JLabel ekranLabel;

    private String[] sayılar = {"1","2","3","4","5","6","7","8","9","0"};
    private String[] işlemler = {" + "," - "," / "," * "};

    private List<JButton> sayıButonları;
    private List<JButton> işlemButonları;

    JButton hesaplaButon;
    JButton sıflarButon;

    HesapMakinası(){
        frame = new JFrame();
        frame.setSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setTitle("Hesap Makinası");

        ekranPaneli = new JPanel();
        işlemPaneli = new JPanel();
        sayıPaneli = new JPanel();

        ekranPaneli.setPreferredSize(new Dimension(500,100));
        işlemPaneli.setPreferredSize(new Dimension(100,400));
        sayıPaneli.setPreferredSize(new Dimension(400,400));

        ekranPaneli.setBackground(Color.LIGHT_GRAY);
        işlemPaneli.setBackground(Color.red);
        sayıPaneli.setBackground(Color.yellow);

        ekranPaneli.setLayout(new FlowLayout(FlowLayout.RIGHT));
        ekranLabel = new JLabel();
        ekranLabel.setText("");
        ekranLabel.setFont(new Font("Arial",Font.PLAIN,50));

        ekranPaneli.add(ekranLabel);

        işlemPaneli.setLayout(new GridLayout(4,1));

        işlemButonları = new ArrayList<>();
        sayıButonları = new ArrayList<>();

        for (String işlem: işlemler){
            JButton button = new JButton();
            button.setText(işlem);
            button.addActionListener(this);
            işlemButonları.add(button);
            işlemPaneli.add(button);
        }

        sayıPaneli.setLayout(new GridLayout(4,3));

        for (String sayı: sayılar){
            JButton button = new JButton();
            button.setText(sayı);
            button.addActionListener(this);
            sayıButonları.add(button);
            sayıPaneli.add(button);
        }

        hesaplaButon = new JButton("=");
        sıflarButon = new JButton("AC");

        sıflarButon.addActionListener(this);
        hesaplaButon.addActionListener(this);

        sayıPaneli.add(sıflarButon);
        sayıPaneli.add(hesaplaButon);

        frame.add(ekranPaneli,BorderLayout.NORTH);
        frame.add(işlemPaneli,BorderLayout.EAST);
        frame.add(sayıPaneli,BorderLayout.CENTER);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (JButton button : sayıButonları){
            if (e.getSource() == button){
                String text = button.getText();
                labelDeğiştir(text);
            }
        }

        for (JButton button : işlemButonları){
            if (e.getSource() == button){
                String text = button.getText();
                labelDeğiştir(text);
            }
        }

        if (e.getSource() == sıflarButon){
            ekranLabel.setText("0");
        }

        if (e.getSource() == hesaplaButon){
            hesapla();
        }
    }

    private void labelDeğiştir(String yeniKarakter){
        String eskiYazı = ekranLabel.getText();
        ekranLabel.setText(eskiYazı+yeniKarakter);
    }

    public void hesapla(){
        String label = ekranLabel.getText();

        String[] parcalar = label.split(" ");
        int sayı1 = Integer.parseInt(parcalar[0]);
        int sayı2 = Integer.parseInt(parcalar[2]);

        String işlem = parcalar[1];
        int sonuc = 0;

        switch (işlem){
            case "+":
                sonuc = sayı1+sayı2;
                break;
            case "-":
                sonuc = sayı1-sayı2;
                break;
            case "/":
                sonuc = sayı1/sayı2;
                break;
            case "*":
                sonuc = sayı1*sayı2;
                break;
            default:
                break;
        }

        ekranLabel.setText(String.valueOf(sonuc));

    }
}
