
package jti.polinema.relasiclass.tugas;

public class Lingkaran {
    private int r;
    
    public Lingkaran(int r){
        this.r = r;
    }
    public void setR(int r){
        this.r = r;
    }
    public int getR(){
        return r;
    }
    public float luas(){
        return (float) (Math.PI * r * r);
    }
    public float keliling(){
        return (float) (2 * Math.PI * r * r);
    }
}
