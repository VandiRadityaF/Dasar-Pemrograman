import java.util.Scanner;
public class daspro03_1 {
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("masukan jumalah yang dicetak=");
        int jumlah = scan.nextInt();

        int harga_cetak = 500; 
        int harga_jilid = 5000;

        int total = jumlah * harga_cetak + harga_jilid;

        System.out.println("total harga = "+ total);

      }
}