package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C05_CemberinCevresiniYazdirma {

    // Kullanicidan bir cemberin yaricapini alip,
    //cevresini ve alanini yazdirin
    // cevre = 2 * PI * yaricap , alan = PI * yaricap * yaricap

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yaricapi cm olarak giriniz...");
        double yariCap = scanner.nextDouble();

        System.out.println("cemberin cevresi : " + (2 * 3.14 * yariCap) +
                "\n cemberin alani :" + (3.14 * yariCap * yariCap));

       // ucgenin cevresi : 18.84
       // ucgenin alani :28.259999999999998
    }
}
