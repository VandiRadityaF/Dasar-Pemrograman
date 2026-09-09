import java.util.Scanner;
public class percobaan04{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("masukan gaji pokok");
        int gaji_pokok = scan.nextInt();

        int tunjangan_trns = 600000;
        int tunjangan_makan = 400000;
        double bns = 0.05;
        double pjk = 0.1;

        double bonus = gaji_pokok * bns;
        int total_gaji= (int) (gaji_pokok + tunjangan_trns + tunjangan_makan + bonus - (gaji_pokok * pjk));
        
        System.out.println("total gaji="+ total_gaji);
        
        System.out.println("bunus gaji ="+ bonus);
    }
}