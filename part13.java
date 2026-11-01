
import java.util.Scanner;

public class part13 {
    public static void main(String args[]){
        int n,sum=0,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        while(c<=n)
        {
            sum+=c;
            c++;
        }
        System.out.println("sum of natural number is "+sum);
    }}
