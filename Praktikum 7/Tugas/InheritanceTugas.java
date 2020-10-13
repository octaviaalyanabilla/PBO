
package Tugas;

/**
 *
 * @author Z1402
 */
public class InheritanceTugas {
    public static void main(String[] args) {
        PC pc = new PC("HP", 3, 8, "Inter core i7", 12);
        pc.tampilPc();

        Mac mac = new Mac("MacBook Pro", 4, 8, "Intel Core i5", "Polimer", "Private internet access");
        mac.tampilMac();

        Windows windows = new Windows("ACER", 3, 4, "Intel core i5", "Original Baterai Z1401", "HD Display");
        windows.tampilWindows();
    }
}
