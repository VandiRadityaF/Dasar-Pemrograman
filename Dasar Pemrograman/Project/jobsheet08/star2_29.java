import java.util.Scanner;
public class star2_29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("masukan nilai n:");
        n = sc.nextInt();

        for (i=1;i<=n;i+=2){
            System.out.print(i+"*");
        }
        System.out.println();
        sc.close();
    }
}