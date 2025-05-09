package org.yamanevler.BO9TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JTextField, kullanıcıdan metin girişi almak için kullanılan bir bileşendir.
 *
 * setText() ile başlangıç metni belirlenebilir.
 * getText() ile girilen metin okunabilir.
 * setEditable(false) ile düzenlenebilirliği kapatılabilir.
 * setForeground(), setBackground(), setFont() gibi metodlarla görünümü özelleştirilebilir.
 */
public class AnaSayfa implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton button;

    public AnaSayfa() {
        frame = new JFrame("JTextField Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 50));
        textField.setFont(new Font("Arial", Font.PLAIN, 35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.blue);
        textField.setText("Doldurun");

        button = new JButton("Tıkla");
        button.addActionListener(this);

        frame.add(button);
        frame.add(textField);
        frame.pack();
        /**
         frame.pack(); yöntemi, JFrame bileşeninin içindeki tüm bileşenlerin tercih edilen boyutlarına göre çerçeveyi yeniden boyutlandırır. Bu, bileşenlerin düzgün bir şekilde yerleştirilmesini ve görünmesini sağlar.
         */
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("TextField içeriği: " + textField.getText());
            textField.setEditable(false);

        }
    }
}
