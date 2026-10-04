import java.util.Scanner;
public class nestedAksesLab29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("apakah anda mahasiswa aktif(true/false):");
        boolean mahasiswa = sc.nextBoolean();

        System.out.println("apakah sedang di sanksi(true/false):");
        boolean sanksi = sc.nextBoolean();
        
        System.out.println("apakah punya ijin dosen(true/false):");
        boolean izin = sc.nextBoolean();

        System.out.println("apakah asisten labolatorium (true/false):");
        boolean asisten = sc.nextBoolean();
        String pesan = null;

        if(mahasiswa&&!sanksi){
            if(izin||asisten){
                pesan = "akses labolatorium diberikan";
            }
        }else{
            pesan = "akses labolatorim tidak diberikan";
        }
        System.out.println(pesan);
    }
}
