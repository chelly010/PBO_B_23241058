package com.tugas;

public class Persegi extends BangunDatar {

    //membuat atribut pada sub class
    float sisi;

     //membuat construktor pada sub class
    public Persegi(float sisi) {
        this.sisi = sisi;
    }
    float luas() {
        return sisi * sisi;
    }
    float keliling() {
        return 4 * sisi;
    }
    //membuat method cetak
    void cetak(){
        System.out.println("Luas Persegi     : " + luas());
        System.out.println("Keliling Persegi : " + keliling());
    }    
}
