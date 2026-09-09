import java.util.Scanner;
public class tugas2{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("masukan jumlah cetak");
        int jumlah_cetak = scan.nextInt();

        int biaya_cetak = 500;
        int biaya_jilid = 5000;

        int biaya_total = (jumlah_cetak * biaya_cetak) + biaya_jilid;

        System.out.println("biaya total ="+ biaya_total);
    }
}