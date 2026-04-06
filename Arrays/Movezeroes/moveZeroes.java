

class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0 ;
        for ( int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        while(k<nums.length){
            nums[k] = 0 ;
            k++;
        }
    }
} 
public class moveZeroes {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {0, 1, 0, 3, 12};

        obj.moveZeroes(nums);

        System.out.print("Updated array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
