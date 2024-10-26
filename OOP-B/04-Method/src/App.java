class Mahasiswa{
    // Data member
    String nama;
    String NIM;

    //Construktor
    Mahasiswa (String nama, String NIM){
        this.nama   = nama;
        this.NIM    = NIM;
    }
    //Method tanpa return dan tanpa parameter
    void cetak(){
        System.out.println("Nama    : " + this.nama);
        System.out.println("NIM     : " + this.NIM);
    }
    //Method menggunakan parameter tanpa return
    void setNama(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }
    //Method tanpa parameter menggunakan returm
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    // Method dengan parameter dan return
    String sayHallo(String pesan){
        return"Hallo.." + this.nama + pesan;
    }
    
}
public class App {
    public static void main(String[] args) throws Exception {
         //Memanggil method tanpa parameter dan tanpa return
         System.out.println("memanggil method tanpa mengguanakan parameter tanpa return");
        Mahasiswa mhs_1 = new Mahasiswa("Chelly", "23241058");
        mhs_1.cetak();

        System.out.println(" ");
        System.out.println("memanggil method mengguanakan parameter tanpa return");
        //memanggil method mengguanakan parameter tanpa return
        mhs_1.setNama("Badboy","23241010");
        mhs_1.cetak();
        
        // Memanggil method tanpa parameter tetapi menggunakan return
        System.out.println(" ");
        System.out.println("memanggil method tanpa parameter tetapi menggunakan return");
        System.out.println(mhs_1.getNama());
        System.out.println(mhs_1.getNIM());
        
        // Memanggil method menggunakan parameter dan return
        System.out.println(" ");
        System.out.println("memanggil method menggunakan parameter dan menggunakan return");
        String pesan = mhs_1.sayHallo(" Sukses Belajar OOP");
        System.out.println(pesan);
    }
}