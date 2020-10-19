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
public class Mesin {
    public String merek;
    public double kecepatan = 0;

    public Mesin() {
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan() {
        if (getMerek().equalsIgnoreCase("yamaha")) {
            System.out.println("" + (kecepatan += 15) + (" km/jam"));
        } else {
            System.out.println("" + (kecepatan += 10) + (" km/jam"));
        }
    }

    public void kurangiKecepatan() {
        if (getMerek().equalsIgnoreCase("yamaha")) {
            System.out.println("" + (kecepatan -= 10) + (" km/jam"));
        } else {
            System.out.println("" + (kecepatan -= 5) + (" km/jam"));
        }
    }
}


