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
public class Main {
    public static void main(String[] args) {
        SepedaMotor honda = new SepedaMotor("Vario", "Honda");
        System.out.println(honda.getMerekSepeda());
        System.out.println(honda.getMerek());
        honda.tambahKecepatan();
        honda.tambahKecepatan();
        honda.kurangiKecepatan();

        System.out.println("");

        SepedaMotor yamaha = new SepedaMotor("NMax", "Yamaha");
        System.out.println(yamaha.getMerekSepeda());
        System.out.println(yamaha.getMerek());
        yamaha.tambahKecepatan();
        yamaha.tambahKecepatan();
        yamaha.kurangiKecepatan();
    
    }
}
