public class pp3 {
    public static void main(String[] args){
        int n=5,i,j;
        char huruf = 'a';
        for(i=0;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
        }
    }
}