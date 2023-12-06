package elifHoca;

public class DiziElemanOrt2 {
    public static void main(String[] args) {
        //dizi eleman ort.hesapla ve ort 'dan büyük olan elemanları heasapla
        //yazdır
        //input[]={1,2,3,4,5,6,7}
        //output:4;
        int arr[]={1,2,3,4,5,6,7};
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
          toplam+=arr[i];
        }
        double  ortalama=toplam/arr.length;
        System.out.println("ortalama=" +ortalama);
        System.out.println("ortalamdan büyükolan olan elemanlar: ");
        //Soruda ort dan büyük elemanları karşılaştırdığı icin gene bir döngüye ihtiyac var
        for (int i = 0; i< arr.length ; i++) {
            //ortalamadan büyük veya ortalamadan kück yazdırmak gerektiği için
            //if kullanılır
            if (arr[i]>ortalama){
                System.out.println(arr[i]+"-");

            }

        }
    }
}
