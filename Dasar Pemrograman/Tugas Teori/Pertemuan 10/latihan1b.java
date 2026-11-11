public class pp2 {
    public static void main(String[] args){
        int n=10,i,j;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
