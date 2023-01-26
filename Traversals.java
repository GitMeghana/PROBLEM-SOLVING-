Binary Tree Inorder Travesral --->
 
class Solution {
    private List<Integer> ans = new ArrayList<>();
    private void bs(TreeNode node){
        if (node == null){
            return;
        }
        bs(node.left);
        ans.add(node.val);
        bs(node.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        bs(root);
        return ans;
    }
}

Binary Tree Preorder Traversal --->

class Solution {
    private List<Integer> ans = new ArrayList<>();
    private void bs(TreeNode node){
        if (node == null){
            return;
        }
        ans.add(node.val);
        bs(node.left);
        bs(node.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        bs(root);
        return ans;
    }
}

Binary Tree Postorder Traversal --->

class Solution {
    private List<Integer> ans = new ArrayList<>();
    private  void bs(TreeNode node){
        if (node == null){
            return;
        }
        bs(node.left);
        bs(node.right);
        ans.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        bs(root);
        return ans;
        
    }
}