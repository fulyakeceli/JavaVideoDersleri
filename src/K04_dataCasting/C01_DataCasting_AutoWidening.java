package K04_dataCasting;

public class C01_DataCasting_AutoWidening {

    public static void main(String[] args) {

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";

        int sayi2 = sayiInt;
        // ayni data turundeki bir degeri
        // yine ayni data turunde bir variable'a atama yaparsak
        // bu data casting olmaz
        // ATAMA olur

        // baska bir data turu atamak istersem:

       // bl = chr;
       // bl = byt;
       // bl = shrt;
       // bl = sayiInt;
       // bl = str;

        // chr = bl;
        // chr = flt;
        // chr = dbl;
        //chr = str;

        // str= bl;
       // str = byt;
       // str = chr
        // str = shrt;
        // str = lng;

        /*
        boolean string variable'a
         diger data turundeki
        degerleri direkt olarak ATAYAMAYIZ

         */


        // bir variable'a kendisinden daha genis bir data turu ATANABİLİR Mİ?
        // BU İSLEMİ JAVA OTOMATIK olarak YAPMAZ
        // Java sorumlulugu almamizi ister

        byt = (byte) shrt;
        //byte = shrt;
        //byte = sayiInt;
        byt = (byte) sayiInt;
        // byt = lng;
        // byt = flt;
        // byt = dbl;
        //byte'a hicbir data turunden atama YAPAMAYIZ

         shrt = byt;
        // shrt = sayiInt;
        // sayiInt = lng;
        // sayiInt = flt;
        // sayiInt = dbl;
        // short'a SADECE byte'i atayabiliriz

        sayiInt = byt;
         sayiInt = shrt;
        // sayiInt = lng;
        // sayiInt = flt;
        // sayiInt = dbl;
        //int'e byte ve short data turunde atama yapabiliriz


         lng = byt;
         lng = shrt;
         lng = sayiInt;
         //lng = flt;
        // lng= dbl;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;
        // flt=dbl;

        dbl = byt;
        dbl= shrt;
        dbl= sayiInt;
        dbl= lng;
        dbl = flt;

        /*
        Sayı turundeki variable'larda
        kendisinden daha AZ KAPSAMLI olanlara
        hicbir islem yapmadan ATAMA yapılabilir.
        Buna Auto Widening (otomatik genisletme) denir.
         */



        /*

        Eger variable'in data turunden daha kapsamli bir
        data turune atama yapmak istersek Java sorumluluk almamizi
         ister. Bunun icin esitligin saginda () icerisine cevirmek
        istedigimiz data turunu yazariz
        buna Expilicit Narrowing denir.
         */



    }
}
