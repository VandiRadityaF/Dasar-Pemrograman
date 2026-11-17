public class contoh1 {
    public static void main(String[] args) {
        String[] cabang = {"Dieng", "Soehat", "Sengkaling"};
        String[] kategori = {"Novel", "Komik", "Ensiklopedia"};
        int[][] penjualan = {
            {2, 8, 6},
            {7, 3, 6},
            {4, 6, 5}
        };

        int totalKeseluruhan = 0;
        int jumlahData = penjualan.length * penjualan[0].length;

        for (int i = 0; i < penjualan.length; i++) {
            int totalCabang = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalCabang += penjualan[i][j];
                totalKeseluruhan += penjualan[i][j];
            }
            double rataCabang = (double) totalCabang / penjualan[i].length;
            System.out.printf("Rata-rata penjualan cabang %s: %.2f\n", cabang[i], rataCabang);
        }
        System.out.println();
        for (int j = 0; j < penjualan[0].length; j++) {
            int totalKategori = 0;
            for (int i = 0; i < penjualan.length; i++) {
                totalKategori += penjualan[i][j];
            }
            double rataKategori = (double) totalKategori / penjualan.length;
            System.out.printf("Rata-rata penjualan kategori %s: %.2f\n", kategori[j], rataKategori);
        }

        System.out.println();

        double rataKeseluruhan = (double) totalKeseluruhan / jumlahData;
        System.out.printf("Rata-rata penjualan keseluruhan: %.2f\n", rataKeseluruhan);
    }
}