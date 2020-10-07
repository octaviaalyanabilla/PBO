
package Tugas;

/**
 *
 * @author Z1402
 */
public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.setNama("Irwan");
        d1.setSKS(12);
        
        Pegawai p1 = new Pegawai();
        p1.setNama("Budi");
        
        DaftarGaji dg = new DaftarGaji(3);
        dg.addPegawai(d1);
        dg.addPegawai(p1);
        dg.printSemuaGaji();
    }
}
