package com.turorial;

public class Player {
    // atribut
    private String name;
    private static int jumlahPlayer;

    // Coonstruktor
    // opsi 1 untuk membuat objek
    Player (String name){
        Player.jumlahPlayer++;
        this.name = name + " " + Player.jumlahPlayer;
    }

    // overloading constructor
    // opsi 2 untuk membuat objek menjadi default
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" +" "+ Player.jumlahPlayer;
    }

    // method 
    void cetak(){
        System.out.println("Name : " + name);
    }
}
