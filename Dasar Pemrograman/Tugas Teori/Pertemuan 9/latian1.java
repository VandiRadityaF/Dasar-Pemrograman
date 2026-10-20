import java.util.Scanner;
public class latian1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int hari = 1; hari <= 7; hari++) {
            double jam;
            while (true) {
                System.out.print("Jam belajar hari ke" + hari + ": ");
                jam = sc.nextDouble();
                if (jam > 10) {
                    System.out.println("Input tidak valid (maksimal 10 jam), silakan ulangi.");
                    continue; }
                break;
            }
            total += jam;
        }
        System.out.println("Total jam belajar seminggu: " + total + " jam");
        sc.close();
    }
}