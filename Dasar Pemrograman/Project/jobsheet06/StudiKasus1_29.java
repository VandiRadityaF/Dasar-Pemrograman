import java.util.Scanner;
public class StudiKasus1_29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hargapercup , jumlahcup , uangbayar , totalharga , diskon , totalbayar , kembalian , kurang;

        System.out.println("jumlah cup yang dibeli");
        jumlahcup = sc.nextInt();
        System.out.println("uang yang dibayarkan");
        uangbayar = sc.nextInt();
        hargapercup = 18000;
        diskon=0;
        totalharga = hargapercup * jumlahcup - diskon;

        if (totalharga > 100000){
            diskon = totalharga * 10/100;
        }else{
            diskon = 0;
        }totalbayar = totalharga - diskon;
        System.out.println("total harga :" + totalharga);
        System.out.println("total bayar :"+totalbayar);
        System.out.println("diskon      :"+diskon);
        if (uangbayar > totalbayar){
            kembalian = uangbayar - totalharga;
            System.out.println("kembalian   :"+kembalian);
        }else{
            System.out.println("uang tidak cukup");
        }
    }
}
