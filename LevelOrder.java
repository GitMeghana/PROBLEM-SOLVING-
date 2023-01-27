Binary Tree LevelOrder Traversal --->

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null){
            return ans;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> a = new LinkedList<>();
            for (int i =0;i<size;i++){
                TreeNode cur = queue.poll();
                a.add(cur.val);
                if (cur.left!= null){
                    queue.add(cur.left);
                }
                if (cur.right!= null){
                    queue.add(cur.right);
                }
            }
            ans.add(a);
        }
        return ans;
    }
}