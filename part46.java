import java.util.Scanner;

public class part46{
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
        {
            System.out.print("*");
        }
        System.out.println();

    }
}}