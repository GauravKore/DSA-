import java.util.Scanner;

public class ComplementBest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(1);
            return;
        }

        // Step 1: Find how many bits the number has
        int bitCount = (int)(Math.log(n) / Math.log(2)) + 1;

        // Step 2: Create a mask of all 1s
        int mask = (1 << bitCount) - 1;

        // Step 3: XOR flips the bits
        int result = n ^ mask;

        System.out.println(result);
    }
}

