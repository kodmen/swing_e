1. Interface Nedir?

Interface, bir sınıfa ne yapacağını söyleyen ama nasıl yapacağını söylemeyen bir yapı sunar.
Sınıfların belirli bir davranışı garanti etmesi için bir "anlaşma" gibidir.

Interface, bir sınıfa hangi yeteneklere sahip olması gerektiğini söyler, ama bu yeteneklerin nasıl kullanılacağını sınıfa bırakır.
Tıpkı gerçek dünyada bir insanın sahip olduğu yetenekler gibi: Örneğin, biri şarkı söyleme yeteneğine sahipse, nasıl şarkı söylediği kişiden kişiye değişebilir.

Örnek 1: Çalınabilir Müzik Aletleri

Interface Tanımı: "Çalınabilir (Playable)" bir özelliği ifade eder.
Somutlaştırma:
Keman, piyano ve gitar "çalınabilir".
Ancak, kemanı yayla çalarsınız, piyanoyu tuşlarla çalarsınız.


Uçabilen Araçlar

Interface Tanımı: "Uçabilen (Flyable)" bir yetenek.
Somutlaştırma:
Uçak, helikopter, dron gibi araçlar "uçabilir".
Ama her birinin uçma şekli farklıdır.


/**
* BorderLayout konusu, Swing kütüphanesindeki en yaygın kullanılan layout türlerinden biridir.
* BorderLayout, bir pencereyi beş ana bölgeye ayırarak bileşenleri bu bölgelere yerleştirmenizi
* sağlar. güzel bir örneği.
*
* BorderLayout Nedir?
* BorderLayout, pencereyi beş bölgeye ayıran bir düzenleme yöneticisidir:
*
* NORTH: Üst bölge
* SOUTH: Alt bölge
* WEST: Sol bölge
* EAST: Sağ bölge
* CENTER: Orta bölge (En büyük alan)
* Özellikleri:
*
* Bir bölgeye yalnızca bir bileşen eklenebilir.
* CENTER dışındaki diğer bölgeler sabit boyutludur, CENTER ise kalan alanı kaplar.
* Eklediğiniz bileşenlerin sıralaması önemlidir; her bölge yalnızca bir bileşeni barındırır.
*
* Anlatım Akışı
* BorderLayout'u Tanıtın:
*
* Neden layout yöneticisi kullanıyoruz?
* BorderLayout’un beş ana bölgesi ve bu bölgelerin temel özelliklerini açıklayın.
* Kod Üzerinde Giderek Her Bölgeyi Gösterin:
*
* Önce panel1, panel2, panel3, panel4 ve panel5’i gösterin.
* Her birinin rengini ve boyut ayarını neden yaptığınızı açıklayın.
* Panel İçinde Panel Kullanımı:
*
* Panel5 içine eklenen subpanellerin, bir panelin daha fazla bölünmesine nasıl olanak sağladığını açıklayın.
* Subpanel kullanımının daha karmaşık düzenler için faydalı olduğunu vurgulayın.
  */

/**
* FlowLayout Nedir?
* FlowLayout, Swing'de kullanılan bir layout yöneticisi olup bileşenleri ekleme sırasına
* göre yan yana veya alt alta düzenler.
*
* Bileşenlerin varsayılan boyutlarını korumasına izin verir ve bileşenler yatay olarak
* sıralandığında panelin genişliğini aşarsa, otomatik olarak bir sonraki satıra geçer.
*
* Özellikleri:
* Varsayılan olarak bileşenleri soldan sağa hizalar.
* Yatay (x ekseni) ve dikey (y ekseni) boşluk ayarları yapılabilir.
* Pencere boyutu değiştirildiğinde bileşenlerin düzeni buna göre yeniden ayarlanır.
*
* Uygulama ve Ödev Önerisi:
*
* Öğrencilerden FlowLayout kullanarak bir "hesap makinesi arayüzü" veya
* "renk seçim arayüzü" oluşturmalarını isteyin.
  */

/**
* GridLayout Nedir?
* GridLayout, Swing bileşenlerini eşit boyutlu hücrelerden oluşan bir kare veya dikdörtgen ızgara düzenine yerleştirir.
*
* Özellikleri:
* Her bileşen eşit boyuttadır.
* Izgara satır ve sütun sayısı ile tanımlanır.
* Bileşenler eklenme sırasına göre soldan sağa ve yukarıdan aşağıya dizilir.
* Hücreler arasındaki yatay ve dikey boşluklar özelleştirilebilir.
  */