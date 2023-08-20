/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxlen = 0;
    public void solve(TreeNode root, boolean leftdir, int currSteps){
        if(root == null){
            return;
        }
        maxlen = Math.max(maxlen, currSteps);
        if(leftdir){
            solve(root.left, false, currSteps+1);
            solve(root.right, true, 1);
        }
        else{
            solve(root.right, true, currSteps+1);
            solve(root.left, false, 1);
        }

        return;
    }
    public int longestZigZag(TreeNode root) {
        solve(root,true,0);
        solve(root,false,0);
        return maxlen;
    }
}
