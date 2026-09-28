import java.util.Scanner;
public class TugasParkir29{
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println("masukan lama jam parkir");
        int lama_parkir = input.nextInt();

        int tarif_tambahan = 1000;
        int biaya_awal=2000;
        int total_tarif;

        if (lama_parkir <= 2){
            total_tarif = biaya_awal;
        }else {
           total_tarif = biaya_awal + tarif_tambahan * (lama_parkir - 2);

        System.out.println("total tarif:"+total_tarif);
        
        }
    }
}   