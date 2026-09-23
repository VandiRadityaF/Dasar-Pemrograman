import java.util.Scanner;
public class PemilihanIf29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---cetak krs siakad---");
        System.out.print("apakah ukt sudah lunas?(true/false):");
        boolean uklunas = sc.nextBoolean();

        if(uklunas){
            System.out.println("pembayaran ukt terverifikasi");
            System.out.println("Silakan cetak krs dan minta tanda tangan ke dpa");
        }else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    }
}