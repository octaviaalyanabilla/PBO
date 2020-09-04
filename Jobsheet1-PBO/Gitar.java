
package PBOPrak1;


public class Gitar {
    private String jenis, nama;
    private int panjang;
    public void jenis(String newValue){
        jenis = newValue;
    }
    public void nama(String newValue){
        nama = newValue;
    }
    public void tambahPanjang(int increment){
        panjang = panjang + increment;
    }
    public void kurangPanjang(int decrement){
        panjang = panjang - decrement;
    }
    public void cekStatus(){
        System.out.println("Jenis: " + jenis);
        System.out.println("Nama: " + nama);
        System.out.println("Tinggi/Panjang: " + panjang);
    }
}
