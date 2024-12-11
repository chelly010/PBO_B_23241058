package com.tutorial;

public class Main {
 
    public static void main(String[] args) {
        // membuat objek dari superclass
        Hero hero1 = new Hero();
        hero1.name = "Kakarot";
        hero1.cetak();

        // membuat objek dari sub class
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Vegeta";
        hero2.cetak();

        HeroIntell hero3 = new HeroIntell();
        hero3.name = "Picolo";
        hero3.cetak();
    }
}
