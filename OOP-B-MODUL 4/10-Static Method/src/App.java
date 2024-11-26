import java.util.ArrayList;

class Player{
    // variable objek
    private String nama;
    // variable static
    private static int numberOfPlayer;
    // Arry Variable
    private static ArrayList<String> namaList = new ArrayList<String>();

    // Konsstruktor 
    Player(String nama){
    this.nama = nama;
    Player.numberOfPlayer++;
    Player.namaList.add(this.nama);

    }

    // Method static Cetak NUmberOfPlayer
    static void showNumberOfPlayer(){
        System.out.println("Numbr Of Player : " + Player.numberOfPlayer);
    }

    void cetak(){
        System.out.println("player nama : ");
    }

    // Method statuc Getter
    static ArrayList<String> getName(){
        return Player.namaList;
    }
}


public class App {
    public static void main(String[] args) throws Exception {

    Player player1 = new Player("Chelly");
    Player player2 = new Player("Adam");
    Player player3 = new Player("Ridho");
    Player player4 = new Player("Bima");
    Player player5 = new Player("Alex");
    Player player6 = new Player("Nando");
    Player player7 = new Player("Fajar");


    Player.showNumberOfPlayer();
    player1.cetak();

    // Panggil array nama obejek
    System.out.println("Nama : " + Player.getName() );




    }
}
