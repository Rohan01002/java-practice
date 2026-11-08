
import java.util.Scanner;

// GitHub program: Maximum consecutive ones
class ConsecutiveOnes {

    static int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, best = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
                if (best < c) best = c;
            } else {
                c = 0;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " numbers (0 or 1):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Max consecutive ones: "
                + findMaxConsecutiveOnes(nums));
    }
}

// Your local program: Prime numbers
public class part33 {

    public static boolean isprime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void isprimerange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the n value");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isprimerange(n);
    }
}
