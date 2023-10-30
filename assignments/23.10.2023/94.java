import java.util.List;

import javax.swing.tree.TreeNode;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while(true){
            while(root!=null){
                st.push(root);
                root = root.left;
            }
            if(st.isEmpty()) break;
            root = st.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
}