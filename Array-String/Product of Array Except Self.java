// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int ans[] = new int[n];

//         for(int i=0; i<n; i++){
//             int p=1;
//             for(int j=0; j<n; j++){
//                if(i==j){
//                    continue;
//                }
//                p = p*nums[j];
//             }
//             ans[i] = p;
//         }

//         return ans;
//     }
// }





class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
