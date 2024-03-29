public class MakineMuhendisi implements IMuhendis, ICalisma { //  17    // Imuhendisin yanına ICalisma'yı da implement ettik. //  31

    @Override
    public void calis() { // ICalisma interface'i içerisinde metodu implement ettik ve içini dolduruduk. //   32

        System.out.println("Makine Mühendisi çalışıyor...");

    }

    private boolean askerlik; //  19
    private boolean adli_sicil; //  20

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) { //  21
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() { // Tekrar IMuhendis içerisindeki tüm metodları override ettik. //  18

        // İçeriklerini PCMuhendisi classından direkt kopyaladık. //  22

        if (askerlik) { // Main.java içerisinde constructor doldurulurken askerlik true yazılırsa bu if koşuluna girilecek.

            System.out.println("Askerliğimi yaptım.");
        } else {

            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) { // Tekrar IMuhendis içerisindeki tüm metodları override ettik. //  18

        // İçeriklerini PCMuhendisi classından direkt kopyaladık. //  23


        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() { // Tekrar IMuhendis içerisindeki tüm metodları override ettik. //  18

        // İçeriklerini PCMuhendisi classından direkt kopyaladık. //  24


        if (adli_sicil) { // Main.java içerisinde constructor doldurulurken adli_sicil true yazılırsa bu if koşuluna girilecek.
            System.out.println("Adli sicil kaydım bulunuyor.");

        } else {
            System.out.println("Herhanggi bir adli sicil kaydım bulunmuyor.");

        }
    }

    @Override
    public void is_tecrubesi(String[] array) { // Tekrar IMuhendis içerisindeki tüm metodları override ettik. //  18

        if (array.length == 0) { //  Burada bu metodun içeriğini PCMuhendisi'nde yazdığımızdan farklı yazdık. //  25
            // Bu koşul array içeriğinin boş olduğunu ifade ediyor. //  26
            System.out.println("Herhangi bir iş tecrübem bulunmuyor...");
        } else {
            System.out.println("Makine Mühendisi olarak şu şirketlerde çalıştım.");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }
        }
    }

    public void referans_getir(String[] array) { /* Buraya PCMuhendisi class'ında olmayan ve aynı zamanda IMuhendis interfaceinde de
                                                    bulunmayan ek bir metod yazıyoruz.
                                                    Yukarıdaki satırlarda Hem interface'i implement etmiş hem de bu class
                                                    içerisine ekstradan bir metod yazmış olduk. */ //27

        if (array.length == 0) {
            System.out.println("Herhangi bir referansım bulunmuyor.");
        } else {
            System.out.println("Referanslarım...");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }




}