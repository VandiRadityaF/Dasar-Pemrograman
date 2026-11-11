import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nilaimhs[] = new int[10];
        int total=0;
        double rata;

        for (int i=0;i<nilaimhs.length;i++){
            System.out.println("masukan nilai mahasiswa ke-"+(i+1)+":");
            nilaimhs[i] = sc.nextInt();
            total +=nilaimhs[1];
        }
        rata = total/nilaimhs.length;
        System.out.println("total nilai mahasiswa ="+total);
        System.out.println("rata rata nilai mahasiswa ="+rata);
        int nilaib = nilaimhs[0];
        int nilair = nilaimhs[0];
        for (int i=0;i<nilaimhs.length;i++){
            if (nilaimhs[i]>nilaib){ nilaib=nilaimhs[i];}
            if (nilaimhs[i]<nilair)  nilair=nilaimhs[i];
        }
        System.out.println("nilai tertinggi mahasiswa ="+nilaib);
        System.out.println("nilai terendah mahasiswa ="+nilair);
    }
}