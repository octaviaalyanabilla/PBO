

package TugasTeori;

/**
 *
 * @author Z1402
 */
public class MainBangunDatar {
    public static void main(String[] args) {
        BangunDatar bg = new BangunDatar();
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 4;
        pp.lebar = 2;
        
        Lingkaran lk = new Lingkaran();
        lk.r = 22;
        
        Segitiga sg = new Segitiga();
        sg.alas = 5;
        sg.tinggi = 8;
        sg.m = 6;
        
        bg.luas();
        bg.keliling();
        
        pp.luas();
        pp.keliling();
        
        lk.luas();
        lk.keliling();
        
        sg.luas();
        sg.keliling();
    }
}
