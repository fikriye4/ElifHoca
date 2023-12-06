package elifHoca;

import java.util.Arrays;

public class ESoru4 {
    public static void main(String[] args) {


        // public static void main(String[] args) {
        /*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        int arr[] = {2, 6, 4, 5, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=arr[i];//Aslında arr[i]=arr[i]*arr[i];demektir
        }
        System.out.println("Elemanların karesi:"+Arrays.toString(arr));
//elemanların karesi:[4, 36, 16 ,25 ,64, 81]
    }
}

