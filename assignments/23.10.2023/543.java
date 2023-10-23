class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    private int height(TreeNode node){
        if(node==null) return 0;
        int leftNode = height(node.left);
        int rightNode = height(node.right);
        int dia = leftNode + rightNode+1;
        diameter  = Math.max(dia,diameter);
        return Math.max(leftNode,rightNode)+1;
    }
}