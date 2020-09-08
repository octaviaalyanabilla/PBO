
package Prak2;


public class VideoGame {
    public int id;
    public int harga;
    public int lamaSewa;
    public String namaMember;
    public String namaGame;
    
    
    public int totalHarga(){
        int total;
        total = lamaSewa * harga;
        return total;
    }
    
    public void tampilData(){
        System.out.println("-------------------------");
        System.out.println("        VidGame        ");
        System.out.println("-------------------------");
        System.out.println("Masukkan No. ID : "+id);
        System.out.println("Masukkan Nama Member : "+namaMember);
        System.out.println("Masukkan Nama Game : "+namaGame);
        System.out.println("Masukkan Harga : "+harga);
        System.out.println("Masukkan Lama Sewa (Hari) : "+lamaSewa);
        System.out.println("Masukkan Total Bayar : "+totalHarga());
        System.out.println("--------------------------");
    }
}
