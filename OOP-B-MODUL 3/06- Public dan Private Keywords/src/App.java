class Player{
    // Data member atau  variable instan
    String nama; // modifiers default (bisa di akses dari luar class)

    public int exp;
    private int health;
    // membuat construktor, tanpa modifier acces
    Player(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health = health;

     // private tidak bisa di akses oleh luar class
    }

    //Method, default modifier acces
    void cetak(){
        kurangEXP();
        System.out.println("Player  : "+ this.nama);
        System.out.println("exp     : "+ this.exp);
        System.out.println("Health  : "+ this.health);
    }

    // method, public modifier access
    public void setUbahHealth(int healthBaru){
        this.health = healthBaru;
    }
    // method, private modifier access
    private void kurangEXP(){
        this.exp -= 1; // exp = exp -1
    }    
}





public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        Player player1 = new Player("chelly", 50, 100);

        //modifier default
        // membaca data
        System.out.println(player1.nama);
        player1.nama = "adam";
        System.out.println(player1.nama);

        //modifier public
        //membaca data
        System.out.println(player1.exp);
        player1.exp = 75;
        System.out.println(player1.exp);

        // // akses private
        // // membaca data
        // System.out.println(player1.health);
        // // Menulis data
        // player1.health = 120;
        // System.out.println(player1.health);

        // method default
        player1.cetak(); // method baca
        player1.setUbahHealth(120); // method tulis
        player1.cetak();

        // method private
        //player1.kurangEXP();
        player1.cetak();
    }
}