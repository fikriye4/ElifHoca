import java.util.Scanner;

public class ESoru_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yapacagın işlemi+ * - /olarak girin");
        char işlem=scan.next().charAt(0);
        System.out.println("birinci sayıyı girin");
        double num1= scan.nextDouble();
        System.out.println("ikinci  sayıyı girin");
        double num2= scan.nextDouble();
        hesapMakinesi(işlem,num1,num2);

    }

    private static void hesapMakinesi(char işlem, double num1, double num2) {
        switch (işlem){
            case'a':
                System.out.println(  (num1 + num2));break;
            case'b':
                System.out.println( (num1 / num2));break;
            case 'c':
                System.out.println((num1 * num2));break;
            case 'd':
                System.out.println( (num1 - num2));break;
        }
        System.out.println("toplama sonucu:"+ (num1 + num2));
        System.out.println("çıkarma sonucu:"+ (num1 * num2));
        System.out.println("çarpma sonucu:"+ (num1 / num2));
        System.out.println("bölme sonucu:"+ (num1 - num2));

    }
}
