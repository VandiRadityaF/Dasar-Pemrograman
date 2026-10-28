import java.util.Scanner;
public class NilaiKelompok29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        int jumlahPenilai = sc.nextInt();
        int kelompok = 1;
        double rataRataTertinggi = -1;
        int kelompokTerbaik = 0;

        while (kelompok <= jumlahKelompok) {
            double totalNilai = 0;
            System.out.println("\nKelompok " + kelompok);
            for (int penilai = 1; penilai <= jumlahPenilai; penilai++) {
                double nilai;
                do {
                    System.out.print("Masukkan nilai penilai ke-"+ penilai +" (0-100): ");
                    nilai = sc.nextDouble();
                    if (nilai < 0 || nilai > 100) {
                        System.out.println(
                            "Nilai tidak valid! Masukkan nilai 0-100."
                        );
                    }
                } while (nilai < 0 || nilai > 100);
                totalNilai += nilai;
            }
            double rataRata = totalNilai / jumlahPenilai;
            System.out.println("Rata-rata kelompok " + kelompok+ " = " + rataRata);
            if (rataRata > rataRataTertinggi) {
                rataRataTertinggi = rataRata;
                kelompokTerbaik = kelompok;
            }
            kelompok++;
        }
        System.out.println("HASIL PENILAIAN");
        System.out.println("Kelompok dengan rata-rata tertinggi: "+ kelompokTerbaik);
        System.out.println("Rata-rata tertinggi: "+ rataRataTertinggi);
        sc.close();
    }
}
