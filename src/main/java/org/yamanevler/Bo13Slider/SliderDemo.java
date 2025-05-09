package org.yamanevler.Bo13Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 *  basit bir slider (kaydırıcı) arayüzü oluşturur. Slider'ı yukarı-aşağı hareket ettirdiğimizde,
 *  bir etiket (label) üzerinden o anki değeri gösterir. Bu örnek, GUI (grafik kullanıcı arayüzü)
 *  bileşenlerini nasıl kullanacağımızı ve ChangeListener arayüzü ile bir bileşenin nasıl dinleneceğini
 *  (event handling) öğretmek için güzel bir örnektir. basit bir slider (kaydırıcı) arayüzü oluşturur.
 *  Slider'ı yukarı-aşağı hareket ettirdiğimizde, bir etiket (label) üzerinden o anki değeri gösterir.
 *  Bu örnek, GUI (grafik kullanıcı arayüzü) bileşenlerini nasıl kullanacağımızı ve ChangeListener
 *  arayüzü ile bir bileşenin nasıl dinleneceğini (event handling) öğretmek için güzel bir örnektir.
 */
public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    public SliderDemo() {

        //1
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        //3
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);        // Slider üzerine tık işaretleri ekleniyor (görsel rehber)

        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);        // Sayı etiketlerinin görünmesi sağlanıyor

        slider.setFont(new Font("Arial", Font.PLAIN, 20));

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("C = "+ slider.getValue());

        //4
        slider.addChangeListener(this);        // Slider'a bir dinleyici ekleniyor: Bu sınıf kendisi dinleyici



        //2
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C = "+ slider.getValue());

    }
}
