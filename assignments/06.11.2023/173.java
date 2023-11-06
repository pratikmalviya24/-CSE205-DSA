class BSTIterator {
    TreeNode root;
    private ArrayList<Integer> list;
    private int idx;

    public BSTIterator(TreeNode root) {
        this.root = root;
        list = new ArrayList<>();
        inorder(root,list);
        idx = 0;
    }
    
    public int next() {
        return list.get(idx++);
    }
    private void inorder(TreeNode root,ArrayList<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public boolean hasNext() {
        return idx<list.size();
    }
}