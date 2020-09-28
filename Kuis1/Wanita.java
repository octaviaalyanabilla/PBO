
package pbokuis1;


public class Wanita extends Manusia{
    private Pria suami;
    private Manusia anak;
    public int umur;

    public Wanita(){
        
    }
    public Wanita(int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
    }

    
    public void Wanita(Pria suami, Manusia anak){
        this.suami = suami;
        this.anak = anak;
    }
    public void setSuami(Pria suami){
        this.suami = suami;
    }
    public Pria getSuami(){
        return suami;
    }
    public void setAnak(Manusia anak){
        this.anak = anak;
    }
    public Manusia getAnak(){
        return anak;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public int getUmur(){
        if(umur >= 20){
             System.out.println("Dewasa/Siap menikah");
    } else if(umur <= 20)
            System.out.println("Wanita ini masih Kuliah!");
        return umur;
    }
    
    public String info(){
    String info = "";
    info +="Nama : " + this.suami +"\n";
    info +="Kategori : " + this.umur + "\n";
    info +="Anak : " + this.anak + "\n";
    return info();
    }
}
