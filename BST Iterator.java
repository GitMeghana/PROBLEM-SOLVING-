class BSTIterator {
    Stack <TreeNode> stack = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        Push(root);
    }
    
    public int next() {
        TreeNode tmp = stack.pop();
        Push(tmp.right);
        return tmp.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    void Push(TreeNode root){
        while( root!= null){
            stack.push(root);
            root = root.left;
        } 
    }
}
