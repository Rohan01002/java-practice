

public class part32 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        int sum1=sum(20,20);
        System.out.println(sum1);
        int sum2=sum(1,2,3);
        System.out.println(sum2);

    }
}