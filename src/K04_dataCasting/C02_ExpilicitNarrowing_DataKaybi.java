package K04_dataCasting;

public class C02_ExpilicitNarrowing_DataKaybi {

    public static void main(String[] args) {

        // asagidaki sayilari int bir variable'a atayip yazdirin

        double db1 = 34.01;
        double db2 = 45.99;
        float fl1 = 23.7F;

        int sayi = (int) db1;
        System.out.println("34.01'in int'a cast edilmis degeri :"+ sayi); //34

        sayi = (int) db2;
        System.out.println("45.99'un int'a cast edilmis degeri :" + sayi); //45

        sayi = (int) fl1;
        System.out.println("23.7'nin int'a cast edilmis degeri :" + sayi); // 23

        // ondalikli sayiyi tam sayiya cevirirsek ondalikli kismi gider ve data kaybi olur



        // asagidaki sayilari byte data turunde bir variable'a atayip yazdirin
        int sayi1 = 29;
        short sayi2 = 130;
        long sayi3V = 140;
        float sayi4= 256F;
        double sayi5 = 530;

        byte byt1 = (byte)sayi1;
        System.out.println("29'un byte'a cast edilmis degeri:" + byt1); //29

        byte byt2 = (byte)sayi2;
        System.out.println("130'un byte'a cast edilmis degeri:" + byt2); //-126

        byte byt3 = (byte) sayi3V;
        System.out.println("140'in b yte'a cast edilmis degeri:" + byt3); //-116


    }
}
