
package PBOPrak1;


public class TasDemo {
    public static void main(String[] args) {
        Tas tas1 = new Tas();
        Tas tas2 = new Tas();
        Totebag tb1 = new Totebag();
        Totebag tb2 = new Totebag();
        Handbag hb1 = new Handbag();
        Handbag hb2 = new Handbag();
        Gitar gt1 = new Gitar();
        Gitar gt2 = new Gitar();
        Buku bk1 = new Buku();
        Buku bk2 = new Buku();
        
        tas1.setMerk("exsport");
        tas1.gantiWarna("Merah");
        tas1.jumlah(2);
        tas1.cekStatus();
        System.out.println("-------------------------");
        tas2.setMerk("eiger");
        tas2.gantiWarna("Merah");
        tas2.jumlah(2);
        tas2.cekStatus();
         System.out.println("-------------------------");
        tb1.tipeTas("Kulit");
        tb1.setMerk("Bershka");
        tb1.gantiWarna("Coklat");
        tb1.jumlah(1);
        tb1.cekStatus();
        
         System.out.println("-------------------------");
         
        tb2.tipeTas("Kain");
        tb2.setMerk("MINISO");
        tb2.gantiWarna("Hitam");
        tb2.jumlah(3);
        tb2.cekStatus();
         System.out.println("-------------------------");
        hb1.jenis("Metal");
        hb1.setMerk("Zipper");
        hb1.gantiWarna("Tetap");
        hb1.gantiResleting("Plastik");
        hb1.tambahPanjangResleting(2);
        hb1.kurangPanjangResleting(1);
        hb1.jumlah(2);
        hb1.cekStatus();
         System.out.println("-------------------------");
        hb2.jenis("Plastik");
        hb2.setMerk("Quiziper");
        hb2.gantiWarna("Pink");
        hb2.gantiResleting("Metal");
        hb2.tambahPanjangResleting(3);
        hb2.kurangPanjangResleting(1);
        hb2.jumlah(4);
        hb2.cekStatus();
         System.out.println("-------------------------");
        gt1.jenis("akustik");
        gt1.nama("Yamaha");
        gt1.tambahPanjang(3);
        gt1.kurangPanjang(0);
        gt1.cekStatus();
         System.out.println("-------------------------");
        gt2.jenis("Klasik");
        gt2.nama("Yamaha");
        gt2.tambahPanjang(1);
        gt2.kurangPanjang(0);
        gt2.cekStatus();
         System.out.println("-------------------------");
        bk1.judul("Koala Kumal");
        bk1.jenis("Novel");
        bk1.tambahJumlahHalaman(1);
        bk1.kurangJumlahHalaman(0);
        bk1.tambahHarga(2000);
        bk1.kurangHarga(1000);
        bk1.cekStatus();
         System.out.println("-------------------------");
        bk2.judul("Buku Kewarganegaraan");
        bk2.jenis("Modul");
        bk2.tambahJumlahHalaman(2);
        bk2.kurangJumlahHalaman(0);
        bk2.tambahHarga(1000);
        bk2.kurangHarga(0);
        bk2.cekStatus();
    }
    }
