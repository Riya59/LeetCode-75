class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftsum = 0;
        int rightsum = 0;

       int t_sum = 0;

       for(int i=0; i<n; i++){
           t_sum = t_sum + nums[i];
       }

       for(int i=0; i<n; i++){
           rightsum = t_sum - nums[i] - leftsum;
           if(rightsum == leftsum){
               return i;
           }
           leftsum = leftsum + nums[i];
       }

       return -1;
    }
}
