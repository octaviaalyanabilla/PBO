
package pbokuis1;


public class Manusia {
    private int umur;
    private String nama;
    private boolean dewasa;
    
    public Manusia(){
        
    }
    public Manusia(int umur, String nama, boolean dewasa){
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }

    
    public void setUmur(int umur){
        this.umur = umur;
    }
    public int getUmur(){
        return umur;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setDewasa(boolean dewasa){
        this.dewasa = dewasa;
    }
    public boolean getDewasa(){
        return dewasa;
    }
    public String info(){
        String info = "";
        info +="Nama : " + this.nama + "\n";
        info +="Umur : " + this.umur + "\n";
        info +="Dewasa : " + this.dewasa + "\n";
        return info;
    }
    
    
    
}
