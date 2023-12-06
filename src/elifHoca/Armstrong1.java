package elifHoca;

import java.util.Scanner;

public class Armstrong1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        String strSayi=scan.next();
        ArmstrongMethod(strSayi);
    }

    private static void ArmstrongMethod(String strSayi) {
        String basamak[]=strSayi.split("");
        int toplam=0;
        for (int i = 0; i < basamak.length ; i++) {
            toplam+=Math.pow(Integer.valueOf(basamak[i]), basamak.length);

        }
        if (Integer.valueOf(strSayi)==toplam)
            System.out.println("bu bir armstrong sayıdır");
        else System.out.println("bu bir armstrong sayı değildir");
    }
}
