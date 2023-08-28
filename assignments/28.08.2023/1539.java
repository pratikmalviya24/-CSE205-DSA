class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 1;
        int t = 0;
        int temp = k;
        while(t!=arr.length){
            if(arr[t]==i){
            i++;
            t++;
            } 
            else{
                i++;
                k--;
            }
            if(k==0) break;
        }
        if(k!=0){
            t = arr[arr.length-1];
            while(k-->0){
                t++;
            }
            return t;
        }
        return i-1;
    }
}