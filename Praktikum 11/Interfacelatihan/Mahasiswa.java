/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacelatihan;

/**
 *
 * @author Z1402
 */
public class Mahasiswa implements ICumlaude{
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
    @Override
    public void lulus() {
        System.out.println("Aku mahasiswa,Namaku Bella");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("Aku berkuliah di Polinema");   
    }
    
}
