package org.yamanevler.BO9TextField.video;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton button;

    public Anasayfa(){
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 50));
        textField.setFont(new Font("Arial", Font.PLAIN, 35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.blue);
        textField.setText("Doldurun");


        button = new JButton("Gönder");
        button.addActionListener(this);

        frame = new JFrame("JTextField Örneği");
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
            System.out.println("TextField içeriği: " + textField.getText());
            textField.setEditable(false);
        }
    }
}
