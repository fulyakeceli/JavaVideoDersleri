package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlipYazdirma {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin
        // Isminiz: John
        // Soyisminiz: Doe
        // Yasiniz: 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz...");
        String isim = scan.nextLine();
       // scanner.next() kullanicinin girdigi ismin ilk space'ine kadar alir
       // scanner.nextLine() ise tamamini alir
        System.out.println("Lutfen soyadinizi giriniz...");
        String soyisim = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scan.nextInt();

        System.out.println(
                "Isminiz : " + isim +
        "Soyisminiz : " + soyisim +
        "Yasiniz : " + yas +
        "Kaydiniz basariyla tamamlanmistir."  ); // Isminiz : FulyaSoyisminiz : KeceliYasiniz : 25Kaydiniz basariyla tamamlanmistir.

        /*

        eger yazdirinca asagi insin istiyorsak
        kelimenin basina " \n " koyariz.

         */

        System.out.println(
                "Isminiz : " + isim +
                        "\nSoyisminiz : " + soyisim +
                        "\nYasiniz : " + yas +
                        "\nKaydiniz basariyla tamamlanmistir."  );


        // Isminiz : Fulya
        //Soyisminiz : Keceli
        //Yasiniz : 25
        //Kaydiniz basariyla tamamlanmistir.


    }
}
