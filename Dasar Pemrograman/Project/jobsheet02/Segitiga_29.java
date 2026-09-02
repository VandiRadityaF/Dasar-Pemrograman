import java.util.Scanner;

public class Segitiga_29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan alas: ");
        int alas = scan.nextInt();

        System.out.print("Masukan tinggi: ");
        int tinggi = scan.nextInt();

        float luas = alas * tinggi / 2;

        System.out.println("Luas segitiga: " + luas);
        scan.close();
    }
}