package com.tutorial;

import com.terminal.Console;

import static com.terminal.Console.log;

class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("Chelly");
        player1.cetak();
        Console.log("Menampilkan data dari console");
        Console.log("Player Nama : " + player1.getNama());

        log("menggunakan static log");
        log(player1.getNama());
    }
}
