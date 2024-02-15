public class PcMuhendisi implements IMuhendis { //IMuhendis interface'ine bu sınıfı uyumlu hale getirdik. İmplement ettik.

    // Implement ettiğimiz halde hata ile karşılaştık. Interface içerisindeki tüm metodları implement etmen gerekiyor şeklinde.

    private boolean askerlik; // Ek özellikl olarak ekledik //  2
    private boolean adli_sicil; //  3

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) { //  4
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    // Şimdi override etmiş olduğumuz metodların içeriğini Pc Mühendisine özgü olarak dolduruyoruz. //  5

    @Override
    public void askerlik_durumu_sorgula() { // Interfacedeki metodların hepsini override ettik. //  1

        if (askerlik) { // Main.java içerisinde constructor doldurulurken askerlik true yazılırsa bu if koşuluna girilecek. //  6

            System.out.println("Askerliğimi yaptım.");
        }
        else {

            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) { // Interfacedeki metodların hepsini override ettik. //  1

        return "Ortalamam: " + derece; //  7

    }

    @Override
    public void adli_sicil_sorgula() { // Interfacedeki metodların hepsini override ettik. //  1

        if (adli_sicil) { // Main.java içerisinde constructor doldurulurken adli_sicil true yazılırsa bu if koşuluna girilecek. //  8
            System.out.println("Adli sicil kaydım bulunuyor.");

        }
        else {
            System.out.println("Herhanggi bir adli sicil kaydım bulunmuyor.");

        }
    }

    @Override
    public void is_tecrubesi(String[] array) { // Interfacedeki metodların hepsini override ettik. //  1

        System.out.println("Bilgisayar Mühendisi olarak şu şirketlerde çalıştım...");

        for (int i = 0 ; i < array.length ; i++) { // Array'in tüm indekslerini bastırtıyoruz. Bunu foreach ile de yapabilir miyiz? //  9
            System.out.println(array[i]);

        }

    }
}
