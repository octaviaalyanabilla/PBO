/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Z1402
 */
public class Keledai extends Binatang implements IKarnivora, IHerbivora{
    public String suara;
    public String warnaBulu;
    
    public void Keledai(String nama, int jmlKaki){
        this.Keledai(nama, jmlKaki);
    }
    public void Binatang(String nama, int jmlKaki){
        this.Binatang(nama, jmlKaki);
    }
    public String nama(){
        System.out.println("Nama : Kedelai");
        return suara;
    }
    public int jmlKaki(){
        System.out.println("Jumlah Kaki : 4");
        return 4;
    }
    @Override
    public void displayMakan(){
        System.out.println("Makanan : Tumbuhan");
    }
    public void warnaBulu(){
        System.out.println("Warna Bulu : Abu - Abu");
    }
    public void Suara(){
        System.out.println("Suara : Hehehehe");
    }
    public void Jenis(){
        System.out.println("Jenis : Herbivora");
    }
    
    
}
