class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n-1;

        int max = 0;

        while(left < right){
            int lh = height[left];
            int rh = height[right];

            int min = Math.min(lh, rh);

            int length = right - left;

            int curr_area = min * length;

            max = Math.max(max, curr_area);

            if(lh < rh){
                left++;
            }
            else{
                right--;
            }
        }

        return max;
        
    }
}
