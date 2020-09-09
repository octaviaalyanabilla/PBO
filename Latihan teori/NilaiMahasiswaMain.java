
package Latihan;


public class NilaiMahasiswaMain {
    public static void main(String[] args) {
        NilaiMahasiswa nm1 = new NilaiMahasiswa();
        NilaiMahasiswa nm2 = new NilaiMahasiswa();
        NilaiMahasiswa nm3 = new NilaiMahasiswa();
        
        nm1.nama = "Dian";
        nm1.nim = 194172001;
        nm1.kelas = "TI-2C";
        nm1.matkul = "Desain Interface";
        nm1.sks = 4;
        nm1.nilai = "A";
        nm1.tampilData();
        
        System.out.println("");
        
        nm2.nama = "Ryan";
        nm2.nim = 194172044;
        nm1.kelas = "TI-2C";
        nm2.matkul = "Matematika Diskrit";
        nm2.sks = 5;
        nm2.nilai = "B+";
        nm2.tampilData();
        
        System.out.println("");
        
        nm3.nama = "Boni";
        nm3.nim = 194172056;
        nm3.kelas = "TI-2C";
        nm3.matkul = "Kecerdasan Buatan";
        nm3.sks = 3;
        nm3.nilai = "B+";
        nm3.tampilData();
        
    }
}
