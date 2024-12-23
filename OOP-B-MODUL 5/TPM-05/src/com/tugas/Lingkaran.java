package com.tugas;

public class Lingkaran extends BangunDatar {
    
    // membuat atribut pada sub class
    float r;

    // membuat construktor pada sub class
    Lingkaran(float r) {
        this.r = r;
    }
    float luas() {
        return (float) (Math.PI * r*r);
    }
    float keliling() {
        return (float) (2 * Math.PI * r);
    }
    
    // membuat method cetak
    void cetak(){
        System.out.println("\nLuas Lingkaran     : "+ luas());
        System.out.println("keliling Lingkaran : "+ keliling());
    }
}