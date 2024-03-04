/*  1) Buatlah algoritma dalam bahasa Java, menampilkan bilangan dari satu sampai dengan 
    n, dimana n diinput dari alat masukan, n>=1.
*/
package perulangan;
import java.util.Scanner;

public class Soal1 {
 public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input nilai n
            System.out.println("Masukkan nilai n: ");
            int n = input.nextInt();            
            // Memastikan n >= 1
            if (n < 1) {
                System.out.println("Masukkan nilai n harus >= 1.");
            } else {
                // Menampilkan bilangan dari 1 sampai n
                System.out.println("Bilangan:");
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
