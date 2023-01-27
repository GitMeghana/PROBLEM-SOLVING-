Symmetric Tree --->

class Solution {
    public boolean Preorder(TreeNode a , TreeNode b){
        if (a == null || b == null){
            return a==b;
        }
        if (a.val!=b.val){
            return false;
        }
        return Preorder(a.left,b.right) && Preorder(a.right,b.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return root == null || Preorder(root.left,root.right);  
    }
}