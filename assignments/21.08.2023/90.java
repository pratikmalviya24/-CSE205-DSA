class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list  = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        subSquence(nums,list,ll,0);
        return new ArrayList<>(ll);
    }

    private static void subSquence(int[] nums, List<Integer> list, List<List<Integer>> ll, int n) {
        if(nums.length==n){
            if(!ll.contains(list)){
            ll.add(new ArrayList<>(list));
            }
            return ;
        }
        list.add(nums[n]);
        subSquence(nums, list, ll, n+1);
        list.remove(list.size()-1);
        subSquence(nums, list, ll, n+1);
    }
}