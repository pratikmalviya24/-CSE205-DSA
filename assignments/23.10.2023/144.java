class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while(true){
            while(root!=null){
                st.push(root);
                ans.add(root.val);
                root = root.left;
            }
            if(st.isEmpty()) break;
            root = st.pop();
            root = root.right;
        }
        return ans;
    }
}