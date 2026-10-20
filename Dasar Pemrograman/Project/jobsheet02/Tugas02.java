import java.util.Scanner;
public class Tugas02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar, diameter, sisi;
        double luasTanah, luasKolam, luasTaman, sisaTanah;
        System.out.print("Masukkan panjang tanah: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar tanah: ");
        lebar = sc.nextInt();
        System.out.print("Masukkan diameter kolam: ");
        diameter = sc.nextInt();
        System.out.print("Masukkan panjang sisi taman: ");
        sisi = sc.nextInt();

        luasTanah = panjang * lebar;
        luasKolam = 3.14 * (diameter / 2.0) * (diameter / 2.0);
        luasTaman = sisi * sisi;

        sisaTanah = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah: " + luasTanah + " m2");
        System.out.println("Luas kolam: " + luasKolam + " m2");
        System.out.println("Luas taman: " + luasTaman + " m2");
        System.out.println("Sisa luas tanah: " + sisaTanah + " m2");

        sc.close();
    }
}