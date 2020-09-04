
package PBOPrak1;


public class Handbag extends Tas{
    private String resleting, jenis;
    private int panjangResleting;
    public void jenis(String newValue){
        jenis = newValue;
    }
    public void gantiResleting(String newValue){
        resleting = newValue;
    }
    public void tambahPanjangResleting(int increment){
        panjangResleting = panjangResleting + increment;
    }
    public void kurangPanjangResleting(int decrement){
        panjangResleting = panjangResleting - decrement;
    }
    public void cekStatus(){
        super.cekStatus();
        System.out.println("Resleting : " + jenis);
        System.out.println("Ganti resleting : " + resleting);
        System.out.println("Panjang Resleting: " + panjangResleting);
    }
}
