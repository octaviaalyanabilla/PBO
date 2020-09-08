
package Prak2;


public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int disk(){
        int disk;
        disk = (int)(diskon);
        return disk;
    }
    
    public int hitungHargaJual(){
        int hargaJual;
        hargaJual = (int)(hargaDasar - (hargaDasar*diskon/100));
        return hargaJual;
    }
    public void tampilData(){
        System.out.println("---------------------------");
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Barang : "+hargaDasar);
        System.out.println("Diskon : "+disk()+"%");
        System.out.println("Total : "+hitungHargaJual());
        System.out.println("----------------------------");
    }
}
