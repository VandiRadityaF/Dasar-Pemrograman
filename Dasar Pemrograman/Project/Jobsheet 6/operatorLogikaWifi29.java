import java.util.Scanner;
public class operatorLogikaWifi29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("apakah penguna mahasiswa (true/false)");
        boolean mahasiswa = sc.nextBoolean();

        System.out.println("apakah penguna dosen (true/false)");
        boolean dosen = sc.nextBoolean();

        System.out.println("apakah akun diblokir (true/false)");
        boolean akun = sc.nextBoolean();
        String pesan;

        if((mahasiswa||dosen)&&!akun){
            pesan = "akses wifi diberikan";
        }else{
            pesan = "akses wifi ditolak";
        }
        System.out.println(pesan);
    }
}
