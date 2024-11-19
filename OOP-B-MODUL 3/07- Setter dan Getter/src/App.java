class data{
    // Data member atau variable instant
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;


    // membuat construktor, dengan modifier public
    public data(){
        this.intPublic = 0;
        this.intPrivate = 100;

    }
    //Getter
    public int getIntprivate(){
        return this.intPrivate;
    }
    // Setter
    public void setdoublePrivate(double value){
        this.doublePrivate = value;
    }
    // cetak
    void cetak(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
       // instansiasi objek
       data objeck = new data();

       // membaca dan menulis menggunakan public
       //tulis
       objeck.intPublic = 5;
       // membaca
       System.out.println("Public : " + objeck.intPublic);

       // membaca menggunakan getter
       int angka = objeck.getIntprivate();
       System.out.println("Getter : "+ angka);

       // menulis menggunakan setter
       objeck.setdoublePrivate(0.5);
       objeck.cetak();
    }
}