package com.tugas;

public class PersegiPanjang extends BangunDatar{
    
    // membuat atribut pada sub class
    float panjang;
    float lebar;
    
    //membuat construktor pada sub class
    
    public PersegiPanjang (float panjang,float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    float luas(){
        return panjang*lebar;
    }
    float keliling(){
        return 2*(panjang + lebar);
    }

    // membuat method cetak
    void cetak(){
        System.out.println("\nLuas Persegi panjang     : "+ luas());
        System.out.println("Keliling Persegi panjang : "+ keliling());
    }
}
