import java.util.Scanner;
public class studikasus3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int totals=0;
        for(int p=1;p<=3;p++){
            System.out.println("produk"+p);
            int totalp=0;
            for(int h=1;h<=4;h++){
                System.out.println("hari"+h);
                int jumlah = sc.nextInt();
                totalp+=jumlah;
            }
            System.out.println("total produk"+p+"="+totalp);
            totals+=totalp;
        }
        System.out.println("total semua produk="+totals);
    }
}
