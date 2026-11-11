import java.util.Scanner;
public class part38 {
    public static boolean isEven(int a){
         if(a % 2 == 0){
             return true;
         }
         else{
             return false;
         }
    }
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(isEven(a)){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
}}