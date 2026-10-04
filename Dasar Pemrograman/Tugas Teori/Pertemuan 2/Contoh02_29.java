import java.util.Scanner;

public class Contoh05_29 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int tabungan_awal, lama_menabung;
        double persentase_bunga = 0.02 ,bunga,tabungan_akhir;

        System.out.println("masukan tabungan awal");
        tabungan_awal = input.nextInt();

        System.out.println("masukan lama menabung");
        lama_menabung = input.nextInt();

        bunga= lama_menabung * persentase_bunga * tabungan_awal;
        tabungan_akhir = tabungan_awal + bunga;
    
        System.out.println("Bunga adalah"+bunga);
        System.out.println("Jumlah tabungan akhir adalah "+tabungan_akhir);
        }}