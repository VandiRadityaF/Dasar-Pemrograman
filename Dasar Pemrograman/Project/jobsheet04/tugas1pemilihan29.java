import java.util.Scanner;
public class tugas1pemilihan29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---cetak krs siakad---");
        System.out.print("apakah ukt sudah lunas?(true/false):");
        boolean uklunas = sc.nextBoolean();

        String pesan = uklunas ? "pembayaran ukt terverifikasi\nSilakan cetak krs dan minta tanda tangan ke dpa" : 
            "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }
}