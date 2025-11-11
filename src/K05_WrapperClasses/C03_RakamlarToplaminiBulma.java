package K05_WrapperClasses;

import java.net.Socket;
import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {


        //Kullanicidan 3 basamakli pozitif bir tamsayi isteyin
        // sayinin rakamlar toplamini bulun
        // ornek input = 245 ise output = 11

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt(); //245
        int birlerBasamagi =0;
        int rakamlarToplami =0;

        birlerBasamagi = sayi % 10; //5
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // 0+5 =5
        sayi = sayi /10; //24

        birlerBasamagi = sayi %10; //4
        rakamlarToplami = rakamlarToplami +birlerBasamagi; // 0+5+4=9
        sayi = sayi /10; //2

        rakamlarToplami = rakamlarToplami +sayi; //0+5+4+2= 11

        System.out.println("Rakamlar toplami :" + rakamlarToplami);











    }
    }



