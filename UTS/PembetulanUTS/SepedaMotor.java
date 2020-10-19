/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PembetulanUTS;

/**
 *
 * @author Z1402
 */
public class SepedaMotor extends Mesin{
    public Mesin mesin;
    public String merekSepedaMotor;

    public SepedaMotor() {
    }
    
    public SepedaMotor(String merekSepedaMotor, String merek) {
        super.merek = merekSepedaMotor;
        this.merekSepedaMotor = merek;
    }

    public void setMerekSepeda(String merek) {
        this.merekSepedaMotor = merek;
    }

    public String getMerekSepeda() {
        return merekSepedaMotor;
    }
    public String getMerek() {
        return super.getMerek(); 
    }
    public void tambahKecepatan(){
       super.tambahKecepatan();
    }
}
    
