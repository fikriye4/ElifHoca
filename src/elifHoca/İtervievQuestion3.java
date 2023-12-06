package elifHoca;

import java.util.Scanner;

public class İtervievQuestion3 {
    public static void main(String[] args) {
       /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir pozitif bir sayi giriniz");
        int sayi=scan.nextInt();
        boolean asalMi=true;
        if (sayi>=2){
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    asalMi=false;
                    break;
                }

            }
            if (asalMi) System.out.println("sayi asaldir");
            else System.out.println("sayi asal değildir");

        }
    }
}
