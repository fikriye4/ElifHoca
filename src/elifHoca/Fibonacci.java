package elifHoca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        List<Integer>fibonacci=new ArrayList<>();
        int sayi= scan.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);

        int i=1;
        if (sayi<=1){
            System.out.println("Daha büyük bir tamsayı giriniz...");
        }else {
            while (fibonacci.get(i)<sayi){//fib elemanları,sayıdan kucuk old surece bir önceki eleman ile topla
                fibonacci.add(fibonacci.get(i)+ fibonacci.get(i-1));
                i++;

            }
            if (fibonacci.get(fibonacci.size()-1)>sayi){//fibonaccideki son eleman sayıdan büyükse
                fibonacci.remove(fibonacci.size()-1);//bu elemanı kaldır
                System.out.println("Girdiğiniz sayı fibonacci dizisinde bulunmamaktadır."+
                        "\nGirilen sayıya kadar fibonacci dizisi:"+fibonacci);

            }else{
                System.out.println("Girdiğiniz sayı fibonacci dizisinde bulunmaktadır"+fibonacci);
            }
        }
    }
}
