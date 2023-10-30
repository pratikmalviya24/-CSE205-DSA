class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll;
        if(root==null) return ans;
        int level = height(root)+1;
        for(int i=1;i<=level;i++){
            ll = new ArrayList<>();
            if(i%2==0){
                nthLevel(root,i,ll,true);
            }
            else{
                nthLevel(root,i,ll,false);
            }
            ans.add(ll);

        }
        return ans;
    }
    void nthLevel(TreeNode root,int n,List<Integer> ll,boolean b){
        if(root==null) return;
        if(n==1){
            ll.add(root.val);
            return;
        }
        if(!b){
            nthLevel(root.left,n-1,ll,b);
            nthLevel(root.right,n-1,ll,b);
        }
        else{
            nthLevel(root.right,n-1,ll,b);
            nthLevel(root.left,n-1,ll,b);
        }
    }
    int height(TreeNode root){
        if(root==null || root.left==null && root.right==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}