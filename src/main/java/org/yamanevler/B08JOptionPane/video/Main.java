package org.yamanevler.B08JOptionPane.video;

import javax.swing.*;
/**
 * JOptionPane ile Kullanıcıya Mesaj ve Seçenek Sunma
 * JOptionPane  kullanarak mesaj pencereleri, onay pencereleri ve giriş pencereleri oluşturabiliriz.
 *
 * JOptionPane Kullanım Türleri:
 *  Bilgilendirme Mesajları: Kullanıcıya bilgi vermek için showMessageDialog() kullanılır. (Bilgilendirme, hata, uyarı, soru mesajları gibi)
 *  Onay Penceresi: Kullanıcıdan "Evet/Hayır" gibi seçimler almak için showConfirmDialog() kullanılır.
 *  Giriş Penceresi: Kullanıcıdan metin girişi almak için showInputDialog() kullanılır.
 *  Özel Seçenekler: showOptionDialog() ile kendi buton seçeneklerinizi ekleyebilirsiniz (Örn: "Evet, Hayır, İptal").
 *
 */
public class Main {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Merhaba, Dünya!", "Düz Başlık",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null ,"Bu bir bilgilendirme mesajıdır", "Bilgilendirme",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null ,"Devam etmek istiyormusun ?", "Soru",JOptionPane.QUESTION_MESSAGE);
//        while (true){
//            JOptionPane.showMessageDialog(null ,"Bilgisayarına Virüs bulaştı ", "Virüs",JOptionPane.WARNING_MESSAGE);
//        }
        //JOptionPane.showMessageDialog(null ,"Bir hata oluştu", "Hata",JOptionPane.ERROR_MESSAGE);

//       int sonuc =  JOptionPane.showConfirmDialog(null,"Devam etmek istiyor musun?","Soru", JOptionPane.YES_NO_CANCEL_OPTION);
//        System.out.println(sonuc);

//        String sonuc = JOptionPane.showInputDialog("Adınızı giriniz: ");
//        System.out.println("Merhaba "+sonuc);

//        ImageIcon icon = new ImageIcon("smile.png");
//        String[] secenekler = {"Evet, çok isterim","Hayır, istemiyorum","Burdan çık"};
//       JOptionPane.showOptionDialog(null,
//                "Devam etmek istiyor musun?",
//                "Soru",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.QUESTION_MESSAGE,
//                icon,
//                secenekler,
//                0
//                );

        Anasayfa anasayfa = new Anasayfa();

    }
}
