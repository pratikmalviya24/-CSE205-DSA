class Solution {
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[1];
        ans[0] = Integer.MIN_VALUE;
         helper(root,ans);
        return ans[0];
    }
    int helper(TreeNode root,int[] ans){
        if(root==null) return 0;
        int left = helper(root.left,ans);
        int right = helper(root.right,ans);

        //Ignoring the negative number::
        left = Math.max(0,left);
        right = Math.max(0,right);
        ans[0] = Math.max(left+right+root.val,ans[0]);
        return Math.max(left,right)+root.val;
    }
}