
import java.util.Scanner;

public class part15{
    public static void main(String agrs[])
    {
        int n;
        Scanner sc=new Scanner (System.in);
       
        do{
        n=sc.nextInt();     
        if(n%10==0)
        {
            continue;
        }
System.out.print(" "+n);
        }while(true);

    }
}