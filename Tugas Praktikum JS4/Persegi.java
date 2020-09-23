
package jti.polinema.relasiclass.tugas;


public class Persegi {
    private int sisi;
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getSisi(){
        return sisi;
    }
    public float luas(){
        return this.sisi * this.sisi;
    }
    public float keliling(){
        return this.sisi* 4;
    }
}
