
package Prak2;


public class Lingkaran {
    public double phi;
    public double r;
    
    public double hitungLuas(){
        double luas;
        luas = 0.5 * phi * r * r;
        System.out.println("Luas Lingkaran = "+luas);
        return luas;
    }
    public double hitungKeliling(){
        double keliling;
        keliling = 2 * phi * r;
        System.out.println("Keliling Lingkaran = "+keliling);
        return keliling;
    
        
    }
}
