import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6];
        double totalKeseluruhan = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Input jawaban Responden ke-" + (i + 1) + " (skala 1-5):");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                hasilSurvei[i][j] = input.nextInt();
                totalKeseluruhan += hasilSurvei[i][j];
            }
            System.out.println();
        }

        System.out.println(" Rata-rata Setiap Responden ");
        for (int i = 0; i < 10; i++) {
            double totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += hasilSurvei[i][j];
            }
            System.out.printf("Responden ", (i + 1), (totalResponden / 6));
        }

        System.out.println("Rata-rata Setiap Pertanyaan ");
        for (int j = 0; j < 6; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += hasilSurvei[i][j];
            }
            System.out.printf("Pertanyaan ke:", (j + 1), (totalPertanyaan / 10));
        }

        System.out.println(" Rata-rata Keseluruhan ");
        double rataKeseluruhan = totalKeseluruhan / (10 * 6);
        System.out.printf("Rata-rata keseluruhan:", rataKeseluruhan);

        input.close();
    }
}