class Solution {
    public int max(int piles[]){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi = Math.max(piles[i],maxi);
        }
        return maxi;
    }
    private long totalhrs(int piles[], int hrs){
        long total = 0;
        for(int i=0;i<piles.length;i++){
            total = total+(piles[i]+hrs-1)/hrs;

        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        while(low <= high){
            int mid = low+(high-low)/2;
            long total = totalhrs(piles,mid);
            if(total<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
