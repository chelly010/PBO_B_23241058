package com.tutorial;

//import package eksternal
import com.terminal.Console;

// visibiliti default hanya bisa di akses oleh
// package(folder) yang sama
class Player {
    //variable objek
    private String nama;

    // konstruktor
    Player(String nama){
        this.nama = nama;
    }
    // method cetak
    void cetak(){
       // System.out.println("Nama : " + this.nama);
        Console.log("Meenggunakan Comsole");
        Console.log("Nama : "+ this.nama);
    }

    //Method getter
    String getNama(){
        return this.nama;
    }
}


