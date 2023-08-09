package kahveMakinasi;

import javax.swing.*;
import java.util.Scanner;

public class kahveOtomat {
   /* Basit bir Kahve makinesi oluşturun.
1. Şart
 3 çeşit kahvemiz olsun.

    Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
    Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.

    Örn:
    Hangi Kahveyi İstersiniz?
            1.Türk kahvesi
  2.Filtre Kahve
  3.Americano
    */

    static String kahveCesidi="", sut="", seker="", kahveBoyutu="";
    static int sekerMiktari;
    static Scanner scanner=new Scanner(System.in);

    static void menu(){
        System.out.println("*****HOS GELDINIZ*****");

        do {
            System.out.println("*****MENU*****\n"+
                    "1.Türk kahvesi\n"+
                    "2.Filtre Kahve\n"+
                    "3.Americano\n"+
                    "Secim : ");
            kahveCesidi= scanner.nextLine();
            if (!kahveCesidi.equalsIgnoreCase("türk kahvesi") &&
                !kahveCesidi.equalsIgnoreCase("filtre kahve") &&
                !kahveCesidi.equalsIgnoreCase("americano"))
                System.out.println("Bu urun menu'de yok...");
        }while (!kahveCesidi.equalsIgnoreCase("türk kahvesi") &&
                !kahveCesidi.equalsIgnoreCase("filtre kahve") &&
                !kahveCesidi.equalsIgnoreCase("americano"));

    }
 //   2.Şart
 //   Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istermisiniz?(Evet veya Hayır olarak cevaplayınız)

    static void sutEkleme(){
        System.out.println("Süt eklemek istermisiniz?(Evet veya Hayır olarak cevaplayınız)");
        sut= scanner.next();
        if (sut.equalsIgnoreCase("evet"))
            System.out.println("sut ekleniyor...");
        else
            System.out.println("sut eklenmiyor...");
    }
    /*
    3. Şart
Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
sorusunu sorsun.

     */
    static void sekerEkleme() {
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)");
        seker = scanner.next();
        if (seker.equalsIgnoreCase("evet")) {
            System.out.println("kac seker istersiniz");
            sekerMiktari = scanner.nextInt();
            System.out.println(sekerMiktari + " adet seker ekleniyor...");
        }else {
            System.out.println("seker eklenmiyor...");
        }
    }
   /*
    4. Şart
    Şeker tercihini yaptıktan sonra sistem kullanıcıya kahvenin "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)"
    sorusunu sorsun.
    */
    static void boyutSorgula(){

        do {
            System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
            scanner.nextLine();
            kahveBoyutu= scanner.nextLine();
            if (!kahveBoyutu.equalsIgnoreCase("büyük boy") &&
                !kahveBoyutu.equalsIgnoreCase("orta boy") &&
                !kahveBoyutu.equalsIgnoreCase("kücük boy"))
                System.out.println("giris yaptiniz...");
        }while (!kahveBoyutu.equalsIgnoreCase("büyük boy") &&
                !kahveBoyutu.equalsIgnoreCase("orta boy") &&
                !kahveBoyutu.equalsIgnoreCase("kücük boy"));

    }
    /*
    Sonuç
   Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
     */
    static void sonuc(){
        if (sut.equalsIgnoreCase("evet"))
            sut="sütlü";
        else
            sut="sütsüz";

        if (seker.equalsIgnoreCase("evet"))
            seker="sekerli";
        else
            seker="sekersiz";


        System.out.println(sut+" "+seker+" "+kahveBoyutu+" "+kahveCesidi+" HAZIRDIR AFIYET OLSUN!!!");
    }

    public static void main(String[] args) {

        menu();
        sutEkleme();
        sekerEkleme();
        boyutSorgula();
        sonuc();

    }
}
