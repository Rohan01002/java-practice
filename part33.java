import java.util.Scanner;

public class Main {
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
        System.out.println("Max consecutive ones: " + findMaxConsecutiveOnes(nums));
    }
}