class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean>ans = new ArrayList<>();

        int max =0;
        for(int i=0;i<n;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }

        for(int i=0;i<n;i++){
            int sum = candies[i]+extraCandies;
            if(sum >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;
    }
}
