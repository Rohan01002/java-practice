import java.util.*;
public class part05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income"); 
        int n=sc.nextInt();
        if(n<500000)
        {
            System.out.println("Income tax is 0");
        }
        else if(n>=500000&&n<1000000)
        {
            System.out.println("Income tax is 20%");
        }
        else{
            System.out.println("Income tax is 30%");
        }
    }
}
