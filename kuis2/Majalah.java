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
public class Majalah extends MediaInformasi{
    public void setJMLHalaman(int jmlHalaman){
        System.out.println("Majalah ini memiliki jumlah halaman : "+jmlHalaman);
        System.out.println("Jika dihitung dari covernya, maka jumlah halaman dari majalah tersebut adalah " + (jmlHalaman + 2)+" halaman");
    }
    @Override
    public void reputasi(){
        System.out.println("Reputasi");
    }
    
}
