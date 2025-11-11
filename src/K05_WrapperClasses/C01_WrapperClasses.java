package K05_WrapperClasses;

import javax.sound.midi.Soundbank;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir"; // Non-primitive
        int sayi = 34; // primitive

        System.out.println(str.toUpperCase()); // JAVA CANDİR
        System.out.println(str.charAt(2)); //v

        //Biz non-primitive olan String ile bircok hazir method kullanabiliyorken,
        // primitive olan int ile kullanamiyoruz

        // Java primitive data turlerinde bazi hazir method'lar kullanabilmemiz icin
        // WRAPPER CLASS'lari olusturmustur
        // boolean, char, byte, short, int, long, float, double
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double

        // primitive variabllar ile AYNI data turunun
        // wrapper classindaki variablelar arasinda gecis mumkundur


        int sayi1 = 5;
        Integer sayi2 = sayi1;

        // ANCAK FARKLI data turundeki wrapper classlar arasinda gecis MUMKUN DEGILDIR

        // Wrapper classtan olusturulan bir variable'a
        // baska isimdeki primitive data turundeki degeri de ATAYAMAYIZ


        int sayi5 = 25;
        short sayi6 = 45;
        byte sayi7 = 23;

        int sayi8 = sayi6; // int <== short    (short<int) otomatik atanir
        sayi6 = sayi7; // short <== byte       (byte>short) otomatik atanmaz

        //Wrapper Classlar bu atamaya izin vermez
        // Yani Integer <== Short atanmaz, casting olmaz
        // Java kabul etmez

          Short sayi9 = 45;
         //Integer sayi10 = sayi9;

        //Integer sayi11 = sayi6; // Integer <== short YINE KABUL ETMEZ
        // NON-PRIMITIVE data turunden primitive data turune de ATAMA YAPAMAYIZ

        String fiyat1 = "23";
        String fiyat2 = "45";
        // String olarak verilen iki urunun fiyatini toplayin

        System.out.println( fiyat1 + fiyat2); //2345
        // String metinleri TOPLAMAZ, YAN YANA yazdirir
        // icinde sadece ssyi oldugundan emin oldugumuz Stringleri,
        // Wrapper classlar ile sayiya cevirebiliriz

        int fi1 = Integer.parseInt(fiyat1); //String olan fiyat1'i int'e cevir demek
        // matematiksel degeri alir
        int fi2 = Integer.parseInt(fiyat2);
        System.out.println("Fiyatlarin toplami:" + (fi1 + fi2)); //68



        // EGER ONDALIKLI DEGERLER OLURSA double'a ceviririz

        fiyat1 = "23.45";
        fiyat2 = "34.43";

        double f1 = Double.valueOf(fiyat1);
        double f2 = Double.parseDouble(fiyat2);

        System.out.println("Ondalikli fiyatlarin toplami : " + (f1 + f2)); //57.879999999999995

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);


        // kullanicidan bir karakter alip
        char harf = 's';

        // verilen karakterin Buyuk Harf olup olmadigini yazdirin

        System.out.println(Character.isUpperCase(harf)); // false

        // verilen karakterin kucuk harf olup olmadigini yazdirin

        System.out.println(Character.isLowerCase(harf)); //true

        // verilen karakterin sayi olup olmadigini yazdirin

        System.out.println(Character.isDigit(harf)); //harf

        //Verilen ha--karakterin Harf olup olmadigini yazdirim

        System.out.println(Character.isLetter(harf)); //true

        // verilen karakterin Alfabetik olup olmadigini yazdirin //

        System.out.println(Character.isAlphabetic(harf)); // true

        // verilen karakteri Buyuk Harf olarak yazdirin

        System.out.println(Character.toUpperCase(harf)); //S








    }


}
