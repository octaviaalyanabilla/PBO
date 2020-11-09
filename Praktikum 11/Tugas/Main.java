/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Z1402
 */
public class Main {
    public static void main(String[] args) {
        Singa sg = new Singa();
        Keledai kl = new Keledai();
        Gorilla gl = new Gorilla();
        
        kl.Jenis();
        kl.displayMakan();
        kl.nama();
        kl.jmlKaki();
        kl.Suara();
        kl.warnaBulu();
        System.out.println("");
        
        gl.Jenis();
        gl.displayMakan();
        gl.nama();
        gl.jmlKaki();
        gl.Suara();
        gl.warnaBulu();
        System.out.println("");
        
        sg.Jenis();
        sg.displayMakan();
        sg.nama();
        sg.jmlKaki();
        sg.Suara();
        sg.warnaBulu();
                
    }
}
