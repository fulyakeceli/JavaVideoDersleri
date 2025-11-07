package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin

        // 1. adım: Scanner nesnesi olustur
        Scanner scanner = new Scanner(System.in);
        //2. adim: kullanicidan bilgi iste
        System.out.println("Lutfen ondalikli bir sayi giriniz...");
        //3. adım: kullanicidan aldigin bilgiyi uygun variable'a kaydet
        double ondalikliSayi = scanner.nextDouble();
        System.out.println("Lutfen bir tamsayi giriniz...");
        int tamSayi = scanner.nextInt();

        //simdi toplamlarını ve carpimlarını yazdıralım
        System.out.println("Sayilarin toplami : " + (ondalikliSayi + tamSayi)); // Sayilarin toplami : 15.5
        System.out.println("Sayilarin carpimi : " + (ondalikliSayi * tamSayi)); // Sayilarin carpimi : 52.5

    }
}
