class Solution {
    private class Node{
        TreeNode node;
        int hr; 
        int level;
        Node(TreeNode node,int hr,int level){
            this.node = node;
            this.hr = hr;
            this.level = level;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> tm = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root, 0, 0));
        while(!q.isEmpty()){
            Node curr =  q.remove();
            TreeNode temp = curr.node;
            int hr = curr.hr;
            int level = curr.level;
            if(!tm.containsKey(hr)){
                tm.put(hr, new TreeMap<>());
            }
            if(!tm.get(hr).containsKey(level)){
                tm.get(hr).put(level, new PriorityQueue<>());
            }
            tm.get(hr).get(level).add(temp.val);
            if(temp.left!=null){
                q.add(new Node(temp.left, hr-1, level+1));
            }
            if(temp.right!=null){
                q.add(new Node(temp.right, hr+1, level+1));
            }
        }
        for (TreeMap<Integer,PriorityQueue<Integer>> t : tm.values()) {
            ans.add(new ArrayList<>());
            for (PriorityQueue<Integer> node : t.values()) {
                while(!node.isEmpty()){
                    ans.get(ans.size()-1).add(node.remove());
                }
            }
        }
        return ans;
    }
}