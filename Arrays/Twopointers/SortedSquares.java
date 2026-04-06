package Arrays.Twopointers;
class Solution {
    public int[] sortedSquares(int[] nums) {
      int result[] = new int[nums.length];
      // Square all elements 
      for(int i = 0 ; i < nums.length ; i++){
        nums[i] = nums[i] * nums[i];
      }

      // place them at accurate position 
      int i = 0 ;
      int j = nums.length-1;
      for(int pos=nums.length-1;pos>=0;pos--){
        if(nums[i]<nums[j]){
          result[pos]=nums[j];
          j--;
        }
        else{
          result[pos]= nums[i];
          i++;
        }
      }
      return result;
    }
}
public class SortedSquares {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = obj.sortedSquares(nums);

        System.out.print("Sorted Squares: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}