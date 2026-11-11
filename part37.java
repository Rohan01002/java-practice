
import java.util.Scanner;

public class part37 {
    public static int avrage(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        int a,b,c,avg;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avg = avrage(a,b,c);
        System.out.print(avg);
        }
}
