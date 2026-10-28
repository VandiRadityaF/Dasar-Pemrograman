import java.util.Scanner;
public class star29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("masukan nilai n:");
        n = sc.nextInt();

        for (i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}