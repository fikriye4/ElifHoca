package elifHoca;

import java.util.Scanner;

public class İntervievQuestion2 {
    public static void main(String[] args) {

        //  * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
        // * return eden metod yaziniz
        //  *
        // * ornek:  input            output
        // *         elma  2           eaea
        // *         army  3           ayayay
        //  *
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string gir");
        String str = scan.nextLine();

        System.out.println("Bır sayı giriniz:");
        int sayı = scan.nextInt();

       // ilkSonHarf(sayı, str);
        System.out.println("girilen strıng ilkSonHarf:"+(ilkSonHarf(str,sayı)));

    }//main sonu

   private static String ilkSonHarf(String str, int sayi) {
        String string = str.substring(0,1) + str.substring(str.length() - 1); //ea

        String output = "";

        for (int i = 1; i <=sayi; i++){ // ea dan kac tane yazacgim  eaeaea
            output+=string ; // b= b+s
        }
        return output;
    }

}

