import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("masukan harga laptop");
        int harga = scan.nextInt();
        
        System.out.println("masukan uang muka");
        int uang_muka = scan.nextInt();

        System.out.println("lama cicil laptop (bulan)");
        int lama_cicil = scan.nextInt();

        double bunga = 0.02;

        int harga_setelah = harga - uang_muka;
        int cicilan_bulan = harga_setelah / lama_cicil;
        double jumlah_cicilan = cicilan_bulan * bunga + cicilan_bulan;

        System.out.println("jumlah ciiclan per bulan = "+ jumlah_cicilan);
        

    }
}