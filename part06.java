import java.util.*;
public class part06{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income"); 
        float n=sc.nextFloat();
        float tax=0;
        if(n<500000)
        {
            System.out.println("Income tax is 0");
            tax=n+0;
        }
        else if(n>=500000&&n<1000000)
        {
            System.out.println("Income tax is 20%");
            tax=n*0.20f;
        }
        else{ tax=n*0.30f;
            System.out.println("Income tax is 30%");
        }
        System.out.println("Total income tax is: " + tax);
    }
}
