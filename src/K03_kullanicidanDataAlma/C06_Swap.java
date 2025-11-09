package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C06_Swap {

    public static void main(String[] args) {

        // (Interview) Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin (swap)

        /*

        su, kum kovalarini birbirine bosaltmak istedigimizi dusunelim
        bunu yapabilmek icin 3. bos bir kovaya ihtiyacimiz vardir
        once kumu bos kovaya bosaltir, ardindan bosalan kum kovasina suyu bosaltir
        ve en sonda bosalan su kovasina kumu bosaltip yerlerini degistiririz.
        Ayni bu islem gibi swap yapabilmek icin gecici bir variable'a ihtiyacimiz vardir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci tam sayiyi giriniz...");
        int sayi1 = scanner.nextInt(); //25
        System.out.println("Ikinci tam sayiyi giriniz...");
        int sayi2 = scanner.nextInt(); //40

        // sayi1 = 25  sayi2 = 40 temp = 0
        int temp = 0;
        temp = sayi2; // temp= 40 sayi1 = 25 sayi2 = 40
        sayi2 = sayi1; // sayi1 = 25 temp= 40  sayi2= 25
        sayi1 = temp; // sayi1 = 40  sayi2 = 25  temp= 40


        System.out.println("sayi1'in yeni degeri : " + sayi1 );
        System.out.println("sayi2'nin yeni degeri : " + sayi2);

        // sayi1'in yeni degeri : 40
        //sayi2'nin yeni degeri : 25


    }
}
