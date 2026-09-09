import java.util.Scanner;
public class percobaan03 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        System.out.println("masukan harga=");
        double harga = scan.nextDouble();

        double diskon = 0.15;
        double potongan = harga * diskon;
        double jumlah = harga - potongan;

        System.out.println("potongan harga="+potongan);

        System.out.println("jumlah yang harus dibayar="+jumlah);
    }
    
}
