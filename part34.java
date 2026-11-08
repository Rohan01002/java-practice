import java.util.Scanner;
public class part34 {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void isprimerange(int n){
        for(int i=0;i<=n;i++){
           if(isprime(i)) {
            System.out.println(i + " is prime");
           }
        }
    }
    public static void main(String[] args) {
        int n;
System.out.println("enter the n value ");
Scanner sc = new Scanner(System.in);
 n = sc.nextInt();
 isprimerange(n);
    }
}

