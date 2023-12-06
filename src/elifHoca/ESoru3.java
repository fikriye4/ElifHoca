package elifHoca;

import java.util.Scanner;

public class ESoru3 {
    public static void main(String[] args) {
//4 işlem yapan bir hesap makinesi yapalım
     //kullanıcıdan yapacagı işlemi işlem sembolu ıle secmesını saglayalım
     //kullanıcıdan ıkı sayı gırmesını ısteyın
     //gırılen ıkı sayı ve secılen işleme gore dogru sonucu ekrana yazdıralım
        Scanner scan=new Scanner(System.in);
        System.out.print("yapacagınız işlemi + * - / olarak gırınız");
        char işlem=scan.next().charAt(0);

        System.out.println("bırıncı sayi:");
        double num1=scan.nextDouble();
        System.out.println("ikinci sayi:");
        double num2= scan.nextDouble();
       HesapMakınesi( işlem,num1,num2);
    }
    private static void HesapMakınesi(char işlem, double num1, double num2) {
        switch (işlem) {
            case 'a':
                System.out.println(num1 + "+num2" + (num1 + num2));
                break;
            case 'b':
                System.out.println(num1 + "+num2" + (num1 * num2));
                break;
            case 'c':
                System.out.println(num1 + "+num2" + (num1 - num2));
                break;
            case 'd':
                System.out.println(num1 + num2 + (num1 / num2));
                break;
        }
        System.out.println("sonuc:"+(num1*num2));
        System.out.println("sonuc:"+(num1+num2));
        System.out.println("sonuc:"+(num1-num2));
        System.out.println("sonuc:"+(num1/num2));


    }
}
