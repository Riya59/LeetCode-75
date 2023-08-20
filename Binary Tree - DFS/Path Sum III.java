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
    private int pathSum_a(TreeNode root, long targetSum){
        if(root == null){
            return 0;
        }
        int cnt = 0;
        if(root.val == targetSum){
            cnt++;
        }

        cnt = cnt + pathSum_a(root.left, targetSum - root.val);
        cnt =  cnt + pathSum_a(root.right, targetSum - root.val);

        return cnt;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root ==  null){
            return 0;
        }
        return pathSum(root.left, targetSum) + pathSum_a(root,targetSum) + pathSum(root.right, targetSum);
    }
}
