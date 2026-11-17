import java.util.Scanner;
public class contoh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kota = {"Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha"};
        double[][] suhu = new double[5][7];

        for (int i = 0; i < kota.length; i++) {
            System.out.println("Masukkan data suhu untuk kota " + kota[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        double suhuTertinggi = suhu[0][0];
        String kotaTertinggi = kota[0];
        int hariTertinggi = 1;
        double suhuTerendah = suhu[0][0];
        String kotaTerendah = kota[0];
        int hariTerendah = 1;
        for (int i = 0; i < kota.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (suhu[i][j] > suhuTertinggi) {
                    suhuTertinggi = suhu[i][j];
                    kotaTertinggi = kota[i];
                    hariTertinggi = j + 1;
                }
                if (suhu[i][j] < suhuTerendah) {
                    suhuTerendah = suhu[i][j];
                    kotaTerendah = kota[i];
                    hariTerendah = j + 1;
                }
            }
        }
        System.out.println("Suhu tertinggi: " + suhuTertinggi + "°C di kota " + kotaTertinggi + " pada hari ke-" + hariTertinggi);
        System.out.println("Suhu terendah: " + suhuTerendah + "°C di kota " + kotaTerendah + " pada hari ke-" + hariTerendah);

        sc.close();
    }
}