public class part35 {
    public static void main(String arrgs[]){
        int rem=0,b=0,n=001,c=0;
        while(n!=0){
       rem=n%10;
       b=b+((int)Math.pow(2,c)*rem);
       n=n/10;
       c++;
    }
    System.out.print("binary number is "+b);
}}
