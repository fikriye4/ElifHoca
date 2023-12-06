package elifHoca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class İntervewQuestions8 {
    public static void main(String[] args) {
       // ArrayList<Integer> ve Set<Integer>ogelerini parametre olarak kabul eden bir yontem
        //olustur.Tüm öğeleri ArrayList'ten Set 'e ekleyin.
        //Sour2=Set<Character>ye char degişkenlerini parametre olarak alan bir yontem oluşturun
        //ve tum karakterleri sete ekleyin.
      ArrayList<Integer>arrList=new ArrayList<>();
      arrList.add(10);
      arrList.add(20);
      arrList.add(30);
      arrList.add(10);
      arrList.add(20);
      arrList.add(50);
        System.out.println("arrList = " + arrList);
        //Soru Array'i SET'e eklememi istiyor.
        Set<Integer>set=new HashSet<>();
        System.out.println("set = " + set);//[]Bunu su an calıştırsak bize boş bir set verir
        //Ama biz bunun içini dolduracagız.
        arrayListtenSeteDonustur(arrList,set);//Arrayin ismini ve set'in ismini methodun içine yazacagız
        System.out.println("set = " + set);//HasSette sıralama yok karısık da yazabilir
        //Setler unıge eleman kabul eder.Yani 10'dan ıkı tane olmasına ragmen sadece bir tane yazdırdı
//     //Bolum2
        Set<Character>characterSet=new HashSet<>();
        karakterleriSeteEkle(characterSet,'A','B','r','q');
        System.out.println("characterSet = " + characterSet);
    }

    private static void karakterleriSeteEkle(Set<Character> characterSet, Character...chars) {
        for (int i = 0; i <chars.length ; i++) {
            characterSet.add(chars[i]);

        }
    }

    private static void arrayListtenSeteDonustur(ArrayList<Integer> arrList, Set<Integer> set) {
      for (Integer sayi:arrList){//for Integer sayiyi arrListten alacak set'e ekleyecek
          set.add(sayi);
      }
    }
}
