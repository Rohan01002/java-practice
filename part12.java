import java.util.*;
public class part12 {
 public static void main(String args[])
    {
      int a,rem,rev=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      a=sc.nextInt();
      while(a>0)
      {
        rem=a%10;
        rev=rev*10+rem;
        a=a/10;
      }
      System.out.println("Reverse of the number is "+rev);

    }   
}
