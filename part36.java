public class part36 {
    public static void main(String arrgs[]){
        int rem=0,b=0,n=7,c=0;
        while(n>0){
       rem=n%2;
       b=b+((int)Math.pow(10,c)*rem);
       n=n/2;
       c++;
    }
    System.out.print("binary number is "+b);
}}