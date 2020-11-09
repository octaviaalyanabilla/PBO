
package Interfacelatihan;
import Interfacelatihan.ICumlaude;
import Interfacelatihan.Mahasiswa;
import Interfacelatihan.PascaSarjana;
import Interfacelatihan.Rektor;
import Interfacelatihan.Sarjana;
/**
 *
 * @author Z1402
 */
public class Interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
