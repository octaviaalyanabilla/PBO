
package Tugas;

/**
 *
 * @author Z1402
 */
public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop(){

    }
    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei=jnsBatrei;
    }
    public void tampilLaptop(){
        System.out.println("Laptop : ");
        super.tampilData();
        System.out.println("Jenis baterai       : "+jnsBatrei);
    }

    
}

