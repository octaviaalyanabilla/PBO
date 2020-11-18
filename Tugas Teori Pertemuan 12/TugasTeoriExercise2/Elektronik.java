/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTeoriExercise2;

/**
 *
 * @author Z1402
 */
abstract class Elektronik {
    protected int voltase;
    
    Elektronik(){
        
    }
    public int getVoltase(){
        voltase = 220;
        System.out.println("Voltase televisi: "+voltase);
        return voltase;
    }
}
