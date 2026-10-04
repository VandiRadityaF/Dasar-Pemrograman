import java.util.Scanner;

public class Tugast02_29 {
    public static void main(String[] Args){

        Scanner scan =new Scanner(System.in);

        System.out.println("Masukan panjang tanah");
        int panjang_tanah = scan.nextInt();

        System.out.println("Masukan lebar tanah");
        int lebar_tanah = scan.nextInt();

        System.out.println("Masukan diameter kolam");
        int diameter_kolam = scan.nextInt();

        System.out.println("Masukan panjang sisi taman");
        int panjang_sisi =scan.nextInt();

        double pi= 3.14;

        int luas_tanah = panjang_tanah * lebar_tanah;
        double luas_kolam = pi * (diameter_kolam/2) * (diameter_kolam/2);
        int luas_taman = panjang_sisi * panjang_sisi;
        double sisa_tanah = luas_tanah - (luas_kolam + luas_taman);

        System.out.println("Sisa tanah adalah"+sisa_tanah);
    }
}