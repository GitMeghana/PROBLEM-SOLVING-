Binary Tree Rightside View --->

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i<size;i++){
                TreeNode cur = queue.poll();
                if (i  == 0)
                ans.add(cur.val);
                if (cur.right!= null){
                    queue.add(cur.right);
                }
                if (cur.left!= null){
                    queue.add(cur.left);
                }
            }
        }
        return ans;   
    }
}