
package TugasTeori;

/**
 *
 * @author Z1402
 */
public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;
    public float m;
    
    public float luas(){
        float luas = (float) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga = "+luas);
        return luas;
    }
    public float keliling(){
        m = (float) Math.sqrt((alas*alas)+(tinggi*tinggi));
        float kllg = alas * tinggi * m;
        System.out.println("Keliling Segitiga = "+kllg);
        return kllg;
    }
}
