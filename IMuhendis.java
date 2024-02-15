public interface IMuhendis {

    /* Bu kısımda özellikleri yazarken public veya private gibi başlarına erişim belirleyici koyabiliriz fakat classlar
       gibi obje oluşturamadığımız için java bunu bizden istemiyor. Yani yazmamıza gerek yok. Dönüş tiplerini yazarak
       (void gibi) metodlarımızı yazmaya başlıyoruz. // 0
     */

    void askerlik_durumu_sorgula();
    String mezuniyet_ortalamasi(double derece);
    void adli_sicil_sorgula();
    void is_tecrubesi(String[] array);

}
