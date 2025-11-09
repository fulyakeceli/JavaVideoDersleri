package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C04_KullanicidanBilgiAlipYazdirma {

    // Kullanidan ismini, soyismini ve yasini alip
    // asagidaki formatta yazdirin
    // J Doe, 44

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();

        /*

       1- Java'da indexler 0'dan baslar.
        Ilk harfe ulasmak icin index olarak "0" veririz.
        Bunun icin de charAt() methodunu kullaniriz.

        2- Java'da gercekten bosluk birakmak istersek " " kullanmaliyiz.
         */
        System.out.println("Girilen bilgiler : " + isim.charAt(0) + " " +
                soyisim + ", " +
                yas );    // F Keceli, 25
    }


}
