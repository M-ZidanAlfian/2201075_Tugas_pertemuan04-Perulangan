/*  2) Buatlah algoritma dalam bahasa Java, yang menerima masukan tiga buah sisi, dimana 
    jika semua sisi sama maka tampilkan “Termasuk Kubus”, jika ada sisi yang tidak sama 
    maka tampilkan bukan kubus.
*/
package perulangan;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input panjang sisi-sisi kubus
            System.out.print("Sisi 1: ");
            double sisi1 = input.nextDouble();
            System.out.print("Sisi 2: ");
            double sisi2 = input.nextDouble();
            System.out.print("Sisi 3: ");
            double sisi3 = input.nextDouble();            
            // Memeriksa apakah semua sisi sama
            if (sisi1 == sisi2 && sisi1 == sisi3) {
                System.out.println("Termasuk kubus");
            } else {
                System.out.println("Bukan kubus");
            }
        }
    }
}
