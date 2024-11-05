import java.util.Scanner;
class Kalkulator {
    public double hitungPerkalian(double a, double b) {
        return a * b;
    }
    public double hitungPenjumlahan(double a, double b) {
        return a + b;
    }
    public double hitungPembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Bilangan pertama tidak dapat di bagi dengan NOL");
        }
    }
    public double hitungPengurangan(double a, double b) {
        return a - b;
    }
}
class Tampilan {
    private Scanner scanner = new Scanner(System.in);
    private Kalkulator kalkulator = new Kalkulator();

    public void tampilkanMenu() {
        boolean lanjut = true;

        while (lanjut) {
            // Menentukan Pilihan Menu
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.println("1. Perkalian");
            System.out.println("2. Penjumlahan");
            System.out.println("3. Pembagian");
            System.out.println("4. Pengurangan");
            System.out.print("Silahkan masukan pilihan anda: ");

            // Memasukan bilangan atau nilai pertama dan kedua
            int pilihan = scanner.nextInt();
            System.out.print("Masukkan bilangan pertama: ");
            double bilanganPertama = scanner.nextDouble();
            System.out.print("Masukkan bilangan kedua: ");
            double bilanganKedua = scanner.nextDouble();
            double hasil = 0;
            try {
                switch (pilihan) {
                    case 1:
                        hasil = kalkulator.hitungPerkalian(bilanganPertama, bilanganKedua);
                        System.out.println("Hasil Perkalian: " + bilanganPertama + " * " + bilanganKedua + " = " + hasil);
                        break;
                    case 2:
                        hasil = kalkulator.hitungPenjumlahan(bilanganPertama, bilanganKedua);
                        System.out.println("Hasil Penjumlahan: " + bilanganPertama + " + " + bilanganKedua + " = " + hasil);
                        break;
                    case 3:
                        hasil = kalkulator.hitungPembagian(bilanganPertama, bilanganKedua);
                        System.out.println("Hasil Pembagian: " + bilanganPertama + " / " + bilanganKedua + " = " + hasil);
                        break;
                    case 4:
                        hasil = kalkulator.hitungPengurangan(bilanganPertama, bilanganKedua);
                        System.out.println("Hasil Pengurangan: " + bilanganPertama + " - " + bilanganKedua + " = " + hasil);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Apakah ingin lanjut? (y/n): ");
            char lanjutkan = scanner.next().charAt(0);
            if (lanjutkan != 'y' && lanjutkan != 'Y') {
                lanjut = false;
            }
        }
        System.out.println("Terima kasih!");
        scanner.close();
    }
}
public class App {
    public static void main(String[] args) {
        Tampilan tampilan = new Tampilan();
        tampilan.tampilkanMenu();
    }
}
