class BangunDatar{
    // Bangun datar persegi panjang
    double panjang;
    double lebar;

    //Construktor
    BangunDatar (double panjang, double lebar){
        this.panjang   = panjang;
        this.lebar    = lebar;
    }
    //Method menggunakan parameter tanpa return
    void setPanjang(double panjang){
        this.panjang = panjang;
    }
    void setlebar(double lebar){
        this.lebar = lebar;
    }
    void cetakhasil(){
        System.out.println("Panjang : " + this.panjang);
        System.out.println("Lebar   : " + this.lebar);
    }
    // Method dengan parameter dan return
    Double hitungLuas(){
        return this.panjang * this.lebar;
    }
    Double hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
    }

}
public class App {
    public static void main(String[] args) throws Exception {
        // Membuat Objek
        BangunDatar bgndtr_1 = new BangunDatar(0,0);

        //memanggil method mengguanakan parameter tanpa return
        bgndtr_1.setPanjang(10);
        bgndtr_1.setlebar(3);
        bgndtr_1.cetakhasil();

        // Memanggil method menggunakan parameter dan return
        System.out.println("============================");
        Double hasilLuas = bgndtr_1.hitungLuas();
        System.out.println("Hasil Luas persegi panjang adalah panjang x lebar          : " + hasilLuas);
        Double hasilKeliling = bgndtr_1.hitungKeliling();
        System.out.println("Hasil Keliling persegi panjang adalah 2 x (panjang + lebar): " + hasilKeliling);
    }
}