class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans,n,"(",1,0);
        return ans;
    }
    private static void generate( List<String> ans,int n,String p,int open,int close){
        if(p.length()==2*n){
            ans.add(p);
            return;
        }
        if(open<n){
            generate(ans,n,p+"(",open+1,close);
        }
        if(close<open){
            generate(ans,n,p+")",open,close+1);
        }
    }
}