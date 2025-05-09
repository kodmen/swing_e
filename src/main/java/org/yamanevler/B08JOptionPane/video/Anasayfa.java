package org.yamanevler.B08JOptionPane.video;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {

    JFrame frame;
    JButton button;

    public Anasayfa(){
        frame = new JFrame();

        button = new JButton("Çıkış yap");
        button.setBounds(130, 100, 100, 40);
        button.addActionListener(this);

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            int sonuc = JOptionPane.showConfirmDialog(null,"Çıkış yapmak istediğinize emin misiniz?","Çıkış",JOptionPane.YES_NO_OPTION);
            if(sonuc == JOptionPane.YES_OPTION){// 0
                System.exit(0);
            }
        }
    }
}
