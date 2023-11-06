class Solution {
    TreeNode first = null ;
    TreeNode second = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        helper(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        if(first==null && root.val<prev.val){
            first = prev;
        }
        if(first!=null && root.val<prev.val){
            second = root;
        }
        prev = root;
        helper(root.right);
    }
}