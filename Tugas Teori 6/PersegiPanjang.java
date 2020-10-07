
package TugasTeori;

/**
 *
 * @author Z1402
 */
public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;
    
    public float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
        return luas;
    }
    public float keliling(){
        float kllg = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang = "+kllg);
        return kllg;
    }
}

