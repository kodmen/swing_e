package org.yamanevler.Excersise.SepetUygulaması;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Sepetim  implements ActionListener {

    private JFrame frame;

    private JPanel urunPaneli;
    private JPanel sepetimPaneli;

    private JPanel sepetUrunler;

    private String[][] urunler = {
        {"1","Sut","25","sut.png"}, {"2","Ekmek","10","ekmek.png"},
    };

    private List<Urun> urunList;
    private List<Urun> sepettekiUrunler;
    private List<JButton> urunButonları;

    private JLabel sepetimYazısı;
    private JButton hesaplaButonu;

    Sepetim(){
        frame = new JFrame("Urun sepeti");
        frame.setSize(1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1,2));

        urunPaneli = new JPanel(new GridLayout(4,5));
        urunPaneli.setPreferredSize(new Dimension(500,500));
        urunPaneli.setBackground(Color.BLUE);

        sepetimPaneli = new JPanel(new BorderLayout());
        sepetimPaneli.setPreferredSize(new Dimension(500,500));
        sepetimPaneli.setBackground(Color.red);

        frame.add(urunPaneli);
        frame.add(sepetimPaneli);

        urunList = new ArrayList<>();
        Urun ekmek = new Urun("Ekmek",25,"",1);
        Urun sut = new Urun("Sut",30,"",2);
        Urun peynir = new Urun("Peynir",50,"",3);

        urunList.add(ekmek);
        urunList.add(sut);
        urunList.add(peynir);
        urunButonları =new ArrayList<>();

        ImageIcon originalIcon = new ImageIcon("şaşkın.png");

        // Resmi yeniden boyutlandır
        Image scaledImage = originalIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);

        for (Urun urun: urunList){
            JButton button = new JButton();
            String buttonIsim = urun.getIsim() + " " +urun.getFiyatı();
            button.setText(buttonIsim);
            button.addActionListener(this);
            button.setIcon(resizedIcon);
            button.setHorizontalTextPosition(JLabel.CENTER);// LEFT,CENTER,RİGHT VEREBİLİRSİN
            button.setVerticalTextPosition(JLabel.BOTTOM);// TOP,CENTER,BOTTOM
            button.setFont(new Font(null,Font.BOLD,20));
            button.setVerticalAlignment(JLabel.CENTER); // icon+image position
            button.setHorizontalAlignment(JLabel.CENTER);
            urunPaneli.add(button);
            urunButonları.add(button);
        }


        sepetimYazısı = new JLabel();
        sepetimYazısı.setText("Sepetim");
        sepetimYazısı.setFont(new Font(null,Font.BOLD,50));
        sepetimYazısı.setHorizontalTextPosition(JLabel.CENTER);// LEFT,CENTER,RİGHT VEREBİLİRSİN
        sepetimYazısı.setVerticalTextPosition(JLabel.CENTER);// TOP,CENTER,BOTTOM

        sepetimYazısı.setVerticalAlignment(JLabel.CENTER); // icon+image position
        sepetimYazısı.setHorizontalAlignment(JLabel.CENTER);

        urunPaneli = new JPanel();
        urunPaneli.setLayout(new GridLayout(10,1));
        urunPaneli.setPreferredSize(new Dimension(400,400));
        urunPaneli.setBackground(Color.lightGray);

        sepetimPaneli.add(sepetimYazısı,BorderLayout.NORTH);
        sepetimPaneli.add(urunPaneli,BorderLayout.CENTER);

        sepettekiUrunler = new ArrayList<>();


        frame.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {

        for (JButton button: urunButonları){
            if (e.getSource() == button){
                JLabel urun = new JLabel();
                urun.setText(button.getText());
                urunPaneli.add(urun);

                frame.setVisible(true);
            }
        }

    }


}
