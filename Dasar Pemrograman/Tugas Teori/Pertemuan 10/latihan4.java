import java.util.Scanner;
public class latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahProduk = 0;
        int jumlahHari = 0;
        while (jumlahProduk < 1) {
            System.out.print("Masukkan jumlah produk (minimal 1): ");
            jumlahProduk = sc.nextInt();
            if (jumlahProduk < 1) {
                System.out.println("Jumlah produk harus minimal 1!");
            }
        }
        while (jumlahHari < 1) {
            System.out.print("Masukkan jumlah hari (minimal 1): ");
            jumlahHari = sc.nextInt();
            if (jumlahHari < 1) {
                System.out.println("Jumlah hari harus minimal 1!");
            }
        }
        double totalSeluruhProduk = 0;
        int p = 1;
        while (p <= jumlahProduk) {
            System.out.println("\n--- Data Penjualan Produk ke-" + p + " ---");
            double totalProduk = 0;
            for (int h = 1; h <= jumlahHari; h++) {
                int jumlahTerjual = -1;
                do {
                    System.out.print("Masukkan jumlah terjual pada hari ke-" + h + ": ");
                    jumlahTerjual = sc.nextInt();
                    
                    if (jumlahTerjual < 0) {
                        System.out.println("Error: Jumlah terjual tidak boleh negatif! Silakan masukkan ulang.");
                    }
                } while (jumlahTerjual < 0);
                totalProduk += jumlahTerjual;
            }
            double rataRataProduk = totalProduk / jumlahHari;
            System.out.println("Total penjualan Produk ke-" + p + " = " + totalProduk);
            System.out.println("Rata-rata harian Produk ke-" + p + " = " + rataRataProduk);
            totalSeluruhProduk += totalProduk;
            p++;
        }
        System.out.println("Total keseluruhan penjualan seluruh produk = " + totalSeluruhProduk);
        sc.close();
    }
}