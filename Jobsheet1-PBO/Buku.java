
package PBOPrak1;


public class Buku {
    private String judul, jenis;
    private int jumlahHalaman, harga;
    public void judul(String newValue){
        judul = newValue;
    }
    public void jenis(String newValue){
        jenis = newValue;
    }
    public void tambahJumlahHalaman(int increment){
        jumlahHalaman = jumlahHalaman + increment;
    }
    public void kurangJumlahHalaman(int decrement){
        jumlahHalaman = jumlahHalaman - decrement;
    }
    public void tambahHarga(int increment){
        harga = harga + increment;
    }
    public void kurangHarga(int decrement){
        harga = harga - decrement;
    }
    public void cekStatus(){
        System.out.println("Judul: " + judul);
        System.out.println("Jenis Buku : " + jenis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Harga: " + harga);
    }
}
