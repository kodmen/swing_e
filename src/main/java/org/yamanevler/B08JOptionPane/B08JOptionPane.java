package org.yamanevler.B08JOptionPane;

import javax.swing.*;

/**
 *  JOptionPane ile Kullanıcıya Mesaj ve Seçenek Sunma
 * Bu derste JOptionPane sınıfını kullanarak mesaj pencereleri, onay pencereleri ve giriş pencereleri oluşturmayı öğrendiniz.
 *
 * JOptionPane Kullanım Türleri:
 * ✅ Bilgilendirme Mesajları: Kullanıcıya bilgi vermek için showMessageDialog() kullanılır. (Bilgilendirme, hata, uyarı, soru mesajları gibi)
 * ✅ Onay Penceresi: Kullanıcıdan "Evet/Hayır" gibi seçimler almak için showConfirmDialog() kullanılır.
 * ✅ Giriş Penceresi: Kullanıcıdan metin girişi almak için showInputDialog() kullanılır.
 * ✅ Özel Seçenekler: showOptionDialog() ile kendi buton seçeneklerinizi ekleyebilirsiniz (Örn: "Evet, Hayır, İptal").
 *
 * 1️⃣ "Kullanıcı Kaydı" Uygulaması
 * Kullanıcıdan showInputDialog() ile ad, yaş, e-posta bilgilerini al.
 * Bilgileri bir JOptionPane.showMessageDialog() ile ekrana yazdır.
 *
 * 2️⃣ "Çıkış Onayı" Uygulaması
 * Kullanıcı bir "Çıkış" butonuna bastığında showConfirmDialog() ile emin olup olmadığını sor.
 * Eğer "Evet" derse programı kapat, "Hayır" derse devam et.
 *
 * 3️⃣ "Tema Seçme" Uygulaması
 * showOptionDialog() ile koyu mod, açık mod gibi seçenekler sun.
 * Kullanıcının seçtiği temaya göre arka plan rengini değiştir.
 */
public class B08JOptionPane {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Merhaba, Dünya!", "Düz Mesaj", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Bu bir bilgilendirme mesajıdır.", "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Devam etmek istiyor musunuz?", "Soru", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Bu bir uyarı mesajıdır.", "Uyarı", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Bir hata oluştu!", "Hata", JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null, "Devam etmek istiyor musunuz?", "Soru", JOptionPane.YES_NO_OPTION);
        //int sonuc =  JOptionPane.showConfirmDialog(null, "Devam etmek istiyor musunuz?", "Soru", JOptionPane.YES_NO_CANCEL_OPTION);

       //String name = JOptionPane.showInputDialog("Adınızı giriniz: ");
       // System.out.println(name);
        String[] secenek = {"Evet", "Hayır", "İptal"};
        ImageIcon icon = new ImageIcon("smile.png");
        JOptionPane.showOptionDialog(
                null,
                "Devam etmek istiyor musunuz?",
                "Soru",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icon,
                secenek,
                0);
    }
}
