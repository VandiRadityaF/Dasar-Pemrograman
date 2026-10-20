import java.util.Scanner;
public class latian2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Jam kerja (negatif untuk berhenti): ");
            double jam = sc.nextDouble();
            if (jam < 0) {
                System.out.println("Program berhenti.");
                break;
            }
            System.out.print("Gaji harian: ");
            double gaji = sc.nextDouble();
            double bonus = 0;
            if (jam > 8) {
                bonus = 0.2 * gaji;
            }
            System.out.println("Bonus pegawai: " + bonus);
            System.out.println();
        }
        sc.close();
    }
}