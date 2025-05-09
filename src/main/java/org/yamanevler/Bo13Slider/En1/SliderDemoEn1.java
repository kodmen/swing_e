package org.yamanevler.Bo13Slider.En1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemoEn1 implements ChangeListener {

    JFrame frame;
    JSlider slider;
    JLabel label;

    public SliderDemoEn1(){

        slider = new JSlider(0,100,50);
        slider.setPaintLabels(true);//
        slider.setPaintTicks(true); // Slider üzerine tık işaretleri ekleniyor (görsel rehber)

        slider.setMajorTickSpacing(20); // major büyük
        slider.setMinorTickSpacing(5); // minor küçük
        slider.addChangeListener(this);

        slider.setFont(new Font("Arial", Font.PLAIN, 20));
        slider.setOrientation(SwingConstants.VERTICAL); // Dikey olarak ayarlandı
        JPanel panel = new JPanel();

        panel.add(slider);
        label = new JLabel();
        label.setText("C= "+ slider.getValue() + "F= "+"100" );
        panel.add(label);


        frame = new JFrame("Slider Demo");

        frame.add(panel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Değer= "+ slider.getValue());
    }
}
