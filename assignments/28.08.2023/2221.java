class Solution {
    public int triangularSum(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        int k = n;
        while(k-->0){
            for(int i=0;i<k;i++){
                arr[i] = (arr[i]+arr[i+1])%10;
            }
        }
        return arr[0];
    }
}