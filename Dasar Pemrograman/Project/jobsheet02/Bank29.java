public class Bank29 {
    public static void main(String[] args) {

        int jumlah_tabungan_awal = 500000;
        int lama_menabung = 5;
        double prosentase_bunga = 0.02;

        double bunga = lama_menabung * prosentase_bunga * jumlah_tabungan_awal;
        double jumlah_tabungan_akhir = bunga + jumlah_tabungan_awal;

        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jumlah_tabungan_akhir);
    }
}