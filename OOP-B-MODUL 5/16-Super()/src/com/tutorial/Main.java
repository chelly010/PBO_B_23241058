package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // membuat objek dari super class
        Hero hero1 = new Hero();

        // membuat objek dari sub class
        HeroTank hero2 = new HeroTank();
        hero1.cetak();
        hero2.cetak();
    }
}
