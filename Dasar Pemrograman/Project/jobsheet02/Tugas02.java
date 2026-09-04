import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print ("Masukan gaji pokok:");
            int gajipokok = scan.nextInt();

            System.out.print ("Masukan tunjangan anak");
            int tunjangananak = scan.nextInt();

            System.out.print("Masukan jumlah anak");
            int jumlahanak = scan.nextInt();

            double potongan = 0.10;

            double gajibersih = (gajipokok - (gajipokok * potongan)) + (tunjangananak * jumlahanak);
            System.out.println("Gaji bersih" + gajibersih);
        }
    }
}