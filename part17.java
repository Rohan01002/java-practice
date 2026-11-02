
import java.util.Scanner;

public class part17 {
    public static void main(String[] args) {
        int factorial=1,c=1,n;
System.err.println("Enter the n value");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(c<=n)
{
    factorial*=c;
    c++;
}
System.out.println(factorial);
    }
}
