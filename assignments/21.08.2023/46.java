class Solution {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void solve(int[] nums,int idx,List<List<Integer>> ans){
        if(nums.length-1==idx){
            List<Integer> a = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                a.add(nums[i]);
            }
            ans.add(a);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            solve(nums,idx+1,ans);
            swap(nums,i,idx);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }
}