
import java.util.Scanner;

public class part41 {
    public static void main(String agrs[]){
        int r,c;
        Scanner sc = new Scanner (System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(j<=c-i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
