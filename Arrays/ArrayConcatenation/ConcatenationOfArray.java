import java.util.Arrays;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] result = new int[n * 2];

        for (int i = 0; i < 2 * n; i++) {
            result[i] = nums[i % n];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        System.out.println("Input  : " + Arrays.toString(nums));

        int[] ans = getConcatenation(nums);

        System.out.println("Output : " + Arrays.toString(ans));
    }
}