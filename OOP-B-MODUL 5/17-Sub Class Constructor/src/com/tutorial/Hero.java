package com.tutorial;

public class Hero {
    //atribut
    String nama;
    double defensePower;
    double attackPower;

    // Constructor di super class
    Hero(String nama, double defensePower, double attackPower){
        this.nama = nama;
        this.defensePower = defensePower;
        this.attackPower = attackPower;
    }

    // Method
    void cetak(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Defense Power : " + this.defensePower);
        System.out.println("Attack Power : " + this.attackPower);
    }
}
