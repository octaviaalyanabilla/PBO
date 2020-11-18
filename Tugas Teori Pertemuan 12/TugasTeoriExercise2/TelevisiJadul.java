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
public class TelevisiJadul extends Elektronik{
    private String modelInput;
    
    TelevisiJadul(){
        
    }
    public String getModelInput(){
        modelInput = "DVI";
        System.out.println("Nyalakan televisi jadul dengan: "+modelInput);
        return modelInput;
    }
}
