class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],i);
        }
        int[] ans = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        st.push(nums2[nums2.length-1]);
        ans[nums2.length-1] = -1;
        for(int i=nums2.length-2 ; i>=0 ;i--){
        while(!st.isEmpty() && nums2[i]>st.peek()){
            st.pop();
        }
        if(st.isEmpty()){
            ans[i] = -1;
        }
        else{
            ans[i] = st.peek();
        }
        st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = ans[hm.get(nums1[i])];
        }
        return nums1;
    }
}