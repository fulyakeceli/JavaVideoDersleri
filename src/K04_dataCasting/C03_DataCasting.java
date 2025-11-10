package K04_dataCasting;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        // kullanicidan iki tam sayi alin
        //sayilari birbirine bolup, islem sonucunu ondalikli olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen birinci tam sayiyi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("Lutfen ikinci tam sayiyi giriniz");
        int sayi2 = scanner.nextInt();

       // System.out.println("sayi1'in sayi2'ye bolumu : " + (sayi1/sayi2)); // 24/5=4.8 ama Java 4 verdi

         /*
        Java'da iki tam sayiyi birbirine bolerseniz,
        Java islem sonucunun tam sayi kismini alir.
         */

        System.out.println("sonucu double'a cast edersek : " +(double) (sayi1/sayi2));
        //burada da once bolme islemini yapar 4 bulur
        // sonra double'a cevirirken 4.0 yazdirir HATALI olur


        System.out.println("sayilardan birini double'a cast edersek: " + ((double)sayi1/sayi2));
        //bu sekilde dogru sonuc alırız

        /*
        NOT: Java ile 10'a bolerek sondaki basamaktan kurtulabiliriz
        Birler basamagini sileriz

         */

        System.out.println( 243 / 10 ); // 24.3 ==> 24
        System.out.println( 5234 / 10 ); // 523.4 ==> 523


    }
}
