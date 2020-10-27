/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboprakt9;

/**
 *
 * @author Z1402
 */
public class Perkalian {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(double a, double b){
        System.out.println(a * b );
    }
    public static void main(String[] args) {
        Perkalian objek = new Perkalian();
        
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}
