
package pboprak3;

import java.util.Scanner;
public class AnggotaKoperasiDemo {
    public static void main(String[] args) {
        AnggotaKoperasi donny = new AnggotaKoperasi("111333444", "Donny", 5000000);
        Scanner bella = new Scanner(System.in);
        
        int x, y;
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.print("\nMasukan Jumlah Pinjaman: ");
        y = bella.nextInt();
        donny.getJumlahPinjaman();

        if (donny.getJumlahPinjaman() < donny.getLimitPinjaman()) {
            donny.pinjam(y);
            System.out.println("\nJumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

            System.out.print("\nMasukan jumlah angsuran: ");
            x = bella.nextInt();
            donny.angsur(x);
            System.out.println("\nJumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        } else {
            System.out.println("Pinjaman melibihi batas!!!");
        }
         
        System.out.println("\nMeminjam Uang 10.000.000. . .");
        donny.pinjam(5000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukan jumlah angsuran: ");
        x = bella.nextInt();
        donny.angsur(x);
        System.out.println("\nMeminjam uang 4.000.000. . .");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 100.000");
        donny.angsur(100000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
   }
//        System.out.println("Nama Anggota: " + donny.getNama());
//        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
//        System.out.println("\nMeminjam uang 10.000.000...");
//        donny.pinjam(10000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//        System.out.println("\nMeminjam uang 4.000.000...");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//        System.out.println("\nMembayar angsuran 3.000.000");
//        donny.angsur(3000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//    }
}
    
