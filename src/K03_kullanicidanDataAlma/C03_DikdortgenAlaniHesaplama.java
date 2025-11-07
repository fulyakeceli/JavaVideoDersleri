package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C03_DikdortgenAlaniHesaplama {

    // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alin
    // ve dikdortgenin alanini yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kisa kenari giriniz.");
        double dikdortgenKisaKenar = scanner.nextDouble();
        System.out.println("Lutfen uzun kenari giriniz.");
        double dikdortgenUzunKenar = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + (dikdortgenKisaKenar * dikdortgenUzunKenar)); //Dikdortgenin alani : 50410.08



    }



}
