import java.util.*;
public class part03{
    public static void main(String args[])
    {   System.out.println("enter the items cost");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the pencile cost");
        float a = sc.nextFloat();
        System.out.println("enter the notebook cost");
        float b = sc.nextFloat();
        System.out.println("enter the eraser cost");
        float c = sc.nextFloat();
        float toatl=(a+b+c);
        float gst=toatl*0.18f;
        float finalcost=toatl+gst;
        System.err.println("total cost is"+toatl);
        System.err.println("gst is"+gst);
        System.err.println("final cost is"+finalcost);

    }

}