package elifHoca;

import java.util.Arrays;
import java.util.Scanner;

public class İntervievQuestin1 {
    public static void main(String[] args) {
        //Kullanıcıdan String alın
        //Stringde var olan characterin sayısını ekrana yazdırın
        //örnek:alacan==>a==3,1=1,c=1,n=1
        //abaa==> a=3 b=1
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz:");
        String str=scan.nextLine();
        //split=Her bir karakteri ayırır
        String arr[]=str.split("");//her bir karakteri ayırır
        System.out.println(Arrays.toString(arr));
        //sort sıralar
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //sayac olustur
        int counter=0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                counter++;
            }else{
                System.out.println(arr[i-1]+" ="+(counter+1));
                counter=0;
            }
            if (i==arr.length-1){
                System.out.println(arr[i]+" ="+counter+1);
            }
        }

        }


            }








