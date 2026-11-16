import java.util.Scanner;
public class ArrayRataNIlai29_soal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        int nilaimhs[] = new int[jumlahMhs];
        int total = 0;
        int jmlLulus = 0; 
        double rata;

        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.print("masukan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaimhs[i] = sc.nextInt();
            total += nilaimhs[i]; 
            if (nilaimhs[i] > 70) {
                jmlLulus++;
            }
        }
        rata = (double) total / nilaimhs.length;
        System.out.println("total nilai mahasiswa = " + total);
        System.out.println("rata rata nilai mahasiswa = " + rata);
        System.out.println("banyaknya mahasiswa yang lulus = " + jmlLulus);
        int nilaib = nilaimhs[0];
        int nilair = nilaimhs[0];
        for (int i = 0; i < nilaimhs.length; i++) {
            if (nilaimhs[i] > nilaib) {
                nilaib = nilaimhs[i];
            }
            if (nilaimhs[i] < nilair) {
                nilair = nilaimhs[i];
            }
        }
        if (rata >= 85) {
            System.out.println("sangat baik");
        } else if (rata >= 75) {
            System.out.println("baik");
        } else if (rata >= 65) {
            System.out.println("perlu pendampingan");
        }
        System.out.println("nilai tertinggi mahasiswa = " + nilaib);
        System.out.println("nilai terendah mahasiswa = " + nilair);
    }
}
