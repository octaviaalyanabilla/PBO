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
public class mainSegitiga {
    public static void main(String[] args) {
    Segitiga segitiga = new Segitiga();

    System.out.println(segitiga.totalSudut(15));
    System.out.println(segitiga.totalSudut(15,10));
    System.out.println(segitiga.keliling(14,29));
    System.out.println(segitiga.keliling(14,27,29));
}
}
