class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        find(nums,target,0,ans,list);
        return ans;
    }
    private static void find(int[] nums,int target,int i,List<List<Integer>> ans,List<Integer> list){
        if(target<0) return;
        if(target==0) ans.add(new ArrayList<>(list));
        for(int j = i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            list.add(nums[j]);
            find(nums,target-nums[j],j+1,ans,list);
            list.remove(list.size()-1);
        }
    }
}