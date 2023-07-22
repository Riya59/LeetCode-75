class Solution {
    public int longestSubarray(int[] nums) {
        int j = 0;
        int count = 0;
        int ans = 0;

        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                count++;
            }

            while(count>1){
                if(nums[j] == 0){
                    count--;
                }
                j++;
            }

            ans = Math.max(ans, i-j+1-count);
        }

        return (ans == n)?ans-1:ans;
    }
}
