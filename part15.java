
import java.util.Scanner;

public class part15{
    public static void main(String agrs[])
    {
        int n;
        Scanner sc=new Scanner (System.in);
         System.out.println("Enter the n value");
         n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
         }

    }
}