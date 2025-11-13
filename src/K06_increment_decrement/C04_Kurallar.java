package K06_increment_decrement;

public class C04_Kurallar {


    public static void main(String[] args) {

          /*
            ++ ve --'nin ozel bir kullanimi vardir
            EGER bir satirda sadece ++a veya a++ varsa,
            ikisi de ayni islevi gorur, a'nin degerini bir artirirlar.

            ayni sekilde bir satirda sadece --a veya a-- varsa
            ayni islevi yapip a'yi bir azaltirlar.

            Farklari ++ ve -- kullanilan satirda
            baska bir islem daha yapilirsa ortaya cikar

            ++ veya -- 'nin diger islemden once mi sonra mi yapilacagina
            ++ veya -- 'nin variable'dan once veya sonra yazilmasina
            gore karar veririz.

            --a , ++b   ++ veya -- variable'dan once yazilmissa
                        once artirma veya azaltma yapilir, sonra diger islem yapilir

            a++ , b--   ++ veya -- variable'dan sonra yazilmissa
                        artirma veya azaltma sonra yapilir, once diger islem yapilir

         */

        int a = 20;
        int b = 40;

        a++;
        b--;

        System.out.println("36.satirda a : " + a + ", b : " + b); // 21 - 39


        ++a;
        --b;

        System.out.println("41.satirda a : " + a + ", b : " + b); // 22 - 38





        System.out.println(a++);// 22 // once a'nin degerini yazdirir sonra 1 artiririz


        System.out.println("51.satirda a : " + a + ", b : " + b); // 23 - 38 // burada artik a 23 olur







        System.out.println(++a);// 24 //a'yi once artir sonra yazdir


        System.out.println("62.satirda a : " + a + ", b : " + b); // 24 - 38





//        System.out.println(b--);//38
//
//        System.out.println("56.satirda a : " + a + ", b : " + b); //a: 24 b:37


//        System.out.println(--b);//36
//
//        System.out.println("61.satirda a : " + a + ", b : " + b); // a: 24 b: 36


        System.out.println("78.satirda a : " + a + ", b : " + b); // 24 - 38



        a = b++;



        System.out.println("86.satirda a : " + a + ", b : " + b); // 36 - 37



        a= ++b;


        System.out.println("93.satirda a : " + a + ", b : " + b); // 38 - 38




        b = a++ / 2 ;



        System.out.println("102.satirda a : " + a + ", b : " + b); // b:19 - a: 39







//        b = ++a / 2 ;
//
//        System.out.println("84.satirda a : " + a + ", b : " + b); // b: 20 a:40



    }
}

