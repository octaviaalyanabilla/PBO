
package jti.polinema.relasiclass.tugas;

public class Segitiga {
    private int alas;
    private int tinggi;
    
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void setAlas(int alas){
        this.alas = alas;
    }
    public int getAlas(){
        return alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }
    public float luas(){
        return this.alas * this.tinggi;
    }
}
