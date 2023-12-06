package _Interviev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Deneme {
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
        Scanner scan=new Scanner(System.in);
        ArrayList<String>renkler=new ArrayList<>(Arrays.asList("red","Blue","White"));


        for (int i = 0; i < renkler.size() ; i++) {
            System.out.println(renkler.get(i));

        }

        ilkIdexeElemanEkle(renkler);

        
    }//main sonu

    private static void ilkIdexeElemanEkle(ArrayList<String> renkler) {
    }


}



