package elifHoca;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int sayi= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            mukemmelSayi(sayi);
        }
        mukemmelSayi(sayi);
    }

    private static void mukemmelSayi(int sayi) {
        int toplam=0;
        for (int i = 1; i <sayi ; i++) {//1 den baslıyor burada bölenlerı kontrol
            //edecegiz.sayı dahil değil dediği için<=yapmadık
            if (sayi%i==0){//sayının herhangi bir böleni varsa toplama ekle
             toplam+=i;
                System.out.print(i+" ");
            }
        }
        if (toplam==sayi){//bölenlerintoplamı sayıya eşitse
            System.out.print(sayi+"\nmükemmel sayıdır");

        }else{
            System.out.print(sayi+"mükemmel sayı degildir");
        }
    }

}
