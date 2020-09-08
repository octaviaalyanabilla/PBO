
package Prak2;


public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran lk1 = new Lingkaran();
        Lingkaran lk2 = new Lingkaran();
        System.out.println("-----------------------");
        System.out.println("Hitung Luas & Keliling");
        System.out.println("-----------------------");
        lk1.phi = 3.14;
        lk1.r = 21;
        lk1.hitungLuas();
        lk1.hitungKeliling();
        System.out.println("-----------------------");
        lk2.phi = 22/7;
        lk2.r = 14;
        lk2.hitungLuas();
        lk2.hitungKeliling();
        System.out.println("-----------------------");
    }
  
}
