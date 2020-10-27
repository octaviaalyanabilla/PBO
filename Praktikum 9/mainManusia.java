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
public class mainManusia {
 public static void main(String[] args) {
 Manusia a = new Manusia();
 Manusia b = new Dosen();
 Manusia c = new Mahasiswa();

 System.out.println("_____________________________");
 a.bernafas();
 a.makan();
 System.out.println("_____________________________");
 b.bernafas();
 b.makan();
 System.out.println("_____________________________");
 c.bernafas();
 c.makan();
 System.out.println("_____________________________");
 }

    
}
