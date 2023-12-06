package araba;

public class Main {
    public static void main(String[] args) {
        Araba honda=new Araba();
        honda.setModel("2000");
        honda.setRenk("kırmızı");
        System.out.println("honda = " + honda);
        Araba jeep=new Araba("2000","kırmızı",2022,2000);
        System.out.println("jeep = " + jeep);
    }
}
