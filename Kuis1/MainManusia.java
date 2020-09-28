
package pbokuis1;


public class MainManusia {
    public static void main(String[] args) {
        Pria pr = new Pria();
        Wanita istri = new Wanita();
        Manusia anak = new Manusia();
        
        pr.setUmur(19);
        pr.setIstri(istri);
        System.out.println("-------------PRIA-------------");
        System.out.println("Nama : Robin");
        System.out.println("Usia : 19");
        System.out.println("Status : Pria ini masih kuliah");
        System.out.println("------------------------------");
        istri.setAnak(anak);
        istri.setSuami(pr);
        System.out.println("-----------WANITA-------------");
        System.out.println("Nama : Nia");
        System.out.println("Usia : 22");
        System.out.println("Status : Siap Menikah <3");
        System.out.println("------------------------------");
        anak.setDewasa(true);
        anak.setNama("Robin");
        anak.setUmur(20);
        System.out.println("------------ANAK-------------");
        System.out.println("Nama : -");
        System.out.println("Usia : -");
        System.out.println("Status : -");
    }
}
