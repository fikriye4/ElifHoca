package araba;

public class Araba {
   private String model;
   private String renk;
   private int yıl;
   private final int motor=2000;


    public Araba() {
    }

    public Araba(String model, String renk, int yıl, int motor) {
       // this.model = model;
        setModel(model);//this modeli istemem set model istiyrum bunu için
        //this modeli değistiriyoruz
        this.renk = renk;
        this.yıl = yıl;
       // this.motor = motor;yukarıda motora final yazdığımız için artık motor sabit
        //this motora ihtiyac yok.

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(!model.equals("toyota")) {
            System.out.println("hatalı giriş");
        }else
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }

    public int getMotor() {
        return motor;
    }

   // public void setMotor(int motor) {//yukarıda final yazdığımız için bu bilgi degiye ihtiyac yok
      //  this.motor = motor;
    //}

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yıl=" + yıl +
                ", motor=" + motor +
                '}';
    }
}
