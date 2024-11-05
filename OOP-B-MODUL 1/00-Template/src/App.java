// Membuat Class Sebagai Template
class Mahasiswa{
    // Membuat Ciri-Ciri atau atribut objek
    String nama;
    String NIM;
    String Prodi;
    Double IPK;
    int umur;
}

public class App {
    public static void main(String[] args) throws Exception {

        // Instansiasi atau membuat objek
        Mahasiswa mhs_1 = new Mahasiswa();
        Mahasiswa mhs_2 = new Mahasiswa();

        // Pengisian data objek
        mhs_1.nama = "BadBoy";
        mhs_1.NIM = "23241058";
        mhs_1.Prodi = "PTI";
        mhs_1.IPK = 3.7;
        mhs_1.umur = 19;

        // Cetak Data
        System.out.println(" Nama Mahasiswa : " + mhs_1.nama);
        System.out.println(" NIM            : " + mhs_1.NIM);
        System.out.println(" Prodi          : " + mhs_1.Prodi);
        System.out.println(" IPK            : " + mhs_1.IPK);
        System.out.println(" Umur           : " + mhs_1.umur);

        System.out.println(" ");
        System.out.println("===========================");
        System.out.println(" ");

        // Pengisian data objek
        mhs_2.nama = "Raflyth";
        mhs_2.NIM = "23241059";
        mhs_2.Prodi = "PTI";
        mhs_2.IPK = 3.2;
        mhs_2.umur = 20;
 
         // Cetak Data
         System.out.println(" Nama Mahasiswa : " + mhs_2.nama);
         System.out.println(" NIM            : " + mhs_2.NIM);
         System.out.println(" Prodi          : " + mhs_2.Prodi);
         System.out.println(" IPK            : " + mhs_2.IPK);
         System.out.println(" Umur           : " + mhs_2.umur);
 


    }
}
