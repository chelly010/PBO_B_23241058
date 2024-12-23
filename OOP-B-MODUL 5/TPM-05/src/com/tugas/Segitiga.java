package com.tugas;

public class Segitiga extends BangunDatar{
    
    // membuat atribut pada sub class
    float alas;
    float tinggi;

    //membuat construktor pada sub class
    public Segitiga (float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    float luas(){
        return 0.5f*alas*tinggi;
    }
    float keliling(){
        return 3*alas;
    }

    // membuat method cetak
    void cetak(){
        System.out.println("\nLuas Segitiga    : "+ luas());
        System.out.println("Keliling Persegi : "+ keliling());
    }
}
