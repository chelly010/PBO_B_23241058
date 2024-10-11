// Kalkulator dengan konstruktor
class Kalkulator{
    // Atribut kalkulator
    double angka1;
    double angka2;
    double penjumlahan;
    double pengurangan;
    double perkalian;
    double pembagian;

    // Konstruktor untuk menginisialisasi angka-angka
    Kalkulator(double inputAngka1, double inputAngka2) {
       angka1 = inputAngka1;
       angka2 = inputAngka2;
       penjumlahan = angka1 + angka2;
       pengurangan = angka1 - angka2;
       perkalian   = angka1 * angka2;
       pembagian   = angka1 / angka2;

    // Menampilkan hasil dari berbagai operasi
    System.out.println("==================");
    System.out.println("    KALKULATOR    ");
    System.out.println("==================");
    System.out.println(" Penjumlahan: " + penjumlahan);
    System.out.println(" Pengurangan: " + pengurangan);
    System.out.println(" Perkalian  : " + perkalian);

    // catatan jika bilangan ke dua nilainya 0, maka nilai pertama tidak bisa di bagi dengan nilai kedua
    if (angka2 != 0) {
    pembagian   = angka1 / angka2;
    System.out.println(" Pembagian  : " + pembagian);
       } else {
           System.out.println("==============================================");
           System.out.println("|| Nilai awal tidak bisa di bagi dengan NOL ||");
           System.out.println("==============================================");
       }
    System.out.println("==================");
 }          
}
public class  App1{
   public static void main(String[] args) {
       // Membuat objek kalkulator dengan nilai
       Kalkulator Kalkulator1 = new Kalkulator(10, 0);
   }
}