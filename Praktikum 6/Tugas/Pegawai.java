
package Tugas;

/**
 *
 * @author Z1402
 */
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    
    public Pegawai(){
        
    }
    
    public void Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public int getGaji(){
        return 1500000;
    }
}
