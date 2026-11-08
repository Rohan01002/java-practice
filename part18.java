
import java.util.Scanner;

public class part18{
    public static void main(String agrs[])
    {
        int n;
        Scanner sc=new Scanner (System.in);
         System.out.println("Enter the n value");
         n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
         }

    }
}