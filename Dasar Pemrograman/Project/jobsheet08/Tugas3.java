import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        int totalBarangSeluruh = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 1;
        int []pelangganPerToko = new int[jumlahToko];
        int[] barangPerToko = new int[jumlahToko];

        for (int i = 0; i < jumlahToko; i++) {
            System.out.println("\n--- Toko " + (i + 1) + " ---");
            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            pelangganPerToko[i] = jumlahPelanggan;

            int totalBarangToko = 0;
            for (int j = 0; j < jumlahPelanggan; j++) {
                System.out.print("Masukkan jumlah barang pelanggan ke-" + (j + 1) + ": ");
                int barang = sc.nextInt();
                totalBarangToko += barang;
            }
            barangPerToko[i] = totalBarangToko;
            totalBarangSeluruh += totalBarangToko;
            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i + 1;
            }
        }
        System.out.println("\nRingkasan Penjualan:");
        for (int i = 0; i < jumlahToko; i++) {
            System.out.println("Toko " + (i + 1) + " - pelanggan: " + pelangganPerToko[i] + ", total barang: " + barangPerToko[i]);
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruh);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}