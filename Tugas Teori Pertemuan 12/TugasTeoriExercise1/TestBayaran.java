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
public class TestBayaran {
    public static void main(String[] args) {
        Manager man = new Manager("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran br = new Bayaran();
        
        System.out.println("Bayaran Manager: "+br.hitungBayaran(man));
        System.out.println("Bayaran Programmer : "+br.hitungBayaran(prog));
    }
}
