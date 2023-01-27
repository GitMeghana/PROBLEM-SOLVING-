Binary Tree Zigzag Level Order Traversal --->

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        queue.add(root);
        boolean isForward = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> a = new ArrayList<>();
            for (int i =0;i<size; i++){
                TreeNode cur = queue.poll();
                
                if(isForward){
                    a.add(cur.val);
                }
                else {
                    a.add(0,cur.val);
                }
                if (cur.left!=null){
                    queue.add(cur.left);
                }
                if (cur.right!=null){
                    queue.add(cur.right);
                }    
            }
            isForward=!isForward;
            ans.add(a);
        }
        return ans;  
    }
}