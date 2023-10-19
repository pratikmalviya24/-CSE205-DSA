class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = n*(n+1)/2;
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        } 
        return -arr[n-1]+sum;
    }
}