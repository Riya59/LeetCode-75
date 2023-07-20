class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int num : nums){
            if(num<=min){
                min = num;
            }
            else if(num<smin){
                smin = num;
            }
            else if(num > smin){
                return true;
            }
        }
        return false;
    }
}
