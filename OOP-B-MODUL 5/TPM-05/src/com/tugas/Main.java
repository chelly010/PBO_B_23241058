package com.tugas;

public class Main {
    public static void main(String[] args) {
        
    // membuat objek dan mencetak
    Persegi persegi1 = new Persegi(4);
    persegi1.cetak();

    Lingkaran lingkaran1 = new Lingkaran(2);
    lingkaran1.cetak();

    PersegiPanjang persegiPanjang1 = new PersegiPanjang(4, 6);
    persegiPanjang1.cetak();

    Segitiga segitiga1 = new Segitiga(5, 7);
    segitiga1.cetak();
    }
}
