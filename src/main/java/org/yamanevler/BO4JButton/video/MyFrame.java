package org.yamanevler.BO4JButton.video;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton ac;
    JButton kapat;
    JLabel label;

    MyFrame(){// Constractor
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout( null);

        ImageIcon icon = new ImageIcon("resimler/like4.png");
        ImageIcon şaşkın = new ImageIcon("smile.png");

        ac = new JButton();
        ac.setText("Aç");
        ac.setBounds(100,100,200,150);
        ac.setIcon(icon);
        ac.addActionListener(this);

        kapat = new JButton();
        kapat.setText("Kapat");
        kapat.setBounds(100,270,200,150);
        kapat.setIcon(icon);
        kapat.addActionListener(this);

        label = new JLabel();
        label.setIcon(şaşkın);
        label.setBounds(400,100,250,130);
        label.setVisible(false);

        this.add(label);
        this.add(ac);
        this.add(kapat);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == ac){ // butonları kontrol ediyorum tıklanan butonsa bu ifi çalıştır
          label.setVisible(true);
      }

      if (e.getSource() == kapat){
          label.setVisible(false);
      }
    }
}
