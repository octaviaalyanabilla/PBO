
package Tugas;

/**
 *
 * @author Z1402
 */
public class PC extends Komputer{
    public int ukuranMonitor;

    public PC(){

    }
    public PC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("------- PC -------");
        super.tampilData();
        System.out.println("Ukuran monitor      : "+ukuranMonitor);
    }

    
}
