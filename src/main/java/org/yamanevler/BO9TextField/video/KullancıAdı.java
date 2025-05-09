package org.yamanevler.BO9TextField.video;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KullancıAdı implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton button;
    JLabel label;

    public KullancıAdı(){

        label = new JLabel("Kullanıcı Adı:");
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 40));
        textField.setFont(new Font("Arial", Font.PLAIN, 20));

        button = new JButton("Kaydet");
        button.addActionListener(this);

        frame = new JFrame("Kullanıcı Adı Girişi");

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.pack();// frame içindeki elemanların büyutuna göre kendini ayarlar.
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            String kullancıAdı = textField.getText().trim();
            if(kullancıAdı.isEmpty()){
                JOptionPane.showMessageDialog(null, "Lütfen kullanıcı adınızı giriniz!", "Uyarı", JOptionPane.WARNING_MESSAGE);
            }else{
                System.out.println("Kullanıcı adı: " + kullancıAdı);
                JOptionPane.showMessageDialog(null, "Kullanıcı adınız başarıyla kaydedildi!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                textField.setEditable(false);
            }
        }
    }
}
