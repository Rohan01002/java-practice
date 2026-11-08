
import java.util.Scanner;

public class part33{
    public static boolean isprime(int n){
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void isprimerange(int n){
        for(int i=1;i<=n;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]){
        System.out.println("Enter the n value");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isprimerange(n);

    }
}