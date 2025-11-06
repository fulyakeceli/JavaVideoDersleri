package K02_DataKullanimiVeVariables;

public class C01_VariableKullanimi {

    public static void main(String[] args) {


    int sayi = 20;
    //Java hafizada ismi sayi olan bir varb olusturur ve sayi degerini icine koyar

        System.out.println("hesabim"); //hesabim

        System.out.println("sayi"); //sayi

        // Cift tirnak oldugunda Java ne goruyorsa onun aynisini yazdirir (bosluk da dahil)


        // Java'da bir metin yazdirmak ile bir variable'in degerini yazdirmak farkli seylerdir
        // bir metin yazdirmak istedigimizde "" kullaniriz
        // variable'in degerini yazdirmsk istedigimizde sadece variable ismini yazariz "" KULLANMAYIZ

        System.out.println(sayi); //20

        System.out.println("sayi variable'inin degeri : " + sayi); // sayi variable'inin degeri : 20

        //sayi variable'inin degeri dgistirilebilir yeniden atama yapabiliriz

        int yas = 20;
        System.out.println("yas variable'inin 29. satirdaki degeri : " + yas); //yas variable'inin 29. satirdaki degeri : 20

        yas = yas + 5;

        System.out.println("yas variable'inin 33. satirdaki degeri : " + yas); //yas variable'inin 33. satirdaki degeri : 25

        // Java'daki assignment sign onemlidir
        // cunku Java atama isaretini gorunce once esitlihgin sag tarafini yapar
        // sonra bu degeri sol taraftaki variable'a atama yapar

        yas = 2 * yas + 1;

        System.out.println("yas variable'inin 41. satirdaki degeri : " + yas); //yas variable'inin 41. satirdaki degeri : 51





    }
}
