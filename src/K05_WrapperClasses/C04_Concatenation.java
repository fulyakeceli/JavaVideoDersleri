package K05_WrapperClasses;

public class C04_Concatenation {

    public static void main(String[] args) {

        // Bir String ile herhangi bir primitive data turundeki degeri + toplarsak
        // Java String'in yanina geleni de String'lestirir

        System.out.println("Ali" + 3 + 4 + 5); //Ali345

        System.out.println("A" +true + 'd' + 34.5F); //Atrued34.5

        System.out.println(3 + 'a' + "Ali"); // 3+97=100 => 100Ali

        // 3 + 4 islemini 34 olarak yazdirin
        // bunu yapmanin yolu bu islemi String'lestirmektir
        // Herhangi bir seyi degistirmeden
        //Stringlestirmenin yolu da HICLIK'tir ==> ""

        System.out.println( "" + 3 + 4);


        // String'de + islemi CONCATENATION (birlestirme) demektir
        // + disinda hicbir matematiksel islem String ile kullanilamaz

        String str = "a";
        System.out.println(str + 5); //a5
       // System.out.println(str - 5); //HATA
      //  System.out.println(str * 5); //HATA
        //System.out.println(str / 5); //HATA

        //Sadece variable'lari kullanarak istenen Stringleri yazdirin
        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";
        String s4 = "";
        int a = 3;
        int b = 4;

        // 12 Java Candir

        System.out.println((a * b) + s2+ s1 + s2 + s3 );

        // 7 Java

        System.out.println((a + b) + s2 + s1);

        // 34 Candir

        System.out.println(s4+ a + b + s2 + s3);


        // Java12Candir
        System.out.println(s1 + (a * b) + s3);

        //Java34Candir
        System.out.println(s1 + s4 + a + b + s3);
    }
}
