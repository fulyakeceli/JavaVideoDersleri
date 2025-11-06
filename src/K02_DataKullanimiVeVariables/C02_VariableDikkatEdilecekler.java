package K02_DataKullanimiVeVariables;

public class C02_VariableDikkatEdilecekler {

    public static void main(String[] args) {


    // 1- bir variable icin SADECE BIR KEZ DEKLARASYON yapilabilir
    // ancak variable istendigi kadar kullanilabilir ve ATAMA yapilabilir

    int sayi = 20;

    // int sayi = 25; // hata verir

     sayi = 30; // assignment yapilabilir

        System.out.println(sayi); // 30

        sayi = sayi + 5;

        System.out.println(sayi); // 35



    // 2- Esitligin sol tarafinda SADECE VARIABLE olur
    // sag tarafinda ise deger olur

    int yas = 20;

    yas = 2 * yas + 3;

    // 2 * yas = 40 // YAPAMAYIZ
  // 20 = yas // OLMAZ




    }
}
