package elifHoca;

import java.util.Scanner;

public class ESoru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yapacagınız 4işlemi * + - /olarak sec:");
        char islem=scan.next().charAt(0);

        System.out.print("birinci sayi:");
        double num1= scan.nextDouble();

        System.out.print("ikinci sayi:");
        double num2= scan.nextDouble();

        hesapMakinesi(islem,num1,num2);


    }//main bitti
//default Switch in altına yazdırılabilir
    private static void hesapMakinesi(char islem, double num1, double num2) {
        if (islem == '-' || islem == '*' || islem == '+' || islem == '/')
            switch (islem) {
                case '+':
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                    break;
                case '/':
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                    break;
                default:
            }

        {


        }
            System.out.println("Hatalı gırıs");
        }
    }


