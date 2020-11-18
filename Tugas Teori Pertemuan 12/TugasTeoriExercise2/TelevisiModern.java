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
public class TelevisiModern extends Elektronik{
    private String modelInput;
    
    TelevisiModern(){
        
    }
    public String getModelInput(){
        modelInput = "HDMI";
        System.out.println("Nyalakan modern dengan input: "+modelInput);
        return modelInput;
    }
}
