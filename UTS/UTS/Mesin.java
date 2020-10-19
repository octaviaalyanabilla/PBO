
package UTS;

/**
 *
 * @author Z1402
 */
public class Mesin extends SepedaMotor{
    public String merek;
    private double kecepatan;

    public Mesin(String merekMotor, String merekMesin) {
        super(merekMotor, merekMesin);
        this.merek = merek;
    }
    public void setMerek(String merekMesin){
        this.merek = merek;
    }
    public String getMerek(){
        return merek;
    }
    public double getKecepatan(){
        return kecepatan;
        }
    public void tambahKecepatan(){
       
    }
    public void kurangiKecepatan(){
        
    }
}
