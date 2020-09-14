
package pboprak3;


public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Bella" , "Jalan Mawar");
        System.out.println("Simpanan "+anggota1.getNama()+ " : Rp. "+anggota1.getSimpanan());
        
        anggota1.setNama("Bella");
        anggota1.setAlamat("Jalan Manggis VI no 9");
        anggota1.setor(100000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp. "+anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan "+anggota1.getNama()+ " : Rp. "+anggota1.getSimpanan());
    }
}
