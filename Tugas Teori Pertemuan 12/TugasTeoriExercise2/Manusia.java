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
public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        if (perangkat instanceof TelevisiJadul){
            ((TelevisiJadul)perangkat).getModelInput();
            ((TelevisiJadul)perangkat).getVoltase();
        }
        else if(perangkat instanceof TelevisiModern){
            ((TelevisiModern)perangkat).getModelInput();
            ((TelevisiModern)perangkat).getVoltase();
        }
    }
}
