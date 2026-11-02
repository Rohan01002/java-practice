class Main {
    public static void main(String[] args) {
int a=121,rev=0,rem,b;
        b=a;
        while(a!=0){
        rem=a%10;
        rev=rev*10+rem;
        a=a/10;
        }
        if(rev==b){
    System.out.print("palindrome");
        }
        else{
         System.out.print("not a palindrome");   
        }
    }
}