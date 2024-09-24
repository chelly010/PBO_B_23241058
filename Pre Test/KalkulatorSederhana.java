import java.util.Scanner;
public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.println("1. Perkalian");
            System.out.println("2. Penjumlahan");
            System.out.println("3. Pembagian");
            System.out.println("4. Pengurangan");
            System.out.print("Silahkan masukan pilihan anda: ");

            int pilihan = scanner.nextInt();
            System.out.print("Masukkan bilangan pertama: ");
            double bilanganPertama = scanner.nextDouble();
            System.out.print("Masukkan bilangan kedua: ");
            double bilanganKedua = scanner.nextDouble();
            double hasil = 0;

            switch (pilihan) {
                case 1:
                    hasil = bilanganPertama * bilanganKedua;
                    System.out.println("Hasil: " + bilanganPertama + " * " + bilanganKedua + " = " + hasil);
                    break;
                case 2:
                    hasil = bilanganPertama + bilanganKedua;
                    System.out.println("Hasil: " + bilanganPertama + " + " + bilanganKedua + " = " + hasil);
                    break;
                case 3:
                    if (bilanganKedua != 0) {
                        hasil = bilanganPertama / bilanganKedua;
                        System.out.println("Hasil: " + bilanganPertama + " / " + bilanganKedua + " = " + hasil);
                    } else {
                        System.out.println("Tidak dapat membagi dengan nol!");
                    }
                    break;
                case 4:
                    hasil = bilanganPertama - bilanganKedua;
                    System.out.println("Hasil: " + bilanganPertama + " - " + bilanganKedua + " = " + hasil);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
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
    
