package elifHoca;

import java.util.Scanner;

public class ArmstrongNumber {
    private static object girilenSayiyaKadarOlanArmstrong;

    //1 den baslayarak girilen sayıya kadar her bir tamsayının armstrong
    //sayı olup olmadığını gösteren
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= scan.nextInt();
        armstrong(sayi);
    }

    private static void armstrong(int n) {
        int sayininKupleriToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=n;
        while (n>0) {
            basamaktakiSayi = n % 10;
            sayininKupleriToplami = sayininKupleriToplami + (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            n = n / 10;
        }
        if (girilenSayi== sayininKupleriToplami)
            System.out.println(girilenSayi+"sayısı armstrong sayıdır");
        else System.out.println(girilenSayi+"sayısı armstrong sayı değildir");
        }

    private static void setGirilenSayiyaKadarOlanArmstrong(int sayi) {
        for (int i = 1; i <=sayi ; i++) {
            armstrong(i);

        }

    }

    private static class object {
    }
}

