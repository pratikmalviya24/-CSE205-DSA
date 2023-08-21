class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list  = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        subSquence(n,list,ll,k);
        return ll;
    }

    private static void subSquence(int n, List<Integer> list, List<List<Integer>> ll,int k) {
        if(n==0){
            if(list.size()==k){
                ll.add(new ArrayList<>(list));
            }
            return ;
        }
        list.add(n);
        subSquence(n-1, list, ll, k);
        list.remove(list.size()-1);
        subSquence(n-1, list, ll, k);
    }
    
}