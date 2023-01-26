Maximum Depth Of a Binary Tree --->

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1; 
    }
}

Minimum Depth Of a Binary Tree --->

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left == null || root.right == null){
            return Math.max(left,right)+1;
        }
        return Math.min(left,right)+1;   
    }
}