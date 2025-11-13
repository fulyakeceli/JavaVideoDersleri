package K06_increment_decrement;

public class C03_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int a = 20;

        // a'nin degerini olusturdugunuz bir b variable'ina atayin
        // sonra a'yi 1 artirin

        int b = a;
        a++;
        System.out.println("14. satirda a variable'inin degeri :" + a); //21
        System.out.println("b variable'inin degeri : " + b); //20


        int c = 20;

        //once c'yi 1 artirin
        // sonra c'nin degerini olusturdugunuz bir d variable'ina atayin

        c++;
        int d = c;
        System.out.println("25. satirda c ve d variable'larinin degerleri : " + c + " " + d);

        // Ayni islemleri ++ ile yapalim

        a = 20;

        //a'nin degerini b variable'ina atayin
        // sonra a'yi 1 artirin

        b = a++;

        System.out.println("36 satirda a : " + a + " " + "36. satirda b :" + b); //a:21 b:20

        c = 20;

        //once c'yi 1 atririn sonda d variable'ina atayin

        d = ++c;

        System.out.println("44. satirda c :" +c +  " " + "44. satirda d :" + d); // c: 21 d:21
    }
}
