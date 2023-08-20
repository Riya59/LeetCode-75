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
    int count = 0;
    public int goodNodes(TreeNode root) {
        int max = root.val;
        countNodes(root,max);
        return count;
    }
    public void countNodes(TreeNode root, int max){
        if(root != null){
            if(max <= root.val){
                max = root.val;
                count++;
            }
        

        countNodes(root.left, max);
        countNodes(root.right,max);
        }
    }
}
