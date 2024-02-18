/*

Javada C++'da olduğu gibi mutliple inheritance (çoklu kalıtım) bulunmuyor.
Bu yüzden interfaceler kullanılıyor.

Interfacce özellikleri:

1) Interface'in içeriğinde bulunan metodlarının kod blokları bulunmaz. Bu yüzden Interface'e uyan(implemente edilmiş) tüm
classların bu metodları tek tek tanımlamaları gerekiyor.
2) Eğer bir interface'e implemente olmuş bir class, interface içerisindeki metodların birini bile bulundurmazsa hata alır.
Interface'i bu durumda bir sözleşme gibi düşünebiliriz. İçeriğindeki metodların uyumlu (implemente) olduğu classlarda
da harfiyen bulunması/tanımlanması gereklidir. Yani bu sözleşmelerin tek tek eksiksiz imzalanması gerekir.
3) Bir proje içerisinde Class oluşturur gibi New > Class > Interface seçeriz. İsmini yazarak oluşturmuş oluruz.
4) Interfaceler normal classlar gibi olmadığından, bunlardan herhangi bir obje oluşturamıyoruz. Ancak interface'i implement
eden classlara referans olabiliyoruz.
5) Interfacelerin içerisinde herhanggi bir feature/attribute/özellik bulunamıyor. Sadece ve sadece final ve static değişkenler
tanımlanabiliyor.
6)) Interfaceler, kendilerine implemente(uyumlu) olan classlar için bir çatı olarak düşünülebilir.

Gerçek hayattan bir örnek:

Bir Bilgisayar Mühendisi ve Bir Makine Mühendisi iki arkadaş bir işe başvurur.
İşyeri tam 4 şartın yerine getirilmesini istiyor. Şartlar;

-Adli sicil kaydı
-Mezuniyet ortalaması (Diploma)
-İş yeri tecrübesi
-Askerlik durumu

Bu belgelerin zorunlu olarak verilmesi gerekiyor. Ayrıca bunların haricinde kendilerini kanıtlayabilmek için ekstra belge de
götürebiliyorlar. Referans belgesi gibi.

Interface mantığında da durum aynı. İçine blokları yazılmamış boş metodlar yazılıyor. Interface'e implement olan yani uyumlu olan
classlar da bu metodları kendilerine göre doldurabiliyorlar. Ekstra olarak da kendilerine has başka metodlar oluşturabiliyorlar.

Interface oluştururken Interface olduğunu anlayabilmemiz adına başına I harfi koyuyoruz.

*  */
public class Main {

    public static void main(String[] args) {

        //IMuhendis muhendis1 = new IMuhendis(); // Hata verdi. Çünkü interfacelerden kesinlikle obje oluşturulamaz. Yoruma aldık. //  10

        PcMuhendisi muhendis1 = new PcMuhendisi(false,false); // askerlik yapmadık (false), adli sicil kaydı yok (false) //  11

        /*muhendis1.askerlik_durumu_sorgula(); //  12
        muhendis1.adli_sicil_sorgula(); //  13

        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07)); //  14

        String[] tecrube = {"Vestel", "Havelsan", "Türksat"}; //  15
        muhendis1.is_tecrubesi(tecrube); //  16 */ //MakineMuhendisi class'ındakileri deneyeceğimiz için bunları yoruma aldık. //  28

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false); //  29

        String[] tecrube = {}; // Array'in içi boş olduğu için çıktısında "Herhangi bir iş tecrübem bulunmuyor..." yazdı. //   29
        String[] referans = {"Direncan Gider", "Özgür Demir"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calis();  // Dersin en sonunda bu metodu da çağırmış olduk.  //   33

    }

}
