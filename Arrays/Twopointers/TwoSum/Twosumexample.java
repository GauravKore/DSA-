import RemoveDuplicates;

package Arrays.Twopointers.TwoSum;
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }

        int k = 2 ;
        for(int i = 2 ; i< nums.length ; i++){
            if (nums[i] != nums[k - 2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k ;

    }
    public static void main(String args[]) {
        int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int k = new RemoveDuplicates().removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
