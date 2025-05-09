package org.yamanevler.BO10CheckBox.en1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {

    JFrame frame;
    JCheckBox checkBox;
    JButton button;

    public Anasayfa(){
        frame = new JFrame();
        checkBox = new JCheckBox();
        button = new JButton("Kaydet");
    }

    public void start(){

        checkBox.setText("Beni hatırla");
        button.addActionListener(this);

        frame.add(checkBox);
        frame.add(button);

        frame.setLayout(new FlowLayout());
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            if (checkBox.isSelected()) {
                System.out.println("Beni hatırla seçildi.");
            }else {
                System.out.println("Beni hatırla seçilmedi.");
            }
        }
    }
}
