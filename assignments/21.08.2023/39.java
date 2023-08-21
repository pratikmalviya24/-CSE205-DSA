class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
         find(cand,ans,list,target,0);
         return ans;
    }
    private static void find(int[] num,List<List<Integer>> ans,List<Integer> list,int target,int i){
        if(i==num.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(num[i]<=target){
            list.add(num[i]);
            find(num,ans,list,target-num[i],i);
            list.remove(list.size()-1);
        }
        find(num,ans,list,target,i+1);
    }
}
