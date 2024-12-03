package com.tutorial;

// keywoard untuk import package eksternal
import com.terminal.Console;



class Main{
    public static void main(String[] args) {
      //Membuat objek
      Player player1 = new Player("Satya");
      Player player2 = new Player("Chelly");
      Player player3 = new Player("Aziz");
      player1.cetak();
      player2.cetak();
      player3.cetak();

      Console.log("Hallo");
    }
}

    
