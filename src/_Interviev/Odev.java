package _Interviev;

import java.util.ArrayList;

public class Odev {
    public static void main(String[] args) {
        // Part1:
        // Create an arraylist of Strings
        // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
        // print out all the elements, each element on new line

        // Part2:
        // Create a method that accepts a String arraylist and a String as parameters
        // method should add the element at the first index of arraylist

        // Part3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]
        //Part:1
        ArrayList<String> renkler = new ArrayList<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Yellow");
        renkler.add("Black");
        System.out.println("renkler = " + renkler);//Biden alt alta yazdırmamızı istiyor.herbir elemanı ayrı ayrı yazmak için for kullanıyoruz
        for (int i = 0; i < renkler.size(); i++) {//soutta yazdırıyoruz.
            //Listeden bir elemana ulasmak icin get methodunu kullanıyoruz
            System.out.println(renkler.get(i));//get()Liste elemanlarını getirir
        }
        //Part:2
        //bizden method create etmemizi istiyor
        ilkIndexeEkle(renkler, "white");//ilkindexe eklemek istediğim rengi girdim
        System.out.println(renkler);
        sonIndextenOnceEkle(renkler,"Pink");
        System.out.println(renkler);



    }//main sonu

    private static void sonIndextenOnceEkle(ArrayList<String> renkler, String pink) {
        renkler.add(renkler.size()-1,pink);//bunu renkler,.,size,-1 sırası ile yazcagım

    }


    private static void ilkIndexeEkle(ArrayList<String> renkler, String white) {
        renkler.add(0,white);
    }
}