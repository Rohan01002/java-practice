
import java.util.Scanner;

public class part45 {
    public static void main(String []args)
    {
        int n;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=i+1;j<=((n*2)-i);j++){
               System.out.print(" ");
            }
            for(int j=((n*2)-i)+1;j<=(n*2);j++){
               System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=((n*2)-i);j>=i+1;j--){
               System.out.print(" ");
            }
            for(int j=(n*2);j>=((n*2)-i)+1;j--){
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
