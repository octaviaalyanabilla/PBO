
package PBOPrak1;


public class Tas {
   private String merk,warna;
   private int jumlah;
   
   public void setMerk(String newValue){
       merk = newValue;
   }
    public void gantiWarna(String newValue){
        warna = newValue;
   }
    public void jumlah(int increment){
        jumlah = jumlah + increment;
    
    }
    public void tali(int decrement){
        jumlah = jumlah - decrement;
    }
    public void cekStatus(){
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("jumlah: " + jumlah);
    }
    
    
}
