/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTeoriExercise1;

/**
 *
 * @author Z1402
 */
public class Manager extends Pegawai{
    private int tunjangan;
    
    Manager(String nama, int gaji, int tunjangan){
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }
    public int getGaji(){
        return gaji;
    }
    public int getTunjangan(){
        return tunjangan;
    }
}
