package org.yamanevler.Bo13Slider.En2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemoEn2 implements ChangeListener {

    JFrame frame;
    JSlider slider;
    JLabel label;

    public SliderDemoEn2(){
        // 1
        frame = new JFrame("Slider Demo");
        slider = new JSlider(0,100,50);
        JPanel panel = new JPanel();
        label = new JLabel();

        slider.setPreferredSize(new Dimension(400,300));
        slider.setPaintTicks(true);        // Slider üzerine tık işaretleri ekleniyor (görsel rehber)

        slider.setMajorTickSpacing(20); // major büyük
        slider.setMinorTickSpacing(5); // minor küçük

        slider.setPaintLabels(true);        // Sayı etiketlerinin görünmesi sağlanıyor

        slider.addChangeListener(this);

        slider.setOrientation(SwingConstants.VERTICAL); // Dikey olarak ayarlandı


        label.setText("°C = "+ slider.getValue() + " °F= "+ celciusToFahrenheit(slider.getValue()));

        panel.add(slider);
        panel.add(label);

        //2
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public double celciusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = "+ slider.getValue() + " °F= "+ celciusToFahrenheit(slider.getValue()));

    }
}
