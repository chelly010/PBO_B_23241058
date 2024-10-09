// class polos tanpa constructor
class Polos {
    // atribut objec
    String dataString;
    int dataInterger;
}

// membuat dengan onstructor
class Mahasiswa {
    // atribut
    String nama;
    String NIM;
    String prodi;
    
    // costructor
    // tidak memiliki return value/ nilai balik
    // method yang pertama kali dipanggil saat objec pertamakali
    Mahasiswa(String inputNama, String inputNIM, String inputprodi) {
        // mengisi data
        nama = inputNama;
        NIM = inputNIM;
        prodi = inputprodi;

        // menyetak data
        System.out.println("=========================");
        System.out.println("nama mahasiswa  : "+ nama);
        System.out.println("NIM             : "+ NIM);
        System.out.println("prodi           : "+ prodi);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // pembuatan objek atau instansiasi objek
        Polos polos_1 = new Polos();
        Polos polos_2 = new Polos();

        // isi atribut
        polos_1.dataString = "polos";
        polos_2.dataInterger = 10;

        // cetak objek
        System.out.println(polos_1.dataString);
        System.out.println(polos_2.dataInterger);

        // pembuatan objec mahasiswa
        Mahasiswa mhs_1 = new Mahasiswa("Chelly", "23241058", "PTI");
        Mahasiswa mhs_2 = new Mahasiswa("BadboY", "23241029", "Biologi");
        Mahasiswa mhs_3 = new Mahasiswa("jony", "23241021", "Matematika");
    }
}