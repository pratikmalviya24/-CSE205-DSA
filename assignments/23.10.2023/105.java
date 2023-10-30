class Solution {
    int ptr = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,preorder.length-1,hm);
    }

    public TreeNode helper(int[] preorder,int[] inorder,int start,int end,HashMap<Integer,Integer> hm){
        if(start>end){
            return null;
        }

        TreeNode root = new TreeNode(preorder[ptr++]);
        int pos = hm.get(root.val);
        root.left = helper(preorder,inorder,start,pos-1,hm);
        root.right = helper(preorder,inorder,pos+1,end,hm);
        return root;
    }
}