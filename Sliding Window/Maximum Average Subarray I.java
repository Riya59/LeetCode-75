class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double avg = 0;
        int n = nums.length;
        for(int i=0; i<k; i++){
            sum = sum + nums[i];
        }
         avg = sum / k;

        for(int i=k; i<n; i++){
            sum = sum + nums[i] - nums[i-k];
            double avg1 = sum/k;
            avg = Math.max(avg,avg1);
        }

        return avg;
    }
}
