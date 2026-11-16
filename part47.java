import java.util.Scanner;
public class part47 {
     public static void main(String[] args) {

    int n;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=(n-i);j++)
        {
            System.out.print(" ");
        }
         for(int j=((n-i)+1);j<=((n*2)-i);j++)
         {if(i==1||i==n)
         {
                 System.out.print("*");
         }
         else if(j==(n-i)+1||j==(n*2)-i)
         {
             System.out.print("*");
         }
         else
         {
             System.out.print(" ");
         }

} System.out.println();
    }}}