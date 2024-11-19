class Gaji {
    // Data member atau variabel instance (semua private)
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Constructor dengan modifier public
    public Gaji() {
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.pajak = 0.0;
    }

    // Getter dan Setter untuk gajiPokok
    public int getGajiPokok() {
        return this.gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk tunjangan
    public int getTunjangan() {
        return this.tunjangan;
    }

    // Setter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk pajak
    public double getPajak() {
        return this.pajak;
    }

    // Setter untuk pajak
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Method untuk menghitung jumlah pajak dalam rupiah
    public double Pajak() {
        double totalPendapatan = gajiPokok + tunjangan;
        // jumlah pajak dalam bentuk rupiah
        return totalPendapatan * (pajak / 100);
    }

    // Method untuk menghitung gaji bersih
    public double CetakGajiBersih() {
        return (gajiPokok + tunjangan) - Pajak();
    }

    // Method untuk mencetak gaji pokok, tunjangan, pajak, jumlah pajak, dan gaji bersih
    public void cetak() {
        System.out.println("Gaji Pokok          : Rp. " + this.gajiPokok);
        System.out.println("Tunjangan           : Rp. " + this.tunjangan);
        System.out.println("Pajak persen        : " + this.pajak + "%");
        System.out.println("Pajak dalam rupiah  : Rp. " + Pajak());
        System.out.println("Gaji Bersih         : Rp. " + CetakGajiBersih());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
       // Instansiasi objek
       Gaji karyawan = new Gaji();

       // Mengisi nilai gaji pokok menggunakan setter
       karyawan.setGajiPokok(6500000);
       
       // Mengisi nilai tunjangan menggunakan setter 
       karyawan.setTunjangan(1500000);

       // Mengisi nilai pajak menggunakan setter
       karyawan.setPajak(3);

       // Cetak semua informasi
       karyawan.cetak();
    }
}