package elifHoca;

import java.util.Arrays;
import java.util.Scanner;

public class TekrarlıSoru {
    public static void main(String[] args) {
        // verilen bir int dizisi için elemanların karelerini bulun
        //İnput{2,6,4,5,8,9}
        //output{4,36,16,25,64,81}

        int arr[]={2,6,4,5,8,9};
        for (int i = 0; i < arr.length ; i++) {
          arr[i]*=arr[i];
        }
        System.out.println("elemanların karesi:+"+ Arrays.toString(arr));
    }
}