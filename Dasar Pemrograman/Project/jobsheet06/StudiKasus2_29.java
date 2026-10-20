import java.util.Scanner;
public class StudiKasus2_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen;
        int juara = 0;
        int statusPKM = 0;
        boolean berhak = false;
        String alasan = "";

        System.out.print("Masukkan nama mahasiswa: ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = sc.nextLine().toLowerCase();
        if (jenisKegiatan.equals("belmawa")
                || jenisKegiatan.equals("bakorma")
                || jenisKegiatan.equals("mandiri")) {

            System.out.print("Masukkan peringkat juara (1-3, isi 0 jika bukan juara): ");
            juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                berhak = true;
                alasan = "Mahasiswa meraih juara " + juara
                        + " pada perlombaan yang memenuhi ketentuan.";
            } else {
                alasan = "Mahasiswa bukan peraih Juara 1, 2, atau 3.";
            }

        } else if (jenisKegiatan.equals("pkm")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                berhak = true;
                alasan = "Tim PKM lolos pendanaan.";
            } else {
                alasan = "Tim PKM tidak lolos pendanaan.";
            }

        } else {
            alasan = "Kegiatan lainnya tidak memperoleh dana penghargaan.";
        }
        if (berhak) {
            System.out.print("Jumlah dokumen yang diupload (0-4): ");
            jumlahDokumen = sc.nextInt();

            if (jumlahDokumen == 4) {
                alasan += " Seluruh 4 dokumen sudah lengkap.";
            } else {
                berhak = false;
                alasan = "Dokumen tidak lengkap. " + alasan;
                alasan += " Dokumen yang masih kurang: "
                        + (4 - jumlahDokumen) + ".";
            }
        }
        System.out.println("\n===== HASIL VALIDASI =====");
        System.out.println("Nama mahasiswa: " + nama);

        if (berhak) {
            System.out.println("Status dana: DIBERIKAN");
        } else {
            System.out.println("Status dana: TIDAK DIBERIKAN");
        }

        System.out.println("Alasan: " + alasan);

        sc.close();
    }
}
