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
public class Programmer extends Pegawai{
    private int bonus;
    
    Programmer(String nama, int gaji, int bonus){
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }
    @Override
    public int getGaji(){
        return gaji;
    }
    public int getBonus(){
        return bonus;
    }
}
