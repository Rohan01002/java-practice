class Main {

    static boolean isArmstrong(int n) {

        int original = n;
        int sum = 0;
        int digits = 0;
        int temp = n;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;

        while (temp > 0) {
            int rem = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * rem;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        int n = 153;

        if (isArmstrong(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}