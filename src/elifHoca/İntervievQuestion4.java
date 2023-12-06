package elifHoca;

import java.util.Scanner;

public class İntervievQuestion4 {
    public static void main(String[] args) {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan=new Scanner(System.in);
        String pin="said.12345";;
        int girişHakki=4;
        System.out.println("*****Hosgeldin*****");
        while (true) {
            System.out.println("pin kodu giriniz:");
            String girilenPin=scan.nextLine();
            if (pin.equals(girilenPin)){
                System.out.println("basarılı giriş yaptınız...");
                break;

            }else{
                System.out.println("yalniş giriş yaptınız...");
                girişHakki--;
                System.out.println("kalan giriş hakkınız:"+girişHakki);
                if (girişHakki==0){
                    System.out.println("giriş hakkınız kalmadı...sim kartınız bloke oldu");
                    break;

                }
            }
        }
        }

    }

