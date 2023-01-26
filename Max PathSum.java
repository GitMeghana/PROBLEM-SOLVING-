Binary Tree Maximum PathSum --->

class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        postorder(root);
        return max;
    }
    int postorder(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = Math.max(postorder(root.left),0);
        int right = Math.max(postorder(root.right),0);
        max = Math.max(max,left+right+root.val);
        return Math.max(left,right)+root.val;
    }

}