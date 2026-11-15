import java.util.Scanner;

public class part43 {
    public static void main(String[]args)
    {
        int c=0,n;
        Scanner sc =new Scanner(System.in);2
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for( int j=1;j<=i;j++){
                c++;
                System.out.print(c+" ");
            }

            System.out.println();
        }
    }
}
