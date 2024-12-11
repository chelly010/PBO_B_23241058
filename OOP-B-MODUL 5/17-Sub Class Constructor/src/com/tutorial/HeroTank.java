package com.tutorial;

public class HeroTank extends Hero{
    // atribut
    String atribut = "Tank";

    // constructor di dalam Sub Class
    HeroTank(String nama, double defese, double attack){
        super(nama, defese, attack);
    }
    //overriding cetak
    void cetak(){
        System.out.println("Hero : " + this.atribut);
        super.cetak();
    }
}
