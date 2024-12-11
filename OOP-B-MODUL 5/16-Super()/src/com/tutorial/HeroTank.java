package com.tutorial;

public class HeroTank extends Hero{
    // atribut baru
    String nama = "Class Hero Tank";

    // overriding methood
    void cetak(){
        System.out.println("Ini adalah " + super.nama);
        super.dummyMethod();
    }
    void dummyMethod(){
        System.out.println("Ini ada di sub class");
    }
    
}
