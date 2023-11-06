class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            root = helper(root,preorder[i]);
        }
        return root;
    }
    TreeNode helper(TreeNode root,int value){
        if(root==null){
            TreeNode node = new TreeNode(value);
            return node;
        }
        if(root.val>value){
            root.left = helper(root.left,value);
        }
        else if(root.val<value){
            root.right = helper(root.right,value);
        }
        return root;
    }
}