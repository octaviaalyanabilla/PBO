
package pboprak3;


public class AnggotaKoperasi {
    private String noKTP;
    private String nama;
    private int saldo;
    private int limitPinjaman = 5000000;
    private int jumlahPinjaman;
    
    public AnggotaKoperasi(String noKTP, String nama, int saldo){
        this.noKTP = noKTP;
        this.nama = nama;
        this.saldo = saldo;
    }
    public String getNoKTP(){
        return noKTP;
        
    }
    public String getNama(){
        return nama;
    }
    public int getSaldo(){
        return saldo;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void setNOKTP(String noKTP){
        this.noKTP = noKTP;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public void setLiimitPinjaman(int limitPinjaman){
        this.limitPinjaman = limitPinjaman;
    }
    public void setJumlahPinjaman(int jumlahPinjaman){
        this.jumlahPinjaman = jumlahPinjaman;
    }
    public int pinjam(int pinjam){
        if(pinjam < limitPinjaman)
        {
            jumlahPinjaman += pinjam;
        }
        else {
            System.out.println("Pinjaman Melebihi Batas!!!");
        }
        return jumlahPinjaman;
    }
    public int angsur (int angsur){
        jumlahPinjaman -= angsur;
        
//        if(angsur > (0.01*jumlahPinjaman)){
//            System.out.println("Angsuran diterima");
//    }
//        else {
//            System.out.println("Maaf,angsuran harus 10% dari jumlah pinjaman");
//        }
        return jumlahPinjaman;
    }
}
    