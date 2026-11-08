class Main {

    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    static int binomial(int n, int r) {

        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);

        return a / (b * c);
    }

    public static void main(String[] args) {

        int result = binomial(5, 2);

        System.out.println(result);
    }
}