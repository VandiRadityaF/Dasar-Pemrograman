import java.util.Scanner;

public class Contoh01_29 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            // Deklarasi variabel
            double alas, tinggi, luas;

        // Input
        System.out.print("Masukkan alas garasi: ");
        alas = input.nextDouble();

        System.out.print("Masukkan tinggi garasi: ");
        tinggi = input.nextDouble();

        // Proses menghitung luas segitiga
        luas = 0.5 * alas * tinggi;

        // Output
        System.out.println("Luas garasi adalah: " + luas);
        }
    }
}