
package Latihan;


public class NilaiMahasiswa {
    public String nama;
    public String kelas;
    public String matkul;
    public String nilai;
    public int sks;
    public int nim;
    
    public void tampilData(){
        System.out.println("===========================");
        System.out.println("    NILAI MAHASISWA ");
        System.out.println("===========================");
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Kelas : "+kelas);
        System.out.println("Nama Mata Kuliah: "+matkul);
        System.out.println("SKS : "+sks);
        System.out.println("Nilai : "+nilai);
        System.out.println("===========================");
    }
}
