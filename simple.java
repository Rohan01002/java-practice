public class simple {
    public static void main(String args[])
    {   byte b=4;
        char ch='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.99;
        double result=(f*b)+(i%ch)-(d*s);
        System.out.println("Result is: " + result);
        System.out.println("f*b "+(f*b));
        System.out.println("i%ch "+(i%ch));
        System.out.println("d*s "+(d*s));
        System.out.println("a"+(int)ch);
        System.out.println("1000%97 "+(1000%97));
        int $=10;
        System.out.println("$ is "+$);
    }
}
