
package Tugas;

/**
 *
 * @author Z1402
 */
public class Mac extends Laptop{
    public String security;

    public Mac(){

    }
    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security=security;
    }
    public void tampilMac(){
        System.out.println("----------- MAC ----------");
        super.tampilLaptop();
        System.out.println("Security            : "+security);
    }

   
}
