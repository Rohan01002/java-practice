import java.util.Scanner;
public class part39 {

    public static void main(String args[]){
        int a,rev,rem,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=a;
        rev=0;
        while(a>0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        if(rev==b){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
      
        }
}