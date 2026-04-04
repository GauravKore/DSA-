public class Twosumexample{
    public static void main(String[] args) {
        int nums[] = {2 , 7 , 11 , 15 };
        int target = 9 ;
        int n = nums.length ;

        for(int i = 0 ; i < n ; i++){
            for ( int j = i+1 ; j < n ; j++){
                if ( nums[i] + nums[j] == target){
                       System.out.println("Indices: " + i + " " + j);
                       return ;
                }
            }
        }
        

    }
}