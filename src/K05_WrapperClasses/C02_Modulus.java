package K05_WrapperClasses;

import java.util.Scanner;

public class C02_Modulus {

    // Modulus bolme islemindeki KALAN'i verir

    public static void main(String[] args) {

        System.out.println( 25 / 10); // 2.5 ==> 2 veriyordu

        System.out.println( 15 / 4 ); // 3.75 ==> 3

        // AMA MODULUS NORMAL BOLME ISLEMINDEN FARLI

        System.out.println( 35 % 10); // 35'in 10 ile bolumunden kalan => 5

        System.out.println( 15 % 4); // ==> 15'in 4 ile bolumunden kalan 3

        /*
        KURAL: sayi 2'ye bolunuyorsa ve
        kalan 0 ise %2 ==> ise SAYI CIFT'tir
         */

        int sayi1 = 24;
        int sayi2 = 25;
        // girilen sayinin cift olup olmadigini yazdirin

        System.out.println( sayi1 % 2); //0 CIFT
        System.out.println(sayi2 % 2); //1 TEK

        /*
        bir sayinin 5'e bolunup bolunmedigini
        %5 ile bulabiliriz
         */

        int sayi = 45;
        int sayii = 48;
        // girilen sayinin 5'e bolunup bolunmedigini yazdirin
        System.out.println(sayi % 5); //0 yani bolunuyor
        System.out.println(sayi% 5); // 3 yani tam bolunemiyor


        // girilen sayinin 3'un kati olup olmadigini yazdirin
        System.out.println(sayi % 3); //sonuc 0 ise 3'un tam katidir


        //SORU: Kullanicidan bir tamsayi isteyin
        // girilen sayinin birler basamagini yazdirin

        /*
        BIRLER BASAMAGI ICIN %10 kullaniriz
        bu bize sayinin 10 ile bolumunden kalani
        yani son basamagi verir
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz"); //456788 ==> 8
        int girilenSayi = scanner.nextInt();
        System.out.println( girilenSayi % 10);

        /*
        % 10 ile /10 farklidir
        %10 birler basamagini verirken,
        /10 kusuratsiz sekilde sayiyi verir.

         */


    }
}
