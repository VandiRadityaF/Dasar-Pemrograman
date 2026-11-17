import java.util.Scanner;
public class Tugas2_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.print("\nCari menu untuk cek harga (ketik nama menu): ");
        String cariMenu = sc.nextLine();
        int indeksCari = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                indeksCari = i;
                break;
            }
        }
        if (indeksCari != -1) {
            System.out.println("Menu tersedia: " + menu[indeksCari] + " dengan harga Rp " + harga[indeksCari]);
        } else {
            System.out.println("Menu \"" + cariMenu + "\" tidak tersedia di daftar.");
        }
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();
        String[] daftarPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            while (true) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaPesan = sc.nextLine();
                int indeksMenu = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesan)) {
                        indeksMenu = j;
                        break;
                    }
                }
                if (indeksMenu != -1) {
                    daftarPesanan[i] = menu[indeksMenu];
                    hargaPesanan[i] = harga[indeksMenu];
                    totalBiaya += harga[indeksMenu];
                    break;
                } else {
                    System.out.println("Menu tidak tersedia! Silakan pilih menu yang ada di daftar.");
                }
            }
        }
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + daftarPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total Biaya : Rp " + totalBiaya);
        sc.close();
    }
}