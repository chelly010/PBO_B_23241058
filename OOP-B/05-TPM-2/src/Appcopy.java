class BangunDatar{
    // Data member
    double panjang;
    double lebar;

    //Construktor
    BangunDatar (double panjang, double lebar){
        this.panjang   = panjang;
        this.lebar    = lebar;
    }
    //Method tanpa return dan tanpa parameter
    void cetakhasil(){
        System.out.println("Panjang : " + this.panjang);
        System.out.println("Lebar   : " + this.lebar);
    }
    //Method menggunakan parameter tanpa return
    void setBangundatar(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
}
public class Appcopy {
    public static void main(String[] args) throws Exception {
         //Memanggil method tanpa parameter dan tanpa return
         System.out.println("memanggil method tanpa mengguanakan parameter tanpa return");
        BangunDatar bgndtr_1 = new BangunDatar(2,3);
        bgndtr_1.cetakhasil();

        System.out.println(" ");
        System.out.println("memanggil method mengguanakan parameter tanpa return");
        //memanggil method mengguanakan parameter tanpa return
        bgndtr_1.setBangundatar(4, 05);
        bgndtr_1.cetakhasil();
    
    }
}