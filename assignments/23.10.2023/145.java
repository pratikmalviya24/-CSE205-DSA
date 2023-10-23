class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
    LinkedList<Integer> result = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    while(true) {
        while(root!=null) {
            stack.push(root);
            result.addFirst(root.val);  
            root = root.right;          
        } 
        if(stack.isEmpty()) break;
        TreeNode node = stack.pop();
        root = node.left;       
        
    }
    return result;
    }
}