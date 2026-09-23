import java.util.Scanner;
public class TugasAntrean29{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);

        System.out.println("masukan kode layanan;");
        int kode = input.nextInt();

        switch (kode){
            case 1:
                System.out.print("layanan legalisir ijasah loket A");
                break;
            case 2:
                System.out.print("layanan surat keterangan aktif kuliah loket b");
                break;
            case 3:
                System.out.print("layanan pembayaran UKT loket c");
                break;
            case 4:
                System.out.print("layanan pengajuan cuti akademik loket d");
                break;
        }
    }
}
