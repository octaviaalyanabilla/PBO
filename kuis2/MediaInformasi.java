/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author Z1402
 */
public abstract class MediaInformasi implements Penerbit{
    public int jmlHalaman;
    public int tahunSekarang;
    
    public int getTahunSekarang(int tahun){
        this.tahunSekarang = tahun;
        return tahunSekarang;
    }
    void setJMLHalaman(int jmlHalaman){
        this.jmlHalaman = jmlHalaman ;
        
    }
    @Override
    public void reputasi(){
        System.out.println("Reputasi");
    }
    public void alamatPenerbit(String alamat){
        System.out.println("Alamat Penerbit : "+alamat);
    }
    public void tahunBerdiri(int tahun){
        System.out.println("Penerbit ini berdiri pada tahun : "+ tahun +", Sehingga penerbit ini sekarang berusia : "+(tahunSekarang - tahun));
    }

    

    
}
