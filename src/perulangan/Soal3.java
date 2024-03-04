/*   Buatlah algoritma dalam bahasa Java, yang membaca panjang (integer) tiga buah sisi 
    sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <= c, lalu menentuka apakah 
    ketiga sisi tersebut membentuk segitiga siku – siku, segitiga lancip, atau segitiga 
    tumpul (Petunjuk gunakan hukum Phytagoras).
*/
package perulangan;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) { 
        try (Scanner input = new Scanner(System.in)) {
            // Input panjang sisi-sisi segitiga (a <= b <= c)
            System.out.println("Masukkan panjang sisi-sisi segitiga:");
            System.out.print("a: ");
            int a = input.nextInt();
            System.out.print("b: ");
            int b = input.nextInt();
            System.out.print("c: ");
            int c = input.nextInt();          
            // Memeriksa apakah sisi-sisi membentuk segitiga
            if (a + b > c && b + c > a && a + c > b) {
                // Menggunakan hukum Pythagoras untuk menentukan jenis segitiga
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("Segitiga Siku-siku");
                } else if (a * a + b * b < c * c || a * a + c * c < b * b || b * b + c * c < a * a) {
                    System.out.println("Segitiga Tumpul");
                } else {
                    System.out.println("Segitiga Lancip");
                }
            } else {
                System.out.println("Tidak membentuk segitiga");
            }
        }
    }
}

