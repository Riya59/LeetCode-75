class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int sum = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            sum = sum + gain[i];
            max = Math.max(sum,max);
        }

        if(max <= 0){
            return 0;
        }

        return max;
    }
}
