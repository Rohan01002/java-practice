public class part23 {

   public static void swap(int a,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
System.out.println("a="+a);
System.out.println("b="+b);
} 
public static void main()
{
    int a=5,b=10;
    swap(a, b);
System.out.println("a="+a);
System.out.println("b="+b);
}
}


